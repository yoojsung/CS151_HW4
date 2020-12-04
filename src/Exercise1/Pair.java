package Exercise1;

public class Pair<T> {
	private T obj1;
	private T obj2;
	public Pair(T a, T b) {
		obj1 = a;
		obj2 = b;
	}
	public T max() {
		return obj1;
	}
	public T min() {
		return obj2;
	}
}
