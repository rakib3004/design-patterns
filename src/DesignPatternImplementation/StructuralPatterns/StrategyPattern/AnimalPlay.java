package DesignPatternImplementation.StructuralPatterns.StrategyPattern;


public class AnimalPlay{
	
	public static void main(String[] args){
		
		Animal doggy = new Dog();
		Animal eagle = new Bird();
		
		System.out.println("Dog: " + doggy.tryToFly());
		
		System.out.println("Bird: " + eagle.tryToFly());


		doggy.setFlyingAbility(new ItFlys());
		eagle.setFlyingAbility(new ItFlys());

		System.out.println("After Ability Change: ");
		System.out.println("Dog: " + doggy.tryToFly());

		System.out.println("Bird: " + eagle.tryToFly());


	}
	
}