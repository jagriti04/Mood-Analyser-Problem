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
		try {
			if (message.contains("sad")) {
				return "SAD";
			} else {
				return "HAPPY";
			}
		} catch (Exception e)  {
			System.out.println(e.getMessage());
			return "Enter proper Mood";
		}
	}
	
}
