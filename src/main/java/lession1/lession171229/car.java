/**
 * Project Name:dt59homework
 * File Name:car.java
 * Package Name:lession1.lession171229
 * Date:2017年12月29日下午6:42:29
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package lession1.lession171229;

/**
 * Description: <br/>
 * Date: 2017年12月29日 下午6:42:29 <br/>
 * 
 * @author lvwei
 * @version
 * @see
 */
public abstract class car {
    private String name;

    private char color;

    public car() {
        System.out.println(this.name + "的颜色是" + this.color + "色的");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getColor() {
        return color;
    }

    public void setColor(char color) {
        this.color = color;
    }

    public void summary() {
        System.out.println(this.name + "的颜色是" + this.color + "色的");
    }

}
