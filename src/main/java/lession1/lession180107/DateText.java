/**
 * Project Name:dt59mehomework
 * File Name:DateText.java
 * Package Name:lession1.lession180107
 * Date:2018年1月7日下午7:37:41
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package lession1.lession180107;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月7日 下午4:38:35 <br/>
 * 
 * @author lvwei
 * @version
 * @see
 */
public class DateText {
    private final static Logger LOG = Logger.getLogger(DateText.class);

    public static void main(String[] args) {
        Date date1 = new Date(2018 - 1900, 1 - 1, 6);
        LOG.info(date1);

        SimpleDateFormat si = new SimpleDateFormat("YYYY年MM月dd日 HH:mm:ss.SSSZ" + "");
        String time = si.format(date1);
        LOG.info(time);

        long cur = System.currentTimeMillis();
        Date date2 = new Date(cur);
        LOG.info(si.format(date2));

    }
}
