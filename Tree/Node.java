

public class Node {

	private String info;
	private Node leftNode;
	private Node rightNode;

	public Node(String info) {
		this.info = info;
		this.leftNode = null;
		this.rightNode = null;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public Node getLeft() {
		return leftNode;
	}

	public void setLeft(Node leftNode) {
		this.leftNode = leftNode;
	}

	public Node getRight() {
		return rightNode;
	}

	public void setRight(Node rightNode) {
		this.rightNode = rightNode;
	}

}