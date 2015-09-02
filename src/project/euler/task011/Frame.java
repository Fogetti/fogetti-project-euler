package project.euler.task011;

public class Frame implements Comparable<Frame> {
	
	Point point;
	private Horizontal horizontal;
	private DiagonalSE diagonalSE;
	private DiagonalNE diagonalNE;
	private Vertical vertical;
	private FrameArray arr;
	
	private abstract class Adjacent {
		protected Point[] points = new Point[4];
		
		abstract Point testPoint(Point point);
		abstract void initNormalPoints();
		abstract long productOf();
		
		Adjacent(Point point) {
			if (arr.isValid(testPoint(point))) {
				initNormalPoints();
			} else {
				initNullPoints();
			}
		}
		
		void initNullPoints() {
			Point nullPoint = new Point();
			points[0] = nullPoint;
			points[1] = nullPoint;
			points[2] = nullPoint;
			points[3] = nullPoint;
		}
	}
	
	private class Horizontal extends Adjacent {
		Horizontal(Point point) {
			super(point);
		}
		
		@Override
		Point testPoint(Point point) {
			Point other = new Point(point);
			other.j += 3;
			return other;
		}
		
		@Override
		void initNormalPoints() {
			points[0] = arr.get(point.i, point.j);
			points[1] = arr.get(point.i, point.j+1);
			points[2] = arr.get(point.i, point.j+2);
			points[3] = arr.get(point.i, point.j+3);
		}
		
		@Override
		long productOf() {
			return points[0].value*points[1].value*points[2].value*points[3].value;
		}
	}
	
	private class DiagonalSE extends Adjacent {
		DiagonalSE(Point point) {
			super(point);
		}
		@Override
		Point testPoint(Point point) {
			Point p3 = new Point(point);
			p3.i += 3;
			p3.j += 3;
			return p3;
		}
		
		@Override
		void initNormalPoints() {
			points[0] = arr.get(point.i, point.j);
			points[1] = arr.get(point.i+1, point.j+1);
			points[2] = arr.get(point.i+2, point.j+2);
			points[3] = arr.get(point.i+3, point.j+3);
		}
		@Override
		long productOf() {
			return points[0].value*points[1].value*points[2].value*points[3].value;
		}
	}
	
	private class DiagonalNE extends Adjacent {
		DiagonalNE(Point point) {
			super(point);
		}
		@Override
		Point testPoint(Point point) {
			Point p3 = new Point(point);
			p3.i -= 3;
			p3.j += 3;
			return p3;
		}			
		@Override
		void initNormalPoints() {
			points[0] = arr.get(point.i, point.j);
			points[1] = arr.get(point.i-1, point.j+1);
			points[2] = arr.get(point.i-2, point.j+2);
			points[3] = arr.get(point.i-3, point.j+3);
		}
		@Override
		long productOf() {
			return points[0].value*points[1].value*points[2].value*points[3].value;
		}
	}
	
	private class Vertical extends Adjacent {
		Vertical(Point point) {
			super(point);
		}
		@Override
		Point testPoint(Point point) {
			Point p3 = new Point(point);
			p3.i += 3;
			return p3;
		}			
		@Override
		void initNormalPoints() {
			points[0] = arr.get(point.i, point.j);
			points[1] = arr.get(point.i+1, point.j);
			points[2] = arr.get(point.i+2, point.j);
			points[3] = arr.get(point.i+3, point.j);
		}
		@Override
		long productOf() {
			return points[0].value*points[1].value*points[2].value*points[3].value;
		}
	}
	
	Frame(int i, int j, int value, FrameArray arr) {
		this.point = new Point();
		this.point.i = i;
		this.point.j = j;
		this.point.value = value;
		this.arr = arr;
	}
	
	public void init() {
		this.horizontal = new Horizontal(point);
		this.diagonalSE = new DiagonalSE(point);
		this.diagonalNE = new DiagonalNE(point);
		this.vertical = new Vertical(point);
	}

	public long productOf() {
		return Math.max(horizontal.productOf(), Math.max(diagonalSE.productOf(), Math.max(diagonalNE.productOf() ,vertical.productOf())));
	}
	
	@Override
	public int compareTo(Frame o) {
		return (productOf() < o.productOf()) ? -1 : ((productOf() == o.productOf()) ? 0 : 1);
	}

	@Override
	public String toString() {
		return "Frame [point=" + point + ", productOf()=" + productOf() + "]";
	}
}