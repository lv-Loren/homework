/**
 * Project Name:dt59homework
 * File Name:dakache.java
 * Package Name:lession1.lession171229
 * Date:2017年12月29日下午6:43:07
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package lession1.lession171229;


/**
 * Description: <br/>
 * Date: 2017年12月29日 下午6:43:07 <br/>
 * 
 * @author lvwei
 * @version
 * @see
 */
public class dakache extends car {
    public dakache(String name, char color) {
        setName(name);
        setColor(color);
    }

    public static void main(String[] args) {
        dakache da = new dakache("大卡车", '黄');
        da.summary();
    }
}
