/**
 * Project Name:dt59mehomework
 * File Name:FileDemo.java
 * Package Name:lession1.lession180107
 * Date:2018年1月7日下午7:42:42
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package lession1.lession180107;

import java.io.File;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月7日 下午5:53:55 <br/>
 * 
 * @author lvwei
 * @version
 * @see
 */
public class FileDemo {
    private final static Logger LOG = Logger.getLogger(FileDemo.class);

    public static void listDir(String path) {
        File file1 = new File(path);
        LOG.info("目录：" + file1.getAbsolutePath());
        String[] file2 = file1.list();
        for (String name : file2) {
            StringBuffer fullPath = new StringBuffer();
            fullPath.append(path);
            fullPath.append(File.separator);
            fullPath.append(name);
            File tmpFile = new File(fullPath.toString());

            if (tmpFile.isDirectory()) {

                listDir(tmpFile.toString());

            } else {
                LOG.info("文件：" + fullPath.toString());
            }
        }
    }

    public static void main(String[] args) {
        String path = "D:\\360Downloads\\ADSafe";
        listDir(path);
    }
}
