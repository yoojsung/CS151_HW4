package Exercise1;

import java.util.ArrayList;

public class Util<T extends Comparable<T>> {
	public static <T extends Comparable<T>> Pair<T> getMinMax(ArrayList<T> a) {
		T max = a.get(0);
		T min = a.get(0);
		for (T obj : a) {
			if (obj.compareTo(max) > 0) {
				max = obj;
			}
			else if (obj.compareTo(min) < 0) {
				min = obj;
			}
		}
		return new Pair<T>(max, min);
	}
}
