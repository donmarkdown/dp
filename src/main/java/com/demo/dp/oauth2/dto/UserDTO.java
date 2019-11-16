package com.demo.dp.oauth2.dto;

/**
 * @author qupengcheng
 * @description
 * @date 21:04 2019/11/15
 */
public class UserDTO {

    private String userName;
    private String passWord;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
