class PalindromePermutation {

	boolean isPermutationOfPalindrome(String phrase) {
		int bitVector = createBitVector(phrase);
		return bitVector == 0 || checkExactlyOneBitSet(bitVector);
	}

	/**
	 * for each value of i toggle ith bit
	 */
	int createBitVector(String phrase) {
		int bitVector = 0;
		for(char c : phrase.toCharArray()) {
			int x = (int)c - 'a' + 1;
			bitVector = toggle(bitVector, x);
		}
		return bitVector;
	}

	/* toggle the ith bit in the bitVector */
	int toggle(int bitVector, int index) {
		if(index < 0) return bitVector;
		int mask = 1 << index;
		if((bitVector & mask) == 0) {
			bitVector |= mask;
		} else {
			bitVector &= ~mask;
		}
		return bitVector;
	}


	boolean checkExactlyOneBitSet(int bitVector) {
		return (bitVector & (bitVector - 1)) == 0 ;
	}
}
