package com.company;

import java.util.ArrayList;
import java.util.HashMap;

class Main{
    //第一步加载
    public static String a = "hello";
    public static Number b = 2 ;

    //第二步加载
    static{
        System.out.println(b);
        b = 3;
        System.out.println(b);
    }

    public static void main(String[] args) {
        System.out.println(a + " world ");
        System.out.println("main : " + b);

        // 泛型的目的是为了让容器内包含各种各样的数据结构
        Gne<Integer> objectGne = new Gne<Integer>(3);
        System.out.println(objectGne.getClass());
        System.out.println(Gne.class.equals(objectGne.getClass()));

        //方法重载
        People lan = new People("lan", 16);
        System.out.println(lan);
        People lan1 = new People("lan1");
        System.out.println(lan1);

        //继承可以让子类拥有父类的一切
        Children lan2 = new Children("lan2");
        lan2.speak();
        lan2.eat();
        //数组
//        int[] ints = new int[2];
//        ints[0] = 1;
//        for(int x=0; x<ints.length; x++){
//            System.out.println("arr1 " + ints[x]);
//        };

        //增强数组循环
//        for(int i: ints){
//            System.out.println("arr2 " + i);
//        };

        //数组
        ArrayList<Object> objects = new ArrayList<>();
        objects.add("string");
        objects.add(1);
        System.out.println(objects);

        //对象
        HashMap<Integer, String> integerStringHashMap = new HashMap<>();
        integerStringHashMap.put(1, "google");
        integerStringHashMap.put(2, "baidu");
        System.out.println(integerStringHashMap);

        //json


    }


}
