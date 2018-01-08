/**
 * Project Name:dt59mehomework
 * File Name:qwe.java
 * Package Name:lession1.lession180108
 * Date:2018年1月8日下午11:37:24
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package lession1.lession180108;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月8日 上午10:16:04 <br/>
 * 
 * @author lvwei
 * @version
 * @see
 */
public class FuLei extends Thread {
    private int i;

    String st;

    public String getSt() {
        return st;
    }

    public void setSt(String st) {
        this.st = st;
    }

    private final static Logger LOG = Logger.getLogger(FuLei.class);

    public FuLei(int i) {
        this.i = i;
    }

    public void run() {
        LOG.info("正在第" + i + "次重写" + st);
    }
}
