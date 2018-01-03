/**
 * Project Name:dt59homework
 * File Name:TestIphone.java
 * Package Name:lession1.lession180103
 * Date:2018年1月3日下午6:43:03
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package lession1.lession180103;


/**
 * Description: <br/>
 * Date: 2018年1月3日 下午4:45:33 <br/>
 * 
 * @author lvwei
 * @version
 * @see
 */
public class TestIphone {

    public static void main(String[] args) {
        Iphone iphone = new Call();
        Money iphone1 = new Call();
        iphone.Tell();
        System.out.println(iphone1.money());
        iphone.Sms();
        System.out.println(iphone1.nomoney());

    }
}
