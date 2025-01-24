package com.assisted;

class Animal{
    String name;
    int age;
    Animal(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void makeSound(){
        System.out.println("Animal Make sound : ");
    }

}
class Dog extends Animal{
    String sound="Woof Woof";
    Dog(String name,int age){
        super(name,age);
    }
    @Override
    public void makeSound(){
        System.out.println("Dog "+name+" of age "+age+" years make sound "+sound);
    }
}
class Cat extends Animal{
    String sound ="Meows";
    Cat(String name, int age){
        super(name,age);
    }
    @Override
    public void makeSound(){
        System.out.println("Cat "+name+" of age "+age+" years make sound "+sound);
    }
}
class Bird extends Animal{
    String sound="Chirps";
    Bird(String name,int age){
        super(name,age);
    }
    @Override
    public void makeSound(){
        System.out.println("Bird "+name+" of age "+age+" years make sound "+sound);
    }
}
public class SoundOfAnimal{
    public static void main(String args[]){
       
        Animal dog = new Dog("Shiro" , 2);
        Animal cat = new Cat("Miu",5);
        Animal bird = new Bird("Parrot",1);
        
        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
    }
}