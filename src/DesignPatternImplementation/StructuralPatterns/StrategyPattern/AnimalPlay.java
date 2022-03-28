package DesignPatternImplementation.StructuralPatterns.StrategyPattern;


public class AnimalPlay{
	
	public static void main(String[] args){
		
		Animal doggy = new Dog();
		Animal eagle = new Bird();
		
		System.out.println("Dog: " + doggy.tryToFly());
		
		System.out.println("Bird: " + eagle.tryToFly());
		
		
		sparky.setFlyingAbility(new ItFlys());
		
		System.out.println("Dog: " + doggy.tryToFly());
		
	}
	
}