/**
 * L
 * Copyright (c) 1991-2021 All Rights Reserved.
 */
package com.springboot.qa.qasystem.test;

/**
 *
 * @author L
 * @version 1.0: test.java, v 1.0 2021年01月05日 13:59 L Exp $
 */
public class test {

    public static void main(String[] args) {

        User user = null;
        int num;
        init(user);
        user.setName("hhh");
        System.out.println(user.name);
        //Dog dog = new Dog();
        //dog.setName("狗");
        //dog.setLegCount(4);
        //dog.setBark("汪汪汪");
        //
        //dog.call();
        //dog.eat();
        //dog.eat("鸡肉");
        /*Chicken chicken = new Chicken();
        chicken.setName("鸡");
        chicken.setLegCount(2);
        chicken.setCrow("喔喔喔");
        chicken.call();
        chicken.eat();*/
    }

    public test(){
    }


    static class User {
        private int    id;
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }

    public static void init(User user) {
        user = new User();
        user.setId(0);
    }

    public static class Animal {
        //名字
        private String name;
        //腿数
        private int    legCount;

        public Animal() {
            System.out.println("执行主类构造");
        }

        static {
            System.out.println("执行主类静态代码");
        }

        {
            System.out.println("执行主类非静态代码");
        }

        public void eat() {
            System.out.println("吃东西");
        }

        public void eat(String food) {
            System.out.println("我要吃" + food);
        }

        public void eat(String food, String f) {
            System.out.println("我要吃" + food);
        }

        //自我介绍
        public void call() {
            System.out.println("我是" + this.name);
            System.out.println("我有" + this.legCount + "条腿");
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getLegCount() {
            return legCount;
        }

        public void setLegCount(int legCount) {
            this.legCount = legCount;
        }
    }

    public static class Dog extends Animal {
        //狗吠
        private String bark;

        public Dog() {
            System.out.println("执行子类构造");
        }

        public Dog(String bark) {
            System.out.println("执行子类有参构造");
        }

        static {
            System.out.println("执行子类静态代码");
        }

        {
            System.out.println("执行子类非静态代码");
        }

        @Override
        public void eat() {
            //super.eat();
            System.out.println("我吃肉。" + bark);
        }

        public String getBark() {
            return bark;
        }

        public void setBark(String bark) {
            this.bark = bark;
        }
    }

    public static class Chicken extends Animal {
        //鸡鸣
        private String crow;
        @Override
        public void eat() {
            super.eat();
            System.out.println("我吃米。" + crow);
        }

        public String getCrow() {
            return crow;
        }

        public void setCrow(String crow) {
            this.crow = crow;
        }

    }
}