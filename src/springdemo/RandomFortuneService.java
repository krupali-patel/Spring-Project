package springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
	private String[] fortune = {"Randomfortune1","Randomfortune2","Randomfortune3"};
	private Random rand = new Random();
	@Override
	public String getFortune() {
		
		int rand_index = rand.nextInt(fortune.length);
		
		return fortune[rand_index];
		
	}

}
