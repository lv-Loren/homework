/**
 * Project Name:dt59mehomework
 * File Name:qaz.java
 * Package Name:lession1.lession180108
 * Date:2018年1月8日下午11:38:22
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package lession1.lession180108;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月8日 上午10:40:53 <br/>
 * 
 * @author lvwei
 * @version
 * @see
 */
public class FuLei1 implements Runnable {
    private final static Logger LOG = Logger.getLogger(FuLei1.class);

    private int i1;

    String st;

    public String getSt() {
        return st;
    }

    public void setSt(String st) {
        this.st = st;
    }

    public FuLei1(int i1) {
        this.i1 = i1;
    }

    public void run() {
        LOG.info("正在第" + i1 + "次重写" + st);

    }

}
