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
	
	public String analyseMood() throws MoodAnalyserException {
		try {
			if (message.length() == 0)
				throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_EMPTY,"Enter proper ");
			if (message.contains("sad")) {
				return "SAD";
			} else {
				return "HAPPY";
			}
		} catch (NullPointerException e)  {
			System.out.println(e.getMessage());
			throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_NULL, "Enter proper Mood");
		}
	}
	
}
