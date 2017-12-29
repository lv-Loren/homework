/**
 * Project Name:dt59homework
 * File Name:xiaocar.java
 * Package Name:lession1.lession171229
 * Date:2017年12月29日下午6:44:20
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package lession1.lession171229;


/**
 * Description: <br/>
 * Date: 2017年12月29日 下午6:44:20 <br/>
 * 
 * @author lvwei
 * @version
 * @see
 */
public class xiaocar extends car {
    public xiaocar(String name, char color) {
        setName(name);
        setColor(color);
    }

    public static void main(String[] args) {
        xiaocar xiao = new xiaocar("小汽车", '红');
        xiao.summary();
    }
}
