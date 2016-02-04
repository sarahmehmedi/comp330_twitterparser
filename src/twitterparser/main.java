package twitterparser;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner hashtag = new Scanner(System.in);
		System.out.println("Please enter a line of text: ");
//		Scanner hashtag = new Scanner("Hello I #am testing #hashtags @sarah and www.sarahmehmedi.com");
		String tweets = hashtag.nextLine();
		
		TwitterParser tweet = TwitterParser.getTweet(tweets.toLowerCase());
		
		System.out.println("Hashtags: " + tweet.getUniqueHashtags());
		System.out.println("Mentions: " + tweet.getUniqueMentions());
		System.out.println("Websites: " + tweet.getUniqueWebsites());
		
	}
}


