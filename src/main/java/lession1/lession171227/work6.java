/**
 * Project Name:dt59homework
 * File Name:work6.java
 * Package Name:lession1.lession171227
 * Date:2017年12月27日下午5:23:28
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package lession1.lession171227;

/**
 * Description: <br/>
 * Date: 2017年12月27日 下午5:23:28 <br/>
 * 
 * @author lvwei
 * @version
 * @see
 */
public class work6 {

    int i1;

    static int i2;

    public int s1() {
        return i2 + i1;
        // 实例方法中，可以同时使用实例变量和静态变量
    }

    public static int s2() {
        return i2 + i1;
        // 静态方法中，只能使用静态变量，不能使用实例变量
    }

    public static void main(String[] args) {

        // Auto-generated method stub
        System.out.println(work6.i2);
        System.out.println(work6.s2());
        // 在main方法中，静态方法和静态变量可以直接使用
        work6 work = new work6();
        System.out.println(work.i1);
        System.out.println(work6.i1());
        // 在main方法中，实例变量必须使用new方法后，才能被调出来使用

    }
}
