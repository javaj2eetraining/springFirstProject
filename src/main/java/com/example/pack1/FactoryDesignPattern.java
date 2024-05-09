package com.example.pack1;


interface  Animal{
    void speak();
}
class Dog implements Animal{
    public void speak(){
        System.out.println("sdfasdf");
    }
}

class Cat implements Animal{
    public void speak(){
        System.out.println("cat");
    }
}

class AnimalFactory{
    public static Animal createAnimal(String tpe){
        if("dog".equalsIgnoreCase(tpe)){
            return new Dog();
        }else if("cat".equalsIgnoreCase(tpe)){
            return new Cat();
        }
        return null;

    }
}
public class FactoryDesignPattern {
    public static void main(String[] args) {
        Animal dog = AnimalFactory.createAnimal("dog");;
        dog.speak();
        Animal cat = AnimalFactory.createAnimal("cat");
        cat.speak();
    }


}
