
public class Magpie2 {

	//Get a default greeting and return a greeting	
	public String getGreeting() {
		return "Hello, let's talk.";
	}

	/**
	 * Gives a response to a user statement
	 * takes in a user statement
	 * returns a response based on given rules
	 */
	public String getResponse(String statement) {
		String response = "";
		statement=statement.trim();
		if (statement.length()==0){
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
		else if (statement.indexOf("no") >= 0) {
			response = "Why so negative?";
		} else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0) {
			response = "Tell me more about your family.";
		} else if(statement.indexOf("Dreyer")>=0){
			response="She sounds like a great teacher.";
		} else if(statement.indexOf("DeHeer") >= 0
				|| statement.indexOf("Lamont") >= 0){
			response = "He sounds like a great teacher.";}
		else if(statement.indexOf("hello")>=0){
			response="Hi. What's up?";
		}
		else if(statement.indexOf("weather")>=0){
			response="It's an exellent weather today.";
		}
		else if(statement.indexOf("hungry")>=0){
			response="What do you want to eat?";
		}
		else{
		
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * returns a non-committal string
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
