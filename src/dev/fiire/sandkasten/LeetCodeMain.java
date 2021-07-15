package dev.fiire.sandkasten;

import java.util.HashMap;

public class LeetCodeMain {

	public static void main(String[] args) {
		String egg = "egg";
		String add = "add";

		System.out.println(isIsomorphic(egg, add));

		String title = "foo";
		String paper = "bar";

		System.out.println(isIsomorphic(paper, title));
	}

	public static boolean isIsomorphic(String s, String t) {

		if (s.length() != t.length()) {
			return false;
		}

		if (s.equals(t)) {
			return true;
		}

		HashMap<Character, Character> dict = new HashMap<>();
		HashMap<Character, Character> reverseDict = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			if (dict.get(s.charAt(i)) == null) {
				dict.put(s.charAt(i), t.charAt(i));
			} else {
				if (dict.get(s.charAt(i)) != t.charAt(i)) {
					return false;
				}
			}
			if (reverseDict.get(t.charAt(i)) == null) {
				reverseDict.put(t.charAt(i), s.charAt(i));
			} else {
				if (reverseDict.get(t.charAt(i)) != s.charAt(i)) {
					return false;
				}
			}
		}
		return true;
	}
}
