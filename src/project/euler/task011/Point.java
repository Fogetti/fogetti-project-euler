package project.euler.task011;

public class Point {
	int i;
	int j;
	int value = 0;

	Point() {}

	Point(Point other) {
		i = other.i;
		j = other.j;
		value = other.value;
	}

	@Override
	public String toString() {
		return "Point [i=" + i + ", j=" + j + ", value=" + value + "]";
	}
}