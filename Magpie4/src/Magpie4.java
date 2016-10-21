public class Magpie4 {
	
	/*Takahiro Mollenkamp 10/21/16
	The final version of Magpie code
	The magpie runner calls getresponse to talk with the user*/ 
	public String getGreeting() {
		return "Hello, let's talk.";
	}



	
	/**
	 * Gives a response to a user statement
	 * takes in user statement
	 * response based on the rules given
	 */
	public String getResponse(String statement) {
		
		// Paste Part 3 code here.  The method has new pieces that continue below and should flow from your previous code.
		String response = "";
		statement=statement.trim();
		if (statement.length()==0){//random response when there is no word inputed
			double x=3*Math.random();
			if (x<=1){
				response="Say something please.";
			}
			else if(x<=2){
				response="Tell me something";
			}
			else if(x<=3){
				response="What are you thinking";
			}
			
		}
		else if (findKeyword(statement, "no", 0) >= 0) {
			response = "Why so negative?";
		} else if (findKeyword(statement, "mother", 0) >= 0
				|| findKeyword(statement,"father", 0) >= 0
				|| findKeyword(statement,"sister", 0) >= 0
				|| findKeyword(statement,"brother", 0) >= 0) {
			response = "Tell me more about your family.";//response to family related input
		} else if(findKeyword(statement,"Dreyer", 0)>=0){//teacher response
			response="She sounds like a great teacher.";
		} else if(findKeyword(statement,"DeHeer", 0) >= 0
				|| findKeyword(statement,"Lamont", 0) >= 0){//teacher response
			response = "He sounds like a great teacher.";}
		else if(findKeyword(statement,"hello", 0)>=0){
			response="Hi. What's up?";
		}
		else if(findKeyword(statement,"weather", 0)>=0){//additional keyword
			response="It's an exellent weather today.";
		}
		else if(findKeyword(statement,"hungry", 0)>=0){//additional keyword
			response="What do you want to eat?";
		}

		// Responses which require transformations
		else if (findKeyword(statement, "I want", 0) >= 0) {
			response = transformIWantToStatement(statement);
		}

		else {
			// Look for a two word (you <something> me)
			// pattern
			int psn = findKeyword(statement, "I", 0);

			if (psn >= 0 && findKeyword(statement, "you", psn) >= 0) {
				response = transformYouMeStatement(statement);
			} else {
				response = getRandomResponse();
			}
		}
		return response;
	}


	private String transformIWantToStatement(String statement) {
		// Remove the final period, if there is one
		statement = statement.trim();
		String lastChar = statement.substring(statement.length() - 1);
		if (lastChar.equals(".")) {
			statement = statement.substring(0, statement.length() - 1);
		}
		int psn = findKeyword(statement, "I want", 0);
		String restOfStatement = statement.substring(psn + 6).trim();
		return "Would you really be happy if you had " + restOfStatement + "?";
	}

	
	private String transformYouMeStatement(String statement) {
		// Remove the final period, if there is one
		statement = statement.trim();
		String lastChar = statement.substring(statement.length() - 1);
		if (lastChar.equals(".")) {
			statement = statement.substring(0, statement.length() - 1);
		}

		int psnOfYou = findKeyword(statement, "i", 0);
		int psnOfMe = findKeyword(statement, "you", psnOfYou + 1);

		String restOfStatement = statement.substring(psnOfYou + 1, psnOfMe)
				.trim();
		return "Why do you " + restOfStatement + " me?";
	}


	 
	private int findKeyword(String statement, String goal, int startPos) {
		String phrase = statement.trim();
		// The only change to incorporate the startPos is in the line below
		int psn = phrase.toLowerCase().indexOf(goal.toLowerCase(), startPos);

		// Refinement--make sure the goal isn't part of a word
		while (psn >= 0) {
			// Find the string of length 1 before and after the word
			String before = " ", after = " ";
			if (psn > 0) {
				before = phrase.substring(psn - 1, psn).toLowerCase();
			}
			if (psn + goal.length() < phrase.length()) {
				after = phrase.substring(psn + goal.length(),
						psn + goal.length() + 1).toLowerCase();
			}

			// If before and after aren't letters, we've found the word
			if (before.equals(" ") && (after.equals(" ")||after.equals("?"))) {
				return psn;
			}
			// The last position didn't work, so let's find the next, if there
			// is one.
			psn = phrase.indexOf(goal.toLowerCase(), psn + 1);

		}

		return -1;
	}

	/**
	 * Search for one word in phrase. The search is not case sensitive. This
	 * method will check that the given goal is not a substring of a longer
	 * string (so, for example, "I know" does not contain "no"). The search
	 * begins at the beginning of the string.
	 * 
	 * takes in the string to search
	 * takes in the string to search for
	 * returns the index of the first occurrence of goal in statement or -1 if it's not found
	 */


	/**
	 * Pick a default response to use if nothing else fits.
	 * 
	 * @return a non-committal string
	 */
	private String getRandomResponse() {
		
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
		String response = "";

		if (whichResponse == 0) {
			response = "Interesting, tell me more.";
		} else if (whichResponse == 1) {
			response = "Hmmm.";
		} else if (whichResponse == 2) {
			response = "Do you really think so?";
		} else if (whichResponse == 3) {
			response = "You don't say.";
		}

		return response;
	}

	
}
