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
		String mood = moodAnalyser.analyseMood("I am in sad mood.");
		Assert.assertEquals("SAD", mood);
	}
	
	@Test
	public void givenMessage_whenHappy_shouldReturnHappy() {
		String mood = moodAnalyser.analyseMood("This is a happy message");
		Assert.assertEquals("HAPPY", mood);
	}
	
	@Test
	public void givenMessage_whenAnymood_shouldReturnHappy() {
		String mood = moodAnalyser.analyseMood("I am in Any Mood");
		Assert.assertEquals("HAPPY", mood);
	}
}
