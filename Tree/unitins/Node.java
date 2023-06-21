package unitins;

public class Node {

	private String info;
	private Node leftNode;
	private Node rightNode;
    private Integer heigth ;

	

	public Integer getHeigth() {
        return heigth;
    }

    public void setHeigth(Integer heigth) {
        this.heigth = heigth;
    }

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
	
	@Override
    public String toString() {
		return info; 
	}

}