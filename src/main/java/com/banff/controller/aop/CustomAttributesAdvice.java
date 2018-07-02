package com.banff.controller.aop;

import com.banff.config.CustomAttributesConfig;
import com.banff.mongo.model.UserBean;
import com.banff.mongo.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.security.Principal;

/**
 * 自定义属性
 */
@ControllerAdvice
@AllArgsConstructor
public class CustomAttributesAdvice {

    private final CustomAttributesConfig customAttributesConfig;

    private final UserService userService;

    /**
     * 全局 Model 中添加自定义属性
     */
    @ModelAttribute("custom")
    public CustomAttributesConfig customAttributes(){
        return customAttributesConfig;
    }

    /**
     * 全局 Model 中添加用户信息
     */
    @ModelAttribute("user")
    public UserBean userAttributes(Principal principal){
        if (principal == null){
            return null;
        }
        String username = principal.getName();
        return userService.getByUsername(username);
    }

}
