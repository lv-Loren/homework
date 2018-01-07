/**
 * Project Name:dt59mehomework
 * File Name:CopyText1.java
 * Package Name:lession1.lession180107
 * Date:2018年1月7日下午7:40:59
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package lession1.lession180107;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Description: <br/>
 * Date: 2018年1月7日 下午3:56:25 <br/>
 * 
 * @author lvwei
 * @version
 * @see
 */
public class CopyText1 {
    public static void copy1() throws IOException {
        // 选择要copy到的地址
        FileWriter file1 = new FileWriter("E:\\\\Java\\workspace\\workspace1\\src\\lession180107\\deom_copy.txt");
        // 选择读取文件地址
        FileReader file2 = new FileReader("E:\\Java\\workspace\\workspace1\\src\\lession180107\\deom.txt");
        int i = 0;
        while ((i = file2.read()) != -1) {// 开始读取file2里面的字符
            file1.write(i);// 每读取一个，在file文件里写一个
        }
        file1.close();
        file2.close();
        // 最后刷新并关闭
    }

    public static void main(String[] args) throws IOException {
        copy1();// 最后输出copy1方法
    }
}
