package programmesOnTextFile;

import java.util.HashMap;
import java.util.Set;

public class DuplicatescharactersCountFromString 
{

	public static void main(String[] args) 
	{
		// Java programme for duplicate character from string

		// take a string in a string variable
		String s = "cirricullum";
		// take a array of characters

		char[] arr = s.toCharArray();

		// Create HashMap object
		HashMap<Character, Integer> words = new HashMap<Character, Integer>();

		// Itterate the loop on arr;

		for (Character c : arr) {
			{
				if (words.containsKey(c)) {

					words.put(c, words.get(c) + 1); // If char is present in
													// charCountMap,
													// incrementing it's count
													// by 1

				} else {
					words.put(c, 1);// If char is not present in
									// charCountMap,putting this char to
									// charwordcount with 1 as it's value
				}

			}
		}

		// this will give use duplicates from map and value

		// take all keys in one set to get keys from map we have .keyset method
		// to use the

		Set<Character> Keys = words.keySet();

		for (char ch : Keys)

		{
			if (ch > 1)

			{
				System.out.println("Duplicate characters are:"+ch+ "=" + words.get(ch));
			}
		}

	}

}
