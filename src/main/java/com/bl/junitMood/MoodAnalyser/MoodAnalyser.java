package com.bl.junitMood.MoodAnalyser;

public class MoodAnalyser 
{
	public boolean printWelcome() {
		System.out.println("Welcome to the mood analyser system");
		return true;
	}
	
	public String analyseMood(String mood) {
		if (mood.contains("sad")) {
			return "SAD";
		} else {
			return "HAPPY";
		}
	}
	
}
