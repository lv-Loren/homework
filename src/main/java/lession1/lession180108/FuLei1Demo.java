/**
 * Project Name:dt59mehomework
 * File Name:qaz.java
 * Package Name:lession1.lession180108
 * Date:2018年1月8日下午11:39:28
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package lession1.lession180108;


/**
 * Description: <br/>
 * Date: 2018年1月8日 上午10:48:08 <br/>
 * 
 * @author lvwei
 * @version
 * @see
 */
public class FuLei1Demo {

    public static void main(String[] args) {

        for (int i1 = 0; i1 < 20; i1++) {
            FuLei1 fu1 = new FuLei1(i1);
            new Thread(fu1).start();
            if (i1 % 3 == 0) {
                fu1.setSt("vip");
                new Thread(fu1).setPriority(Thread.MIN_PRIORITY);
            }
        }
        FuLei fu1 = new FuLei(11);
        fu1.start();

    }
}
