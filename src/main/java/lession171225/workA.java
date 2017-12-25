/**
 * Project Name:dt59homework
 * File Name:workA.java
 * Package Name:lession171225
 * Date:2017年12月25日下午8:58:49
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package lession171225;

import java.util.Scanner;

/**
 * Description: <br/>
 * Date: 2017年12月25日 下午8:58:49 <br/>
 * 
 * @author lvwei
 * @version
 * @see
 */
public class workA {
    int bijiao(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {

        // Auto-generated method stub
        workA work = new workA();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个数值");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("较大值为：" + work.bijiao(a, b));

    }

}
