package org.itstep;

import java.util.ArrayList;

public class AppRunner {

	public static void main(String[] args) {
		if(args.length == 0) {
			return;
		}
		else {
			StartUpParser startUpParser = new StartUpParser(args[0]);
			startUpParser.runStartUpParser();
		}

	}

}
