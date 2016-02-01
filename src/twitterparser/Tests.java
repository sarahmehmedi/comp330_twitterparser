package twitterparser;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import org.junit.Test;

public class Tests {
	
	String firstTweet = "Test #hashtag";
	
	@Test
	public void test() {

		@SuppressWarnings("resource")
		Scanner hashtag = new Scanner("Hello I #am testing #hashtags @sarah");
		String tweets = hashtag.nextLine();
		
		TwitterParser tweet = TwitterParser.getTweet(tweets.toLowerCase());
		ArrayList<String> testingHashtags = new ArrayList <String>();
		testingHashtags.add("#am");
		testingHashtags.add("#hashtags");
		
		ArrayList<String> testingMentions = new ArrayList <String>();
		testingMentions.add("@sarah");
		
		assertEquals(testingHashtags, tweet.getUniqueHashtags());
		assertEquals(testingMentions, tweet.getUniqueMentions());
	}

}
