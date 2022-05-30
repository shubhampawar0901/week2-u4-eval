package com.question1;

public class Animal {
	String voice;
	
	void sound() {
		System.out.println("Animal has voice");
	}
}

//Cat Is-A animal
//public class Cat extends Animal{
//	String food;
//	
//	@Override
//	void sound() {
//		// TODO Auto-generated method stub
//		System.out.println("Cat does Meowww");;
//	}
//
//	void eat() {
//		System.out.println("Cat eats fish");
//	}
//	
//}
//
//
//
//
//class Car{
//	
//	private String name;
//	// Car Has-A engine
//	private Engine engine;
//	
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public Engine getEngine() {
//		return engine;
//	}
//	public void setEngine(Engine engine) {
//		this.engine = engine;
//	}
//	
//	public void askName() {
//		System.out.println("I'm car");
//	}
//
//}
//
//class Engine{
//	private String type;
//	
//	public String getType() {
//		return type;
//	}
//
//	public void setType(String type) {
//		this.type = type;
//	}
//
//	
//}
//
//class Main{
//	public static void main(String[] args) {
//		Engine engine = new Engine();
//		engine.setType("Turbo");
//		
//		Car car = new Car();
//		car.setName("TATA");
//		car.setEngine(engine);
//		
//		System.out.println("Car info :");
//		System.out.println("Name :"+ car.getName());
//		System.out.println("Engine :"+ car.getEngine());
//	}
//}
