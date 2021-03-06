package org.neuedu.hisjava.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.neuedu.hisjava.model.RespBean;
import org.neuedu.hisjava.model.UserBean;
import org.neuedu.hisjava.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.*;
import org.springframework.security.config.annotation.ObjectPostProcessor;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.access.intercept.FilterSecurityInterceptor;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
//    @Autowired
//    UserService userService;
//    @Autowired
//    MyFilter myFilter;
//    @Autowired
//    MyAsessDesionManager myAsessDesionManager;
//    @Bean
//    PasswordEncoder passwordEncoder(){
//        return new BCryptPasswordEncoder();
//    }
//    @Override
//    public void configure(WebSecurity web) throws Exception {
//        web.ignoring().antMatchers("/login");
//    }
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(userService);
//    }
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                .withObjectPostProcessor(new ObjectPostProcessor<FilterSecurityInterceptor>() {
//                    @Override
//                    public <O extends FilterSecurityInterceptor> O postProcess(O o) {
//                        o.setAccessDecisionManager(myAsessDesionManager);
//                        o.setSecurityMetadataSource(myFilter);
//                        return o;
//                    }
//                })
//                .and()
//                .formLogin()
//                .loginPage("/login")
//                .loginProcessingUrl("doLogin")
//                .passwordParameter("password")
//                .usernameParameter("username")
//                .successHandler(new AuthenticationSuccessHandler() {
//                    @Override
//                    public void onAuthenticationSuccess(HttpServletRequest req, HttpServletResponse resp, Authentication auth) throws IOException, ServletException {
//                        resp.setContentType("application/json;charset=utf-8");
//                        PrintWriter writer =resp.getWriter();
//                        UserBean user = (UserBean) auth.getPrincipal();
//                        user.setPassword(null);
//                        RespBean ok = RespBean.ok(200,"登录成功",user);
//                        writer.print(new ObjectMapper().writeValueAsString(ok));
//                        writer.flush();
//                        writer.close();
//                    }
//                })
//                .failureHandler(new AuthenticationFailureHandler() {
//                    @Override
//                    public void onAuthenticationFailure(HttpServletRequest req, HttpServletResponse resp, AuthenticationException e) throws IOException, ServletException {
//                        resp.setContentType("application/json;charset=utf-8");
//                        PrintWriter writer = resp.getWriter();
//                        RespBean error = null;
//                        if(e instanceof BadCredentialsException){
//                            error=RespBean.error(500,"用户名或者密码错误");
//                        }else if(e instanceof LockedException){
//                            error=RespBean.error(500,"用户被锁定，请联系管理员");
//                        }else if(e instanceof DisabledException){
//                            error=RespBean.error(500,"用户被禁用，请联系管理员");
//                        }else if(e instanceof AccountExpiredException){
//                            error=RespBean.error(500,"用户已过期，请联系管理员");
//                        }else if(e instanceof CredentialsExpiredException){
//                            error=RespBean.error(500,"用户密码已过期，请联系管理员");
//                        }else{error=RespBean.error(500,"未知错误");}
//                        writer.print(new ObjectMapper().writeValueAsString(error));
//                        writer.flush();
//                        writer.close();
//                    }
//                })
//                .permitAll()
//                .and()
//                .logout()
//                .logoutUrl("/logout")
//                .logoutSuccessHandler(new LogoutSuccessHandler() {
//                    @Override
//                    public void onLogoutSuccess(HttpServletRequest req, HttpServletResponse resp, Authentication auth) throws IOException, ServletException {
//                        resp.setContentType("application/json;charset=utf-8");
//                        PrintWriter writer =resp.getWriter();
//                        RespBean ok = RespBean.ok(200,"注销成功");
//                        writer.print(new ObjectMapper().writeValueAsString(ok));
//                        writer.flush();
//                        writer.close();
//                    }
//                })
//                .permitAll()
//                .and()
//                .csrf().disable();
//    }
@Autowired
UserService userService;
    @Autowired
    MyFilter myFilter;
    @Autowired
    MyAsessDesionManager myAsessDesionManager;
    @Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userService);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
//                .anyRequest().authenticated()
                .withObjectPostProcessor(new ObjectPostProcessor<FilterSecurityInterceptor>() {
                    @Override
                    public <O extends FilterSecurityInterceptor> O postProcess(O o) {
                        o.setAccessDecisionManager(myAsessDesionManager);
                        o.setSecurityMetadataSource(myFilter);
                        return o;
                    }
                })
                .and()
                .formLogin()
                .loginPage("/login")
                .loginProcessingUrl("/doLogin")
                .usernameParameter("username")
                .passwordParameter("password")
                .successHandler(new AuthenticationSuccessHandler() {
                    @Override
                    public void onAuthenticationSuccess(HttpServletRequest req, HttpServletResponse resp, Authentication auth) throws IOException, ServletException {
                        resp.setContentType("application/json;charset=utf-8");
                        PrintWriter writer = resp.getWriter();
                        UserBean user = (UserBean) auth.getPrincipal();
                        user.setPassword(null);
                        RespBean ok = RespBean.ok(200,"登录成功",user);
                        writer.print(new ObjectMapper().writeValueAsString(ok));
                        writer.flush();
                        writer.close();
                    }
                })
                .failureHandler(new AuthenticationFailureHandler() {
                    @Override
                    public void onAuthenticationFailure(HttpServletRequest req, HttpServletResponse resp, AuthenticationException e) throws IOException, ServletException {
                        resp.setContentType("application/json;charset=utf-8");
                        PrintWriter writer = resp.getWriter();
                        RespBean error =null;
                        if(e instanceof BadCredentialsException){
                            error=RespBean.error(500,"用户名或者密码错误，请重新输入");
                        }else if(e instanceof LockedException){error=RespBean.error(500,"用户被锁定，请联系管理员");}
                        else if(e instanceof DisabledException){error=RespBean.error(500,"用户被禁用，请联系管理员");}
                        else if(e instanceof CredentialsExpiredException){error=RespBean.error(500,"用户密码过期，请联系管理员");}
                        else if(e instanceof AccountExpiredException){error=RespBean.error(500,"用户名过期，请联系管理员");}
                        else{
                            error =RespBean.error(500,"未知错误");
                        }
                        writer.print(new ObjectMapper().writeValueAsString(error));
                        writer.flush();
                        writer.close();
                    }
                })
                .permitAll()
                .and()
                .logout()
                .logoutUrl("/logout")
                .logoutSuccessHandler(new LogoutSuccessHandler() {
                    @Override
                    public void onLogoutSuccess(HttpServletRequest req, HttpServletResponse resp, Authentication authentication) throws IOException, ServletException {
                        resp.setContentType("application/json;charset=utf-8");
                        PrintWriter writer = resp.getWriter();
                        RespBean ok = RespBean.ok(200,"注销成功");
                        writer.print(new ObjectMapper().writeValueAsString(ok));
                        writer.flush();
                        writer.close();
                    }
                })
                .permitAll()
                .and()
                .csrf().disable();
    }
}
