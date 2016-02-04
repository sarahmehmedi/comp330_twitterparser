package twitterparser;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner tweetText = new Scanner(System.in);
		readInput(tweetText);
	}
	private static void readInput(Scanner in){
		System.out.println("Please enter a tweet (preferably under 140 characters): ");
		String tweets = in.nextLine();
		if(tweets.length() <= 140){

			TwitterParser tweet = TwitterParser.getTweet(tweets.toLowerCase());

			System.out.println("Hashtags: " + tweet.getUniqueHashtags());
			System.out.println("Mentions: " + tweet.getUniqueMentions());
			System.out.println("Websites: " + tweet.getUniqueWebsites());
		}
		else{
			System.out.println("Longer than 140 characters...");
			readInput(in);
		}
	}
}



