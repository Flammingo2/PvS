package test;
import java.util.*;
import api.*;

import java.time.*;

public class Main {

	public static void main(String[] args) {
		//Create Collections-implementing class
		LinkedList<Pair<String, Integer>> list = new LinkedList<>();
		String x = "Niko";
		//create pairs
		Pair<String, Integer> pair1 = new Pair<>(x, 33);
		Pair<String, Integer> pair2 = new Pair<>("Tanja", 25);
		Pair<String, Integer> pair3 = new Pair<>("Leon", 24);
		Pair<String, Integer> pair4 = new Pair<>("Julian", 22);
		Pair<String, Integer> pair5 = new Pair<>("Noah", 23);
		Pair<String, Integer> pair6 = new Pair<>("Leonie", 21);
		Pair<String, Integer> pair7 = new Pair<>("Joni", 24);
		Pair<String, Integer> pair8 = new Pair<>("Joni", 26);
		Pair<String, String> pair9 = new Pair<>("Joni", "fg");
		//add pairs to LinkedList
		list.add(pair1);
		list.add(pair2);
		list.add(pair3);
		list.add(pair4);
		list.add(pair5);
		list.add(pair6);
		list.add(pair7);
		list.add(pair8);
		
		//control if generic work
		//list.add(pair9);
		//pair9.compareTo(pair7);
		
		//sort list and print out
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
		//test comparable implementation by adding pair
		Pair<String, Integer> pair10 = new Pair<>("Jojo", 22);
		Pair<String, Integer> pair11 = new Pair<>("Jojo", 22);
		list.add(pair10);
		list.add(pair11);
		//sort list again and print out
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
		//Create HashSet
		HashSet<Pair<String,Integer>> hashSet = new HashSet<>();
		 for(Iterator<Pair<String, Integer>> iter = list.iterator(); iter.hasNext(); ) {
			 Pair<String,Integer> elem = iter.next();
			 if(hashSet.contains(elem)) {
				 System.out.println(elem);
			 }
			 hashSet.add(elem);
		 }
		 
		 
		 //Aufgabe 3
		 //get date
		 LocalDate now = LocalDate.now();
		 System.out.println(now);
		 //get date of before 1 month
		 LocalDate minusMonth = now.minusMonths(1);
		 System.out.println(minusMonth);
		 //get date of before 4 weeks
		 LocalDate minusWeeks = now.minusWeeks(4);
		 System.out.println(minusWeeks);
		//-> not the same output as 1month is not the same amount of time as 4weeks
		 
		 //print week day of dates
		 System.out.println(minusMonth.getDayOfWeek());
		 System.out.println(minusWeeks.getDayOfWeek());
		 
		 
		 //Aufgabe 4
		 //Create game
		 char [][] sokoban = new char [7][];
		 sokoban [0] = "####### " . toCharArray ();
		 sokoban [1] = "#.....# " . toCharArray ();
		 sokoban [2] = "#..$..# " . toCharArray ();
		 sokoban [3] = "#.$@$.# " . toCharArray ();
		 sokoban [4] = "#..$..# " . toCharArray ();
		 sokoban [5] = "#.....# " . toCharArray ();
		 sokoban [6] = "####### " . toCharArray ();
		 //print out player position
		 System.out.println(Sokoban.findPlayer(sokoban));
		 
		 System.out.println(Sokoban.sokobanToString(sokoban));
		 System.out.println(Sokoban.move(sokoban, 1));
		 
		 System.out.println(Sokoban.sokobanToString(sokoban));
		 System.out.println(Sokoban.move(sokoban, 2));
		 
		 System.out.println(Sokoban.sokobanToString(sokoban));
		 System.out.println(Sokoban.move(sokoban, 3));
		 
		 System.out.println(Sokoban.sokobanToString(sokoban));
		 System.out.println(Sokoban.move(sokoban, 4));
		 
		 System.out.println(Sokoban.sokobanToString(sokoban));
		 System.out.println(Sokoban.move(sokoban, 4));
		 
		 System.out.println(Sokoban.sokobanToString(sokoban));
		 System.out.println(Sokoban.move(sokoban, 4));
		 System.out.println(Sokoban.sokobanToString(sokoban));
	}

}
