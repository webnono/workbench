package com.webnono.web.controller;

import com.webnono.core.Util.PasswordHelper;
import com.webnono.core.pagehelper.PageModel;
import com.webnono.core.pagehelper.PageQueryModel;
import com.webnono.web.model.User;
import com.webnono.web.model.UserCriteria;
import com.webnono.web.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

/**
 * Created by Administrator on 2015/12/28.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    UserService userService;
    @RequestMapping(value = "/list", method = {RequestMethod.GET})
    public String userList(PageQueryModel pageQueryModel, Model model){
        UserCriteria criteria = new UserCriteria();
        criteria.setOrderByClause("id desc");
        PageModel<User> pageData = userService.getUserByCriteria(pageQueryModel, criteria);
        model.addAttribute("pageData", pageData);
        return "userList";
    }

    @RequestMapping(value = "/resetPassword", method = {RequestMethod.GET})
    public String resetView(@RequestParam(value = "id", required = false) Long id, Model model){
        model.addAttribute("id", id);
        return "resetPassword";
    }

    @RequestMapping(value = "/resetPassword", method = {RequestMethod.POST})
    public String doReset(@RequestParam(value = "id", required = false) Long id,
                          @RequestParam(value = "new_password", required = true) String password1,
                          @RequestParam(value = "new_password1", required = true) String password2,
                          Model model){

        if (password1.equals(password2)){

            User oldUser = userService.selectById(id);
            User user = new User(oldUser.getUsername(),password1);
            PasswordHelper passwordHelper = new PasswordHelper();
            passwordHelper.encryptPassword(user);
            user.setId(oldUser.getId());
            user.setLocked(oldUser.getLocked());
            user.setRoleIds(oldUser.getRoleIds());
            userService.update(user);
            Subject subject = SecurityUtils.getSubject();
            subject.logout();
            return "success";
        }else {
            return "/user/list";
        }

    }

    @RequestMapping(value = "save", method = {RequestMethod.GET})
    public String saveView(){

        return "userAdd";
    }

    @RequestMapping(value = "save", method = {RequestMethod.POST})
    public String doSave(@Valid User user, BindingResult bindingResult, Model model){
        if (bindingResult.hasErrors()) return "userAdd";
        PasswordHelper passwordHelper = new PasswordHelper();
        passwordHelper.encryptPassword(user);
        user.setRoleIds("1");
        user.setLocked(false);
        userService.insert(user);
        return "redirect:/user/list";
    }

    @RequestMapping(value = "delete", method = {RequestMethod.POST})
    public String dodelete(@RequestParam(value = "id", required = false) Long[] ids, Model model){
        System.out.println(ids.length);
        if (ids.length > 0){
            for(int i = 0; i < ids.length; i++){
                User user = userService.selectById(ids[i]);
                if ("admin".equals(user.getUsername())){
                    model.addAttribute("error", "不能删除admin用户");
                    return "redirect:/user/list";
                }
                System.out.println(ids[i]);
                userService.delete(ids[i]);
            }
            return "redirect:/user/list";
        }else {
            model.addAttribute("error", "admin用户不能删除");
            return "redirect:/user/list";
        }


    }
}
