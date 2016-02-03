package twitterparser;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import org.junit.Test;

public class Tests {
	
	String firstTweet = "Test #hashtag";
	
	@Test
	public void testingHashtags() {

		@SuppressWarnings("resource")
		Scanner hashtag = new Scanner("Hello I #am testing #hashtags @sarah and www.sarahmehmedi.com");
		String tweets = hashtag.nextLine();
		
		TwitterParser tweet = TwitterParser.getTweet(tweets.toLowerCase());
		ArrayList<String> testingHashtags = new ArrayList <String>();
		testingHashtags.add("#am");
		testingHashtags.add("#hashtags");
		
		ArrayList<String> testingMentions = new ArrayList <String>();
		testingMentions.add("@sarah");
		
		ArrayList<String> testingWebsites = new ArrayList <String>();
		testingWebsites.add("www.sarahmehmedi.com");
		
		assertEquals(testingHashtags, tweet.getUniqueHashtags());
		assertEquals(testingMentions, tweet.getUniqueMentions());
		assertEquals(testingWebsites, tweet.getUniqueWebsites());
	}
	
	@Test
	public void testingMentions(){
		
	}

}
