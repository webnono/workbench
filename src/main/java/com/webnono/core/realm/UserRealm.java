package com.webnono.core.realm;

import com.webnono.web.model.User;
import com.webnono.web.service.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 自定义Realm
 */
public class UserRealm extends AuthorizingRealm {

    @Autowired
    private UserService userService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        String username = (String)principals.getPrimaryPrincipal();
System.out.println("需要获取权限的用户名:"+username);
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        authorizationInfo.addRoles(userService.selectRoles(username));
        authorizationInfo.addStringPermissions(userService.selectPermissions(username));
System.out.println(authorizationInfo.getRoles());
System.out.println(authorizationInfo.getStringPermissions());
        return authorizationInfo;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

        String username = (String)token.getPrincipal();


        User user = userService.selectByUsername(username);

        if (user == null){
            throw new UnknownAccountException();//没有该账号
        }
        if (Boolean.TRUE.equals(user.getLocked())){
            throw new LockedAccountException();//账号锁定
        }


        //交给AuthenticationRealm使用CredentialsMatcher进行密码匹配，如果觉得不好，可以自定义实现
        SaltedAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
                user.getUsername(),//用户名
                user.getPassword(),//密码
                ByteSource.Util.bytes(user.getSalt()),//salt=username+salt
                getName()//realm name
        );
        return authenticationInfo;
    }

    @Override
    public void clearCachedAuthorizationInfo(PrincipalCollection principals) {
        super.clearCachedAuthorizationInfo(principals);
    }

    @Override
    public void clearCachedAuthenticationInfo(PrincipalCollection principals) {
        super.clearCachedAuthenticationInfo(principals);
    }

    @Override
    public void clearCache(PrincipalCollection principals) {
        super.clearCache(principals);
    }

    public void clearAllCachedAuthorizationInfo() {
        getAuthorizationCache().clear();
    }

    public void clearAllCachedAuthenticationInfo() {
        getAuthenticationCache().clear();
    }

    public void clearAllCache() {
        clearAllCachedAuthenticationInfo();
        clearAllCachedAuthorizationInfo();
    }

}
