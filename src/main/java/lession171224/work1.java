/**
 * Project Name:workspace1
 * File Name:work1.java
 * Package Name:lession171224
 * Date:2017年12月24日下午2:50:09
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package lession171224;

/**
 * Description: <br/>
 * Date: 2017年12月24日 下午2:50:09 <br/>
 * 
 * @author lvwei
 * @version
 * @see
 */
public class work1 {
    String name;

    int age;

    String color;

    void eat() {
        System.out.println("吃了一条鱼");
    }

    void sleep() {
        System.out.println("在床上睡觉");
    }

    int jiaosheng() {
        return 3;
    }

    public static void main(String[] args) {

        // Auto-generated method stub
        work1 cat = new work1();
        cat.name = "小黑";
        cat.age = 12;
        cat.color = "黑白";
        System.out.println("小猫叫什么：" + cat.name);
        System.out.println("小黑多大了：" + cat.age);
        System.out.println("小黑身上有哪些颜色：" + cat.color);
        cat.eat();
        cat.sleep();
        System.out.println("小黑睡觉时叫了几声：" + cat.jiaosheng());

    }

}
