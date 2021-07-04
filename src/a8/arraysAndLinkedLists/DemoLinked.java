package a8.arraysAndLinkedLists;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class DemoLinked {
	private static boolean addInOrder(LinkedList<String> linkedList, String newEntry) {
		ListIterator<String> listIterator = linkedList.listIterator();
		
		while (listIterator.hasNext()) {
			int comparison = listIterator.next().compareTo(newEntry);
			if (comparison == 0) {
				System.out.println("[debug] " + newEntry + " is already in the list.");
				return false;
			}
			if (comparison > 0) {
				listIterator.previous();
				listIterator.add(newEntry);
				return true;
			}
		}
		
		listIterator.add(newEntry);
		return true;
	}

	public static void main(String[] args) {
		LinkedList<String> placesToVisit = new LinkedList<>();
		placesToVisit.add("Grand Canaria");
		placesToVisit.add("Norwegen");
		placesToVisit.add("Amerika");
		placesToVisit.add("Kanada");
		placesToVisit.add("Erik");
		placesToVisit.add("Brad");
		placesToVisit.add("Shmee");
		
		printList(placesToVisit);
		
		placesToVisit.add(1, "Alice Springs");
		printList(placesToVisit);
		
		placesToVisit.remove(4);
		printList(placesToVisit);
		
		addInOrder(placesToVisit, "Afghanistan");
		printList(placesToVisit);
		placesToVisit.sort((s1, s2) -> s1.compareTo(s2)) ;
		printList(placesToVisit);
		addInOrder(placesToVisit, "Xylophone");
		addInOrder(placesToVisit, "Aaron");
		addInOrder(placesToVisit, "Alice Springs");
		addInOrder(placesToVisit, "Frankfurt");
		printList(placesToVisit);
		
		visit(placesToVisit);
		
	}
	
	private static void printList(LinkedList<String> linkedList) {
		Iterator<String> i = linkedList.iterator();
		while (i.hasNext()) {
			System.out.println("Now visiting: " + i.next());
		}
		System.out.println("===========================");
	}
	
	private static void printMenu() {
		System.out.println("0 - quit\r"
				+ "1 - visit next\r"
				+ "2 - visit previous\r"
				+ "3 - print menu\r");	
		
	}

	private static void visit (LinkedList<String> cities) {
		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		boolean goingForward = true;
		ListIterator<String> listIterator = cities.listIterator();
		
		if (cities.isEmpty()) {
			return;
		} else {
			printMenu();
			System.out.println("Now visiting: " + listIterator.next());
		}
		
		while (!quit) {
			int action = scanner.nextInt();
			scanner.nextLine();
			switch (action) {
			case 0:
				quit = true;
				System.out.println("Verlasse . . .");
				break;
			case 1:
				if (!goingForward) {
					if (listIterator.hasNext()) {
						listIterator.next();
					}
					goingForward = true;
				}
				if(listIterator.hasNext()) {
					System.out.println("Now visiting " + listIterator.next());
				} else {
					System.out.println("End of list reached.");
					goingForward = false;
				}
				break;
			case 2:
				if (goingForward) {
					if (listIterator.hasPrevious()) {
						listIterator.previous();
					}
					goingForward = false;
				}
				if(listIterator.hasPrevious()) {
					System.out.println("Now visiting " + listIterator.previous());
				} else {
					System.out.println("Beginning of list reached.");
					goingForward = true;
				}
				break;
			case 3:
				printMenu();
				break;
			default:
				break;
			}
		}
		
	}
	
}
