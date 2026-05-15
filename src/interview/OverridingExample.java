package interview;

//Demonstrating method overriding 
//and polymorphism 
import java.io.*;

//Base Class
class Animal {
 void eat() {
     System.out.println("eat() method of base class");
     System.out.println("Animal is eating.");
 }
}

//Derived Class
class Dog extends Animal {
 @Override
 void eat() {
     System.out.println("eat() method of derived class");
     System.out.println("Dog is eating.");
 }
 
 // Method to call the base class method
 void eatAsAnimal() {
     super.eat();
 }
}
public 
//Driver Class
class OverridingExample {
 
 // Main Function
 public static void main(String args[]) {
     Dog d1 = new Dog();
     Animal a1 = new Animal();

     // Calls the eat() method of Dog class
     d1.eat();
     
     // Calls the eat() method of Animal class
     a1.eat();

     // Polymorphism: Animal reference pointing to Dog object
     Animal animal = new Dog();
     
     // Calls the eat() method of Dog class
     animal.eat();
     
     // To call the base class method, you need to use a Dog reference
     ((Dog) animal).eatAsAnimal();
 }
}