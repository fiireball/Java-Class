package dev.fiire.mooc.p7.selectsort;

import java.util.Arrays;

public class MainProgram {
	public static void main(String[] args) {
		int[] numbers = {8, 3, 7, 9, 1, 2, 4};
		MainProgram.sort(numbers);
	}
	
	public static void sort(int[] array) {
		System.out.println(Arrays.toString(array));
		for (int i = 0; i < array.length-1;i++) {
			swap(array, i, indexOfSmallestFrom(array, i));
			System.out.println(Arrays.toString(array));
		}
	}

	public static void swap(int[] array, int index1, int index2) {
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}

	private static int smallest(int[] array) {
		int min = array[0];
		for (int i = 1; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
			}
		}
		return min;
	}

	private static int indexOfSmallest(int[] array) {
		int min = array[0];
		int index = 0;
		for (int i = 1; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
				index = i;
			}
		}
		return index;
	}

	public static int indexOfSmallestFrom(int[] array, int startIndex) {
		int min = array[startIndex];
		int index = startIndex;
		for (int i = startIndex; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
				index = i;
			}
		}
		return index;
	}
}
