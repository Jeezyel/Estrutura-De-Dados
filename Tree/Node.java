
/* 
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

}*/


public class Node {
    String information;
    Node left;
    Node right;

    public Node(String inf){
        this.information = inf;
        left = right = null;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
