package twitterparser;

import java.util.*;

public class TwitterParser {
	
	private final static List<String> hashtags = new ArrayList<String>();
	private final static List<String> mentions = new ArrayList<String>();
	private String text;
	private TwitterParser() {}
	
	public static TwitterParser getTweet(String tweets){
		TwitterParser tweet = new TwitterParser();
		tweet.text = tweets;
		tweet.parser();
		return tweet;
	}
	
	private void parser(){
		StringTokenizer tokenizer = new StringTokenizer(this.text);
		while(tokenizer.hasMoreTokens()){
			String token = tokenizer.nextToken();
			if(token.startsWith("#")){
				hashtags.add(token);
			}
			else if (token.startsWith("@")){
				mentions.add(token);
			}
		}
	}
	
	public ArrayList<String> getUniqueHashtags(){
		ArrayList<String> unique = new ArrayList<String>();
		unique.addAll(hashtags);
		return unique;
	}
	
	public ArrayList<String> getUniqueMentions(){
		ArrayList<String> unique = new ArrayList<String>();
		unique.addAll(mentions);
		return unique;
	}
	

}
