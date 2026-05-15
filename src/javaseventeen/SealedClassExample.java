package javaseventeen;

sealed class Shape permits Circle, Rectangle{
	
}

final class Circle extends Shape{
	
}

final class Rectangle extends Shape{
	
}
sealed class Animal permits Dog, Cat {}

final class Dog extends Animal {}

non-sealed class Cat extends Animal {}


public class SealedClassExample {

	public static void main(String[] args) {
		
	}
}
