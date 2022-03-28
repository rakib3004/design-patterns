
public class ScrabbleTestThreads{
	
	public static void main(String[] args){
		
		
		Runnable getTiles = new DesignPatternImplementation.BehaviouralPatterns.SingletonPattern.GetTheTiles();
				
		Runnable getTilesAgain = new DesignPatternImplementation.BehaviouralPatterns.SingletonPattern.GetTheTiles();
				
				
		new Thread(getTiles).start();
		new Thread(getTilesAgain).start();
		
	}
	
}