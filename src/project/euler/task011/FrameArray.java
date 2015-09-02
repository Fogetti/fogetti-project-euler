package project.euler.task011;

import java.util.TreeSet;

public class FrameArray {

	private Frame[][] grid;
	private int limit;

	FrameArray(int limit) {
		this.grid = new Frame[limit][limit];
		this.limit = limit;
	}

	public void add(long index, String integer) {
		int i = (int)(index / limit);
		int j = (int)(index % limit);
		grid[i][j] = new Frame(i, j, Integer.valueOf(integer), this);
	}

	public Point get(int i, int j) {
		Frame frame = grid[i][j];
		return frame.point;
	}

	public void read(String gridStr) {
		String[] split = gridStr.split("\\s");
		for (int i = 0; i < split.length; i++) {
			add(i, split[i]);
		}
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				Frame frame = grid[i][j];
				if (frame != null) frame.init();
			}
		}
	}

	public boolean isValid(Point point) {
		return (point.i >= 0
				&& point.j >= 0
				&& point.i < limit
				&& point.j < limit
				&& grid[point.i][point.j] != null) ? true : false; 
	}

	public long getMax() {
		TreeSet<Frame> maxTree = new TreeSet<>();
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				Frame frame = grid[i][j];
				if (frame != null) maxTree.add(frame);
			}
		}
		System.out.println(maxTree);
		return maxTree.last().productOf();
	}
}