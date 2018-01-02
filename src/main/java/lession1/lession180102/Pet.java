/**
 * Project Name:dt59homework
 * File Name:Pet.java
 * Package Name:lession1.lession180102
 * Date:2018年1月2日下午5:15:05
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package lession1.lession180102;

/**
 * Description: <br/>
 * Date: 2018年1月2日 下午2:11:21 <br/>
 * 
 * @author lvwei
 * @version
 * @see
 */
/**
 * 1.<br/>
 * 父类：动物 Pet <br/>
 * 子类：狗 Dog，猫类 Cat；<br/>
 * 多态的方法（eat）：各子类的不同实现 ,狗吃骨头，猫吃鱼<br/>
 * 2.<br/>
 * 父类：人类 Human <br/>
 * 子类：男人 Man，女人 Woman；<br/>
 * 多态的方法（shopping）：各子类的不同实现 ,男人买烟，女人买衣服<br/>
 * 3.<br/>
 * 父类：车 Car <br/>
 * 子类：的士 Taxi，跑车 Roadster；<br/>
 * 多态的方法（manned）：的士载客，跑车不载客<br/>
 */
public class Pet {
    private String name;

    private String foot;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFoot() {
        return foot;
    }

    public void setFoot(String foot) {
        this.foot = foot;
    }

    public void eat() {
        System.out.println(this.getName() + "吃" + this.getFoot());
    }
}
