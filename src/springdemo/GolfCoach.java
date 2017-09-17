package springdemo;

public class GolfCoach implements Coach {
	
	private FortuneService fortuneService;
	
	
	@Override
	public String getDailyWorkout() {
		return "To be a successfull golfer practice daily";
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
