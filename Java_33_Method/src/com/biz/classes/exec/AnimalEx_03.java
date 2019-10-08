package com.biz.classes.exec;

import com.biz.classes.service.children.Cat;
import com.biz.classes.service.children.Dog;
import com.biz.classes.service.parents.Animal;

public class AnimalEx_03 {
	public static void main(String[] args) {

		Animal am = new Animal();
		Dog dog1 = new Dog();
		Cat cat1 = new Cat();
		
		viewName(am);
		dog1.setName();
		viewName(dog1);
		cat1.setName();
		viewName(cat1);
	}

	public static void viewName(Animal animal) {
		String name = animal.getName();
		System.out.println("動物の王");
		System.out.println(name);
	}
	
	public static void viewName(Dog dog) {
		String name = dog.getName();
		System.out.println("犬");
		System.out.println(name);
	}
	
	public static void viewName(Cat cat) {
		String name = cat.getName();
		System.out.println("猫");
		System.out.println(name);
	}
}
