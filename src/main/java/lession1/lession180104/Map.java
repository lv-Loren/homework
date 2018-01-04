/**
 * Project Name:dt59mehomework
 * File Name:Map.java
 * Package Name:lession1.lession180104
 * Date:2018年1月4日下午6:49:27
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package lession1.lession180104;

import java.util.HashMap;
import java.util.Iterator;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月4日 下午5:10:37 <br/>
 * 
 * @author lvwei
 * @version
 * @see
 */
public class Map {
    private final static Logger LOG = Logger.getLogger(Map.class);

    public static void main(String[] args) {

        // Auto-generated method stub
        java.util.Map map = new HashMap();
        map.put("33", "CC");
        map.put("11", "AA");
        map.put("22", "BB");
        LOG.info(map.get("33"));
        map.put("33", "DD");
        LOG.info(map.get("33"));
        map.remove("22");
        LOG.info(map.get("22"));
        map.put("44", "EE");

        // Set set = map.entrySet();
        // for (Object obj : set) {
        // System.out.println(obj);
        // }
        Iterator maps = map.keySet().iterator();
        while (maps.hasNext()) {
            LOG.info(maps.next());
        }
        Iterator maps1 = map.values().iterator();
        while (maps1.hasNext()) {
            LOG.info(maps1.next());
        }
        Iterator maps2 = map.entrySet().iterator();
        while (maps2.hasNext()) {
            LOG.info(maps2.next());
        }

    }
}
