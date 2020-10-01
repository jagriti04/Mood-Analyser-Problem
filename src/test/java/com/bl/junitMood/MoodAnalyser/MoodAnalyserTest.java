package com.bl.junitMood.MoodAnalyser;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MoodAnalyserTest 
{
	MoodAnalyser moodAnalyser = null;
	
	@Before
	public void initialize() {
		moodAnalyser = new MoodAnalyser();
	}
	
	@Test
    public void start_shouldPrintWelcomeMsg()
    {
        boolean welcome = moodAnalyser.printWelcome();
        Assert.assertEquals(true, welcome);
    }
	
	@Test
	public void givenMessage_whenSad_shouldReturnSad() {	
		String mood;
		try {
			moodAnalyser.MoodAnalyser("I am in sad mood.");
			mood = moodAnalyser.analyseMood();
			Assert.assertEquals("SAD", mood);
		} catch (MoodAnalyserException e) {
			System.out.println(e.getMessage());;
		}
	}
	
	@Test
	public void givenMessage_whenHappy_shouldReturnHappy() {
		String mood;
		try {
			moodAnalyser.MoodAnalyser("This is a happy message");
			mood = moodAnalyser.analyseMood();
			Assert.assertEquals("HAPPY", mood);
		} catch (MoodAnalyserException e) {
			System.out.println(e.getMessage());;
		}
	}
	
	@Test
	public void givenMessage_whenAnymood_shouldReturnHappy() {	
		String mood;
		try {
			moodAnalyser.MoodAnalyser("I am in Any Mood");
			mood = moodAnalyser.analyseMood();
			Assert.assertEquals("HAPPY", mood);
		} catch (MoodAnalyserException e) {
			System.out.println(e.getMessage());;
		}
	}
	@Test
	public void givenMessage_nullValue_shouldReturnException() {
		
		String mood;
		try {
			moodAnalyser.MoodAnalyser(null);
			mood = moodAnalyser.analyseMood();
		} catch (MoodAnalyserException e) {
			System.out.println(e.getMessage() + " " + e.exceptionType);
			Assert.assertEquals(MoodAnalyserException.ExceptionType.ENTERED_NULL, e.exceptionType);
		}
	}
	@Test
	public void givenMessage_emptyValue_shouldReturnException() {
		
		String mood;
		try {;
		moodAnalyser.MoodAnalyser("");
		mood = moodAnalyser.analyseMood();
		} catch (MoodAnalyserException e) {
			System.out.println(e.getMessage() + " " + e.exceptionType);
			Assert.assertEquals(MoodAnalyserException.ExceptionType.ENTERED_EMPTY, e.exceptionType);
		}
	}
}
