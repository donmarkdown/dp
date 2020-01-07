package com.demo.dp.prototype;

/**
 * @ Author     ：qupengcheng
 * @ Date       ：18:45 2019/10/30
 * @ Description：
 * @ Modified By：
 */


import java.util.ArrayList;
import java.util.List;

/**
 * 原型模式
 *
 * @(拷贝 int ,long,char等) (不拷贝 String,内部数组，引用对象)
 * @ final与clone()方法互斥
 *
 * @author Administrator
 *
 */
public class Brother implements Cloneable {
    /**
     * 姓名
     */
    private String name;
    /**
     * 年龄
     */
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     *
     */
    public void exect() {

        System.out.println("姓名:" + getName() + " 年龄=" + getAge());
    }

    private List<String> mData = new ArrayList<String>();

    public void setValue(String value) {
        mData.add(value);
    }

    public List<String> getValue() {
        return mData;
    }

    @SuppressWarnings("unchecked")
    @Override
    public Brother clone() {
        // TODO Auto-generated method stub
        Brother object = null;
        try {
            object = (Brother) super.clone();
//			object.mData = (ArrayList<String>) this.mData.clone(); //深拷贝
        } catch (CloneNotSupportedException e) {
            // TODO: handle exception
            System.out.println(e);
        }

        return object;
    }


    public static void main(String[] args) {

        // 原型模式
        Brother brother = new Brother();
        brother.setValue("哥哥");
        Brother brother1 = brother.clone();
        brother1.setValue("弟弟");
        System.out.println("list = "+brother.getValue());
        System.out.println("list = "+brother1.getValue());
    }

}
