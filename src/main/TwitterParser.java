package main;

import java.util.*;

public class TwitterParser {
	
	private final static List<String> hashtags = new ArrayList<String>();
	private final static List<String> mentions = new ArrayList<String>();
	private final static List<String> websites = new ArrayList<String>();

	private String text;
	private TwitterParser() {}
	
	public static TwitterParser getTweet(String tweets){
		TwitterParser tweet = new TwitterParser();
		tweet.text = tweets;
		tweet.parser();
		return tweet;
	}
	//looks through tweet to find specific #,@,and websites
	private void parser(){
		StringTokenizer tokenizer = new StringTokenizer(this.text);
		while(tokenizer.hasMoreTokens()){
			String token = tokenizer.nextToken();
			if(token.startsWith("#")){
				if(token.startsWith("#@")){
					System.out.println("#@ not valid");
				}
				else{
					hashtags.add(token);
				}
			}
			else if (token.startsWith("@")){
				if(token.startsWith("@#")){
					System.out.println("@# not valid");
				}
				else{
				mentions.add(token);
				}
			}
			else if (token.startsWith("http://")|| token.startsWith("www.") || token.startsWith("https://")){
				websites.add(token);
			}
		}
	}
	//gets hashtags and puts into arraylist
	public ArrayList<String> getUniqueHashtags(){
		ArrayList<String> unique = new ArrayList<String>();
		unique.addAll(hashtags);
		return unique;
	}
	//gets number of  hashtags
	public int getHashtagSize(){
		ArrayList<String> unique = new ArrayList<String>();
		unique.addAll(hashtags);
		return unique.size();
	}
	//gets mentions and puts into arraylist
	public ArrayList<String> getUniqueMentions(){
		ArrayList<String> unique = new ArrayList<String>();
		unique.addAll(mentions);
		return unique;
	}
	//gets number of mentions
	public int getMentionsSize(){
		ArrayList<String> unique = new ArrayList<String>();
		unique.addAll(mentions);
		return unique.size();
	}
	//gets websites and puts intto arraylist
	public ArrayList<String> getUniqueWebsites(){
		ArrayList<String> unique = new ArrayList<String>();
		unique.addAll(websites);
		return unique;
	}	
	//gets the number of websites
	public int getWebsiteSize(){
		ArrayList<String> unique = new ArrayList<String>();
		unique.addAll(websites);
		return unique.size();
	}

}
