package unitins;

public class Tree {

	private Node rootNode = null;

    public boolean isEmpty() {
        return rootNode == null;
    }

    private void addNode(String info, Node subRoot) {
        if (isEmpty()) {
            rootNode = new Node(info);
        } else {
            if (compare(info, subRoot.getInformation()) == Eenum.BIGGER) {
                if (subRoot.getRightNode() == null) {
                    subRoot.setRightNode(new Node(info));
                } else {
                    addNode(info, subRoot.getRightNode());
                }
            } else if (compare(info, subRoot.getInformation()) == Eenum.SMALLER) {
                if (subRoot.getLeftNode() == null) {
                    subRoot.setLeftNode(new Node(info));
                } else {
                    addNode(info, subRoot.getLeftNode());
                }
            }
        }
    }

    private Eenum compare(String nodeA, String nodeB) {
        if (nodeA.compareTo(nodeB) > 0) {
            return Eenum.BIGGER;
        }

        if (nodeA.compareTo(nodeB) < 0) {
            return Eenum.SMALLER;
        }

        return Eenum.EQUALS;
    }

    public void add(String info) {
        addNode(info, rootNode);
    }

    private void preOrder(Node subRoot) {
        if (subRoot == null) {
            return;
        }

        System.out.println(subRoot.getInformation() + " ");
        preOrder(subRoot.getLeftNode());
        preOrder(subRoot.getRightNode());
    }

    private void inOrder(Node subRoot) {
        if (subRoot == null) {
            return;
        }

        inOrder(subRoot.getLeftNode());
        System.out.println(subRoot.getInformation() + " ");
        inOrder(subRoot.getRightNode());
    }

    private void posOrder(Node subRoot) {
        if (subRoot == null) {
            return;
        }

        posOrder(subRoot.getLeftNode());
        posOrder(subRoot.getRightNode());
        System.out.println(subRoot.getInformation() + " ");
    }

    public void preOrder() {
        preOrder(rootNode);
    }

    public void inOrder() {
        inOrder(rootNode);
    }

    public void posOrder() {
        posOrder(rootNode);
    }

    private boolean find(String value, Node subRoot) {
        if (subRoot == null) {
            return false;
        }

        if (compare(value, subRoot.getInformation()) == Eenum.EQUALS) {
            return true;
        } else if (compare(value, subRoot.getInformation()) == Eenum.BIGGER) {
            return find(value, subRoot.getRightNode());
        } else {
            return find(value, subRoot.getLeftNode());
        }
    }

    public boolean find(String value) {
        return find(value, rootNode);
    }

    private String delete(String value, Node subRoot) {
        if (subRoot == null) {
            return null;
        }

        Node aux = subRoot;

        if (compare(value, subRoot.getInformation()) == Eenum.SMALLER) {
            if (subRoot.getLeftNode() == null) {
                return null;
            } else if (compare(value, subRoot.getLeftNode().getInformation()) == Eenum.EQUALS) {
                aux = subRoot.getLeftNode();
                subRoot.setLeftNode(null);
                addNode(aux.getLeftNode(), rootNode);
                addNode(aux.getRightNode(), rootNode);

                return aux.getInformation();
            } else {
                return delete(value, subRoot.getLeftNode());
            }
        } else if (compare(value, subRoot.getInformation()) == Eenum.BIGGER) {
            if (subRoot.getRightNode() == null) {
                return null;
            } else if (compare(value, subRoot.getRightNode().getInformation()) == Eenum.EQUALS) {
                aux = subRoot.getRightNode();
                subRoot.setRightNode(null);
                addNode(aux.getLeftNode(), rootNode);
                addNode(aux.getRightNode(), rootNode);

                return aux.getInformation();
            } else
                return delete(value, subRoot.getRightNode());
        } else if (compare(value, subRoot.getInformation()) == Eenum.EQUALS) {
            rootNode = null;
            addNode(subRoot.getLeftNode(), rootNode);
            addNode(subRoot.getRightNode(), rootNode);
        }

        return null;
    }

    private void addNode(Node node, Node subRoot) {

        if (node == null) {
            return;
        }

        if (isEmpty()) {
            rootNode = node;
        } else {
            if (compare(node.getInformation(), subRoot.getInformation()) == Eenum.BIGGER) {
                if (subRoot.getRightNode() == null) {
                    subRoot.setRightNode(node);
                } else {
                    addNode(node, subRoot.getRightNode());
                }
            } else if (compare(node.getInformation(), subRoot.getInformation()) == Eenum.SMALLER) {
                if (subRoot.getLeftNode() == null) {
                    subRoot.setLeftNode(node);
                } else {
                    addNode(node, subRoot.getLeftNode());
                }
            }
        }
    }

    public String delete(String value) {
        return delete(value, rootNode);
    }

    private int fillHeight(Node subRoot) {

        if (subRoot == null) {
            return 0;
        }

        int leftHeight = fillHeight(subRoot.getLeftNode());
        int rightHeight = fillHeight(subRoot.getRightNode());

        int balance = leftHeight - rightHeight;

        if (balance < -1 || balance > 1) {
            //Balancear(subRoot);
            System.out.println(subRoot.getInformation() + " desbalanceado");
        }

        return (leftHeight > rightHeight ? leftHeight : rightHeight) + 1;

    }

    public void fillHeight() {
        fillHeight(rootNode);
    }
}