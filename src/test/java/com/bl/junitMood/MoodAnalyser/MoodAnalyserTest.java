package com.bl.junitMood.MoodAnalyser;

import static org.junit.Assert.assertTrue;

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
		moodAnalyser.MoodAnalyser("I am in sad mood.");
		String mood = moodAnalyser.analyseMood();
		Assert.assertEquals("SAD", mood);
	}
	
	@Test
	public void givenMessage_whenHappy_shouldReturnHappy() {
		moodAnalyser.MoodAnalyser("This is a happy message");
		String mood = moodAnalyser.analyseMood();
		Assert.assertEquals("HAPPY", mood);
	}
	
	@Test
	public void givenMessage_whenAnymood_shouldReturnHappy() {
		moodAnalyser.MoodAnalyser("I am in Any Mood");
		String mood = moodAnalyser.analyseMood();
		Assert.assertEquals("HAPPY", mood);
	}
}
