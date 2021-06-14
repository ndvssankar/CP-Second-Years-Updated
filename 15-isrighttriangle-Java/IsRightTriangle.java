// isrighttriangle(x1, y1, x2, y2, x3, y3)[5pts]
// Write the function isrighttriangle(x1, y1, x2, y2, x3, y3) that takes 6 int or float values that
// represent the vertices (x1,y1), (x2,y2), and (x3,y3) of a triangle, and returns True if that is
// a right triangle and False otherwise. You may wish to write a helper function,
// distance(x1, y1, x2, y2), which you might call several times. Also, remember to use
// almostEqual (instead of ==) when comparing floats.

public class IsRightTriangle {
	// public boolean isRightTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
	// 	// Your code goes here
	// 	return false;
	// }
	public boolean isRightTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
		double a = distance(x1, y1, x2, y2);
		double b = distance(x2, y2, x3, y3);
		double c = distance(x3, y3, x1, y1);
		if ((a > 0 && b > 0 && c > 0) && (a == (b + c) || b == (a + c) || (c == (a + b))))
			return true;
		return false;
	}
	static double distance(int x1, int x2, int y1, int y2) {
		return (Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2));
	}
}