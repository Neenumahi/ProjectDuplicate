package test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Duplicates {
public static void main(String[] args) {
		
		List<Integer> ex1 = new ArrayList<Integer>();
		
		ex1.add(1000);
		ex1.add(50);
		ex1.add(2000);
		ex1.add(3000);
		ex1.add(60);
		System.out.println(ex1);
		List<Integer> li = new LinkedList<Integer>();
		li.add(50);
		li.add(100);
		li.add(10);
		li.add(20);
		li.addAll(ex1);
		System.out.println(li);

}
}