package project.euler.task011;

public class LargestProductInAGrid {

	public long apply(String grid, int limit) {
		FrameArray array = new FrameArray(limit);
		array.read(grid);
		return array.getMax();
	}
}
