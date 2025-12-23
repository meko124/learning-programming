package com.classes;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexApp{
	public static void main(String[] args) {
		String name = "Muhammad Eko Kuswanto , your handsome";
		
		Pattern pattern = Pattern.compile("[a-zA-Z]*[a][a-zA-Z]*");
		Matcher matcher = pattern.matcher(name);
		
		while(matcher.find()) {
			String result = matcher.group();
			System.out.println(result);
		}
	}
}