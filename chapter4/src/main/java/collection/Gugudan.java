package collection;

public class Gugudan {

	private int left;
	private int right;
	
	public Gugudan(int left, int right) {
		this.left=left;
		this.right=right;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + left;
		result = prime * result + right;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gugudan other = (Gugudan) obj;
		if (left != other.left)
			return false;
		if (right != other.right)
			return false;
		return true;
	}
	
	
}
