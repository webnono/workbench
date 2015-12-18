package com.webnono.web.controller;

import com.webnono.web.model.User;
import com.webnono.web.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

/**
 * Created by Administrator on 2015/12/18.
 */
@Controller
public class LoginController {

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String loginView(Model model){

        model.addAttribute("user",new User());
        return "login";

    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String doLogin(@Valid User user,BindingResult bindingResult,Model model){
        if (bindingResult.hasErrors())return "login";

        try {
            Subject subject = SecurityUtils.getSubject();

            if (subject.isAuthenticated()){
                return "redirect:/index";
            }

            subject.login(new UsernamePasswordToken(user.getUsername(),user.getPassword()));
            return "redirect:/index";
        }catch (UnknownAccountException e){
            model.addAttribute("error","用户名或密码错误");
            model.addAttribute("user",user);
            return "login";
        }catch (IncorrectCredentialsException e){
            model.addAttribute("error","用户名或密码错误");
            model.addAttribute("user",user);
            return "login";
        }
    }

    @RequestMapping(value = "/logout",method = RequestMethod.GET)
    public String logout(User user){

        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        return "login";
    }
}
