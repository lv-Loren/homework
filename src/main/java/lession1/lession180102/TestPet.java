/**
 * Project Name:dt59homework
 * File Name:TestPet.java
 * Package Name:lession1.lession180102
 * Date:2018年1月2日下午5:17:46
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package lession1.lession180102;

/**
 * Description: <br/>
 * Date: 2018年1月2日 下午2:29:22 <br/>
 * 
 * @author lvwei
 * @version
 * @see
 */
public class TestPet extends Pet {
    public void eat() {
        System.out.println(this.getName() + "吃" + this.getFoot());
    }

    public static void main(String[] args) {

        Pet pet1 = new Dog("狗", "骨头");
        Pet pet2 = new Cat("猫", "鱼");
        if (pet1 instanceof Dog) {
            Dog dog = (Dog) pet1;
            dog.eat();
        }
        if (pet2 instanceof Cat) {
            Cat cat = (Cat) pet2;
            cat.eat();
        }

    }

}
