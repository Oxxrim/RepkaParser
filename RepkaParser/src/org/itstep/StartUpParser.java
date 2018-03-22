package org.itstep;

public class StartUpParser {
	private final String searchUrl;
	public StartUpParser(String keyword) {
		// TODO Auto-generated constructor stub
		searchUrl = "https://m.repka.ua/catalogsearch/result/?q=" + keyword;
	}	
	protected void runStartUpParser() {
		NavigationParser navParser = new NavigationParser(searchUrl);
		navParser.runParser();
	}
}
