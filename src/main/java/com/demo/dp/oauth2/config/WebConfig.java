package com.demo.dp.oauth2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

/**
 * @author qupengcheng
 * @description
 * @date 14:35 2019/11/16
 */

@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true, proxyTargetClass = true)
public class WebConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .anyRequest().authenticated().and()
                // custom token authorize exception handler
                .exceptionHandling()

//                .authenticationEntryPoint(unauthorizedHandler)
                .and()
                // since we use jwt, session is not necessary
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
                // since we use jwt, csrf is not necessary
                .csrf().disable();
        // 可以自定义过滤
        // http.addFilterBefore(new JwtAuthenticationTokenFilter(tokenProvider), UsernamePasswordAuthenticationFilter.class);

        // disable cache
        http.headers().cacheControl();
    }


    /**
     * 需要配置这个支持password模式 support password grant type
     * @return
     * @throws Exception
     */
    @Override
    @Bean
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }
}

