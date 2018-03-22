package org.itstep;

import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class NavigationParser extends Thread {
	private final String navPageUrl;
	
	public void runParser() {
		// TODO Auto-generated method stub
		Document doc = null;
		try {
			doc = Jsoup.connect(navPageUrl).get();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ArrayList<String> pageUrls = new ArrayList<>();
		pageUrls.add(navPageUrl);
		if(!doc.getElementsByAttributeValueMatching("class", "pagination_container").isEmpty()) {
			Element pageContainer = doc.getElementsByAttributeValueMatching("class", "pagination_container").first();
			Elements LiElements = pageContainer.getElementsByTag("li");
			for (Element element : LiElements) {
				if (!element.hasAttr("class")) {
					String Link = element.getElementsByTag("a").first().attr("href");
					pageUrls.add(Link);
				}
			}
		}
		for (String Link : pageUrls) {
			GoodParser parser = new GoodParser(Link);
			parser.start();
		}
	}
	public NavigationParser(String navPageUrl) {
		// TODO Auto-generated constructor stub
		this.navPageUrl = navPageUrl;
	}
}
