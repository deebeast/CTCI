class URLify {
	/**
	 * takes in input as string and returns url form
	 */
	public String compute (String input) {
		String[] words = input.split(" ");
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
}
