package Exercise1;

import java.util.ArrayList;

public class Tester {
	public static void main(String[] args) {
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		arr1.add(123);
		arr1.add(234);
		arr1.add(541);
		arr1.add(381);
		Pair<Integer> pair1 = Util.getMinMax(arr1);
		System.out.println("Max: " + pair1.max() + " Min: " + pair1.min());
		
		ArrayList<String> arr2 = new ArrayList<String>();
		arr2.add("apple");
		arr2.add("zoom");
		Pair<String> pair2 = Util.getMinMax(arr2);
		System.out.println("Max: " + pair2.max() + " Min: " + pair2.min());
		
		ArrayList<Double> arr3 = new ArrayList<Double>();
		arr3.add(1.2213);
		Pair<Double> pair3 = Util.getMinMax(arr3);
		System.out.println("Max: " + pair3.max() + " Min: " + pair3.min());
	}
}
