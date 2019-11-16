package com.demo.dp.oauth2.service;

import com.demo.dp.oauth2.dto.CustomUserDetails;
import com.demo.dp.oauth2.dto.UserDTO;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {


    /**
     * 实现UserDetailsService中的loadUserByUsername方法，用于加载用户数据
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserDTO user = new UserDTO();
        user.setUserName("admin");
        user.setPassWord("admin");


        return new CustomUserDetails(user);
    }
}
