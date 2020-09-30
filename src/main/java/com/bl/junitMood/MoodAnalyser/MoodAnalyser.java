package com.bl.junitMood.MoodAnalyser;

public class MoodAnalyser 
{
	private String  message;
	
	public void MoodAnalyser() {
		
	}
	
	public void MoodAnalyser(String message) {
		this.message = message;
	}
	
	public boolean printWelcome() {
		System.out.println("Welcome to the mood analyser system");
		return true;
	}
	
	public String analyseMood() {
		if (message.contains("sad")) {
			return "SAD";
		} else {
			return "HAPPY";
		}
	}
	
}
