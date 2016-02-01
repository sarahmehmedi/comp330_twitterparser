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
		Scanner hashtag = new Scanner("Hello I #am testing #hashtags");
		String tweets = hashtag.nextLine();
		
		TwitterParser tweet = TwitterParser.getTweet(tweets.toLowerCase());
		ArrayList<String> testing = new ArrayList <String>();
		testing.add("#am");
		testing.add("#hashtags");
		
		assertEquals(testing, tweet.getUniqueHashtags());
		assert
	}

}
