package twitterparser;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import org.junit.Test;

public class Tests {
	
	String firstTweet = "Hello I #am testing #hashtags @sarah and www.sarahmehmedi.com";
	String secondTweet = "I am @Testing mentions hashtag";
	
	@Test
	public void testingHashtags() {

		@SuppressWarnings("resource")
		Scanner hashtag = new Scanner(firstTweet);
		String tweets = hashtag.nextLine();
		
		TwitterParser tweet = TwitterParser.getTweet(tweets.toLowerCase());
		ArrayList<String> testingHashtags = new ArrayList <String>();
		testingHashtags.add("#am");
		testingHashtags.add("#hashtags");
		
		ArrayList<String> testingWebsites = new ArrayList <String>();
		testingWebsites.add("www.sarahmehmedi.com");
		
		assertEquals(testingHashtags, tweet.getUniqueHashtags());
		assertEquals(testingWebsites, tweet.getUniqueWebsites());
	}
	
	@Test
	public void testingMentions(){
		@SuppressWarnings("resource")
		Scanner mention = new Scanner(secondTweet);
		String tweets2 = mention.nextLine();
		
		TwitterParser tweet2 = TwitterParser.getTweet(tweets2.toLowerCase());
		ArrayList<String> testingMentions = new ArrayList <String>();
		testingMentions.add("@testing");
		
		assertEquals(testingMentions, tweet2.getUniqueMentions());
	}

}
