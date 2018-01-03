/**
 * Project Name:dt59homework
 * File Name:Exception1.java
 * Package Name:lession1.lession180103
 * Date:2018年1月3日下午6:44:20
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package lession1.lession180103;

import java.util.Scanner;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月3日 下午5:33:25 <br/>
 * 
 * @author lvwei
 * @version
 * @see
 */
public class Exception1 {
    private final static Logger LOG = Logger.getLogger(Exception1.class);

    public static void main(String[] args) {
        LOG.info("请输入一组字符串信息");
        Scanner sc = new Scanner(System.in);
        try {
            String st = sc.next();
            int i = st.length();
            if (i < 3) {
                throw new NullPointerException("空指针异常");
            }
        } catch (NullPointerException n1) {
            LOG.info(n1);
        } finally {
            sc.close();
        }
    }
}
