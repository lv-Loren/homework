/**
 * Project Name:dt59homework
 * File Name:haoche.java
 * Package Name:lession1.lession171229huxury
 * Date:2017年12月29日下午6:51:17
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package lession1.lession171229huxury;

import lession1.lession171229.car;

/**
 * Description: <br/>
 * Date: 2017年12月29日 下午6:51:17 <br/>
 * 
 * @author lvwei
 * @version
 * @see
 */
public class haoche extends car {
    public haoche(String name, char color) {
        setName(name);
        setColor(color);
    }

    public void summary() {
        System.out.println("我是豪车" + this.getName() + "的颜色是" + this.getColor() + "色的");
    }

    public static void main(String[] args) {
        haoche hao = new haoche("豪车", '红');
        hao.summary();
    }
}
