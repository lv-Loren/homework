/**
 * Project Name:dt59homework
 * File Name:Call.java
 * Package Name:lession1.lession180103
 * Date:2018年1月3日下午6:40:29
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package lession1.lession180103;

/**
 * Description: <br/>
 * Date: 2018年1月3日 下午4:42:09 <br/>
 * 
 * @author lvwei
 * @version
 * @see
 */
public class Call implements Iphone, Money {
    public void Tell() {
        System.out.print("打电话");
    }

    public void Sms() {
        System.out.print("发短信");
    }

    public String money() {
        return "要钱";
    }

    public String nomoney() {
        return "不要钱";
    }

}
