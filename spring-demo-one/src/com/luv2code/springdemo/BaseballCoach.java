package com.luv2code.springdemo;

public class BaseballCoach implements Coach{
	
	//define a private field for the dependency
	private FortuneService fortuneService;
	
	//define a constructor for the dependency injection
	BaseballCoach(FortuneService theFortuneService)
	{
		fortuneService = theFortuneService;
	}
	public String getDailyWorkout()
	{
		return "spend 30 min practicing in the batting cage";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
