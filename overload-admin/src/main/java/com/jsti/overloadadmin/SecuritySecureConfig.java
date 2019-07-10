package com.jsti.overloadadmin;

import de.codecentric.boot.admin.server.config.AdminServerProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author wangxiaoxiang
 * @createTime 6/24/2019 16:42
 */
@Configuration
@EnableWebSecurity
public class SecuritySecureConfig extends WebSecurityConfigurerAdapter {

    private final String adminContextPath;

    public SecuritySecureConfig(AdminServerProperties adminServerProperties) {
        this.adminContextPath = adminServerProperties.getContextPath();
    }


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        return;
//        SavedRequestAwareAuthenticationSuccessHandler successHandler = new SavedRequestAwareAuthenticationSuccessHandler();
//        successHandler.setTargetUrlParameter("redirectTo");
//        successHandler.setDefaultTargetUrl(adminContextPath + "/");
//
//        http.authorizeRequests()
//                .antMatchers(adminContextPath + "/assets/**").permitAll()
//                .antMatchers(adminContextPath + "/login").permitAll()
//                .anyRequest().authenticated()
//                .and()
//                .formLogin().loginPage(adminContextPath + "/login").successHandler(successHandler).and()
//                .logout().logoutUrl(adminContextPath + "/logout").and()
//                .httpBasic().and()
//                .csrf()
//                .disable();
    }

}