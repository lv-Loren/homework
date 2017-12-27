/**
 * Project Name:dt59homework
 * File Name:work2A.java
 * Package Name:lession1.lession171227
 * Date:2017年12月27日下午3:10:24
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package lession1.lession171227;

/**
 * Description: <br/>
 * Date: 2017年12月27日 下午3:10:24 <br/>
 * 
 * @author lvwei
 * @version
 * @see
 */
public class work2A {
    public int getInt = 1;

    public String getString = "小白";

    public work2A() {
        System.out.println(this.getInt);
        System.out.println(this.getString);
        this.getInt = 2;
        this.getString = "小黑";
        System.out.println(this.getInt);
        System.out.println(this.getString);
    }

    public static void main(String[] args) {
        work2A work = new work2A();

    }

}
