

public class Node<T> {

    private String info;
    private Node liftNode = null;
    private Node RightNode = null;

    public String getInfo() {
        return info;
    }
    public void setInfo(String info) {
        this.info = info;
    }
    public Node getLiftNode() {
        return liftNode;
    }
    public void setLiftNode(Node liftNode) {
        this.liftNode = liftNode;
    }
    public Node getRightNode() {
        return RightNode;
    }
    public void setRightNode(Node rightNode) {
        RightNode = rightNode;
    }

}
