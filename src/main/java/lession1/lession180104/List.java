/**
 * Project Name:dt59mehomework
 * File Name:List.java
 * Package Name:lession1.lession180104
 * Date:2018年1月4日下午6:48:09
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package lession1.lession180104;

import java.util.ArrayList;
import java.util.Iterator;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月4日 下午4:04:30 <br/>
 * 
 * @author lvwei
 * @version
 * @see
 */
public class List {
    private final static Logger LOG = Logger.getLogger(List.class);

    public static void main(String[] args) {
        java.util.List list = new ArrayList();
        // List list = new ArrayList();出现报错
        list.add(1);
        list.add(2);
        list.add(3);
        LOG.info("元素个数为：" + list.size());
        list.add(4);
        // 添加一个元素
        // 元素个数+1 有4个元素
        LOG.info("元素个数为：" + list.size());
        LOG.info("第三个元素是：" + list.get(2));
        list.add(2, "31");
        // 在第三个元素位置添加一个元素为 31；
        // 元素个数+1 有5个元素
        LOG.info("元素个数为：" + list.size());
        LOG.info("第三个元素是：" + list.get(2));
        LOG.info("第四个元素是：" + list.get(3));
        list.set(2, "32");
        // 把第三个元素修改为 32；
        LOG.info("第三个元素是：" + list.get(2));
        list.remove(3);
        // 移除当前第四个元素 元素个数为4
        LOG.info("第三个元素是：" + list.get(2));
        LOG.info("元素个数为：" + list.size());
        Iterator ite = list.iterator();
        int i = 1;
        while (ite.hasNext()) {
            LOG.info("运行正常");
            LOG.info("取第" + (i++) + "个值：" + ite.next());

        }

    }
}
