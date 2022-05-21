package com.company;

public class People implements NameInterface {
    public Number year;
    public String name;

    People(String name){
        this.name = name;
    }

    People(String name, Number year){
        this.name = name;
        this.year = year;
    }

    public String toString(){
        return "this is " + this.name + " who is " + this.year + " years old";
    }

    public void speak(){
        System.out.println(this.name + " is speaking now");
    }

    public void eat(){
        System.out.println(this.name + " is eating");
    }
}

class Children extends People{

    Children(String name) {
        super(name);
    }

    Children(String name, Number year) {
        super(name,year);
    }

    //重写父类方法
    public void speak() {
        System.out.println(this.name + " is override ");
    }
}
