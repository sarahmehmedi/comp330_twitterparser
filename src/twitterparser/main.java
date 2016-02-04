package twitterparser;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner tweetText = new Scanner(System.in);
		System.out.println("Please enter a tweet (preferably under 140 characters): ");
//		Scanner tweetText = new Scanner("Hello I #am testing #hashtags @sarah and www.sarahmehmedi.com");
		String tweets = tweetText.nextLine();
		
		TwitterParser tweet = TwitterParser.getTweet(tweets.toLowerCase());
		
		System.out.println("Hashtags: " + tweet.getUniqueHashtags());
		System.out.println("Mentions: " + tweet.getUniqueMentions());
		System.out.println("Websites: " + tweet.getUniqueWebsites());
	}
}


