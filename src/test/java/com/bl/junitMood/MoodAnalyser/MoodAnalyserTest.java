package com.bl.junitMood.MoodAnalyser;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.bl.junitTwo.JunitPracticeTwoMaven.MoodAnalyser;

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
}
