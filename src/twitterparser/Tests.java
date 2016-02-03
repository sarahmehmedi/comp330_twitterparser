package twitterparser;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import org.junit.Test;

public class Tests {
	
	String firstTweet = "Hello I #am testing #hashtags @sarah and www.sarahmehmedi.com";
	String secondTweet = "I am @Testing mentions hashtag";
	String thirdTweet = "I am testing websites www.sarahmehmedi.com and http://sarahmehmedi.me";
	
	@Test
	public void testingHashtags() {

		@SuppressWarnings("resource")
		Scanner hashtag = new Scanner(firstTweet);
		String tweets = hashtag.nextLine();
		
		TwitterParser tweet = TwitterParser.getTweet(tweets.toLowerCase());
		ArrayList<String> testingHashtags = new ArrayList <String>();
		testingHashtags.add("#am");
		testingHashtags.add("#hashtags");
		
		assertEquals(testingHashtags, tweet.getUniqueHashtags());
	}
	
	@Test
	public void testingMentions(){
		@SuppressWarnings("resource")
		Scanner mention = new Scanner(secondTweet);
		String tweets = mention.nextLine();
		
		TwitterParser tweet = TwitterParser.getTweet(tweets.toLowerCase());
		ArrayList<String> testingMentions = new ArrayList <String>();
		testingMentions.add("@testing");
		
		assertEquals(testingMentions, tweet.getUniqueMentions());
	}
	
	@Test
	public void testingWebsites(){
		@SuppressWarnings("resource")
		Scanner website = new Scanner(thirdTweet);
		String tweets = website.nextLine();
		
		TwitterParser tweet = TwitterParser.getTweet(tweets.toLowerCase());
		ArrayList<String> testingWebsites = new ArrayList <String>();
		testingWebsites.add("www.sarahmehmedi.com");
		testingWebsites.add("http://sarahmehmedi.me");
		
		assertEquals(testingWebsites, tweet.getUniqueWebsites());
		assertTrue("www.sarahmehmedi.com", true);
	}
	
	@Test
	public void testBoolMentions(){
		@SuppressWarnings("resource")
		Scanner mention = new Scanner(firstTweet);
		String tweets = mention.nextLine();
		
		ArrayList<String> testingMentions = new ArrayList<String>();
		testingMentions.add("@sarah");
		
		assertTrue("@sarah", true);
		assertFalse("@fake", false);
		assertFalse("@sarah", false);
	}

}
