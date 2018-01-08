/**
 * Project Name:dt59mehomework
 * File Name:qaz.java
 * Package Name:lession1.lession180108
 * Date:2018年1月8日下午11:40:16
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package lession1.lession180108;


/**
 * Description: <br/>
 * Date: 2018年1月8日 上午10:26:23 <br/>
 * 
 * @author lvwei
 * @version
 * @see
 */
public class FuLeiDemo {

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            FuLei fu = new FuLei(i);
            fu.start();
            if (i % 3 == 0) {
                fu.setSt("vip");
                fu.setPriority(Thread.MAX_PRIORITY);
            }

        }
        FuLei fu1 = new FuLei(11);
        fu1.start();

    }
}
