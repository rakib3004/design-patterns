package DesignPatternImplementation.BehaviouralPatterns.AbstractFactoryPatten;

public class UFOEnemyShip extends EnemyShip{
	
	
	EnemyShipFactory shipFactory;
	
	
	public UFOEnemyShip(EnemyShipFactory shipFactory){
		
		this.shipFactory = shipFactory;
		
	}

	
	void makeShip() {
		
		System.out.println("Making enemy ship " + getName());
		
		
		
		weapon = shipFactory.addESGun();
		engine = shipFactory.addESEngine();
		
	}
	
}