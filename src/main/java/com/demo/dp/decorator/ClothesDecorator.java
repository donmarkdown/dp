package com.demo.dp.decorator;

/**
 * @ Author     ：qupengcheng
 * @ Date       ：20:42 2019/10/28
 * @ Description：
 * @ Modified By：
 */
public abstract class ClothesDecorator extends Personable {

    private Personable personable;

    public void setPersonable(Personable personable) {
        this.personable = personable;
    }

    @Override
    void operate() {
        personable.operate();
    }
}
