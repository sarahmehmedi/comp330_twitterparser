package twitterparser;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		//Scanner hashtag = new Scanner(System.in);
		//System.out.println("Please enter a line of text: ");
		Scanner hashtag = new Scanner("Hello I #am testing #hashtags");
		String tweets = hashtag.nextLine();
		
		TwitterParser tweet = TwitterParser.getTweet(tweets.toLowerCase());
		
		System.out.println(tweet.getUniqueHashtags());
		
	}
}


