package twitterparser;

import static org.junit.Assert.*;

import org.junit.Test;

public class Tests {

	@Test
	public void test() {
		String firstTweet = "TEST #hashtag";
		TwitterParser.getTweet(firstTweet);
		assertEquals("hashtag", TwitterParser.getUniqueHashtags());
		//fail("Not yet implemented");
	}

}
