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
		} catch (Exception e) {
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
		} catch (Exception e) {
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
		} catch (Exception e) {
			System.out.println(e.getMessage());;
		}
	}
	@Test
	public void givenMessage_whenNull_shouldReturnException() {	
		String mood;
		try {
			moodAnalyser.MoodAnalyser(null);
			mood = moodAnalyser.analyseMood();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Assert.assertEquals("HAPPY", e.getMessage());
		}
	}
}
