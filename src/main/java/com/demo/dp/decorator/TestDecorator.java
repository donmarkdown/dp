package com.demo.dp.decorator;

/**
 * @ Author     ：qupengcheng
 * @ Date       ：20:49 2019/10/28
 * @ Description：
 * @ Modified By：
 */
public class TestDecorator {
    public static void main(String[] args) {

        WoManPerson woManPerson = new WoManPerson();
        GraceClothes graceClothes = new GraceClothes();
        graceClothes.setPersonable(woManPerson);

        graceClothes.operate();
    }
}
