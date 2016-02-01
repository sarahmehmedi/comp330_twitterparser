package twitterparser;

import java.util.*;

public class TwitterParser {
	
	private final List<String> hashtags = new ArrayList<String>();
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
		}
	}
	
	public Set<String> getUniqueHashtags(){
		Set<String> unique = new HashSet<String>();
		unique.addAll(hashtags);
		return unique;
	}
	

}
