package project.euler.task001;

public class Test {

	@Override
	public Test clone() {
		try {
			return (Test) super.clone();
		} catch(CloneNotSupportedException e) {
			throw new AssertionError();
		}
	}
}
