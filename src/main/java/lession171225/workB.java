/**
 * Project Name:dt59homework
 * File Name:workB.java
 * Package Name:lession171225
 * Date:2017年12月25日下午9:03:57
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package lession171225;

import java.util.Scanner;

/**
 * Description: <br/>
 * Date: 2017年12月25日 下午9:03:57 <br/>
 * 
 * @author lvwei
 * @version
 * @see
 */
public class workB {
    void card(int i) {
        switch (i) {
        case 1:
            System.out.println("你的卡片为至尊级vip卡");
            break;
        case 2:
            System.out.println("你的卡片为钻石级vip卡");
            break;
        case 3:
            System.out.println("你的卡片为铂金级vip卡");
            break;
        case 4:
            System.out.println("你的卡片为黄金级vip卡");
            break;
        case 5:
            System.out.println("你的卡片为白银级vip卡");
            break;
        }
    }

    double dazhe(int i, double i1) {
        switch (i) {
        case 1:
            return i1 * 0.75;
        case 2:
            return i1 * 0.8;
        case 3:
            return i1 * 0.85;
        case 4:
            return i1 * 0.9;
        default:
            return 0;
        }
    }

    public static void main(String[] args) {

        // Auto-generated method stub
        System.out.println("请输入你的vip卡类型");
        workB work = new workB();
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        work.card(i);
        System.out.println("请输入你消费金额");
        double i1 = sc.nextDouble();
        System.out.println("您本次消费：" + i1 + "元，通过vip卡折扣后，需支付：" + work.dazhe(i, i1) + "元");
    }

}
