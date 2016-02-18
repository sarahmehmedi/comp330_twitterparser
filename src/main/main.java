package main;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner tweetText = new Scanner(System.in);
		inputTweets(tweetText);
	}
	//takes user input and parses through it
	private static void inputTweets(Scanner in){
		System.out.println("Please enter a tweet (preferably under 140 characters): ");
		String tweets = in.nextLine();
		if(tweets.length() <= 140){

			TwitterParser tweet = TwitterParser.getTweet(tweets.toLowerCase());

			System.out.println("Hashtags: " + tweet.getUniqueHashtags() + "\nNumber of hashtags: " + tweet.getHashtagSize());
			System.out.println("Mentions: " + tweet.getUniqueMentions() + "\nNumber of mentions: " + tweet.getMentionsSize());
			System.out.println("Websites: " + tweet.getUniqueWebsites() + "\nNumber of websites: " + tweet.getWebsiteSize());
		}
		else{
			System.out.println("You have entered longer than 140 characters...");
			inputTweets(in);
		}
	}
}



