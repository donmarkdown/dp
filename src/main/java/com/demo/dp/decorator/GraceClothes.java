package com.demo.dp.decorator;

/**
 * @ Author     ：qupengcheng
 * @ Date       ：20:43 2019/10/28
 * @ Description：
 * @ Modified By：
 */
public class GraceClothes extends ClothesDecorator {

    void operate() {
        System.out.print("衣着优雅");
        super.operate();
    }
}
