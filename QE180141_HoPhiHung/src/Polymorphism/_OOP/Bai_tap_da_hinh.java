/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polymorphism._OOP;

/**
 *
 * @author Ho Phi Hung
 */
    class Animal {

public String toString()
{
    return "some sound";
}
}
class Dog extends Animal {
@Override
    public String toString()
    {
        return "bow wow";
    }
}

class Cat extends Animal {
@Override
    public String toString()
    {
        return "meow meow";
    }
}
class Duck extends Animal {
@Override
    public String toString()
    {
        return "quack quack";
    }
}

public class Bai_tap_da_hinh {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0]=new Animal();
        animals[1]=new Dog();
        animals[2]=new Cat();
        animals[3]=new Duck();
        for (int i = 0; i < 4; i++) {
            System.out.println(animals[i]);
        }
    }
}
