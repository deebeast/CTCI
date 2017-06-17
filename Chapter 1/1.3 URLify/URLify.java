class URLify {
	
	/**
	 * takes in input as string and returns url form
	 */
	String compute (String input) {

		String[] words = input.substring(0, trueLength(input)).split(" ");
		int num_of_spaces = words.length - 1;
		StringBuilder  url = new StringBuilder();
		for(int i = 0; i < words.length; i++) {
			url.append(words[i]);
			if(num_of_spaces > 0) {
				num_of_spaces--;
				url.append("%20");
			}
		}
		return url.toString();
	}

	/**
	* returns truelength by not counting space buffers
	* removing extra buffer
	*/

	int trueLength(String input) {
		int trueLength = 0;
		for (int i = 0; i < input.length() ;i++ ) {
			if( (input.charAt(i) != ' ' && (i < (input.length()-1)) && input.charAt(i + 1) != ' ' )  ) {
				trueLength = i + 2;
			}
			else if ((input.charAt(i) != ' ') || 
				 ((input.charAt(i)==' ') && (i<(input.length()-1)) && (input.charAt(i)!=' ') )) {
				trueLength = i + 1;
			}
		}
		return trueLength;
	}
}
