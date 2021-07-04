package a6.OOP;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> intArray = new ArrayList<Integer>();
		intArray.add(1);
		System.out.println(intArray.get(0));

		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 99; i++) {
			list.add((int) (i * Math.random()));
		}

		List results = list.stream().filter(x -> x < 10).collect(Collectors.toList());

		System.out.println(results);
		
		
	}

}
