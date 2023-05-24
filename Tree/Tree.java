public class Tree {

	private Node rootNode;

	public boolean isEmpty() {
		return rootNode == null;
	}

	// Inserir
	public void addNode1(String info) {
		if (isEmpty()) {
			rootNode = new Node(info);
		} else {
			addNode2(info, rootNode);
		}
	}

	private void addNode2(String info, Node subRoot) {
		if (info.compareTo(subRoot.getInfo()) < 0) {
			if (subRoot.getLeft() == null) {
				subRoot.setLeft(new Node(info));
			} else {
				addNode2(info, subRoot.getLeft());
			}
		} else if (info.compareTo(subRoot.getInfo()) > 0) {
			if (subRoot.getRight() == null) {
				subRoot.setRight(new Node(info));
			} else {
				addNode2(info, subRoot.getRight());
			}
		}
	}

	// Procurar
	public boolean find1(String info) {
		return find2(info, rootNode);
	}

	public boolean find2(String info, Node subRoot) {

		try {
			if (subRoot == null)
				return false;
		} catch (Exception e) {

		}

		if (info.compareTo(subRoot.getInfo()) == 0) {
			return true;
		} else if (info.compareTo(subRoot.getInfo()) > 0) {
			return find2(info, subRoot.getRight());
		} else {
			return find2(info, subRoot.getLeft());
		}
	}

    public int filHeiht ( int valor , Node subRoot){
        if(subRoot == null){
            System.out.println(valor);
            return valor; 
        }
        return  filHeiht(valor + 1 , subRoot.getRight()) - filHeiht(valor + 1 , subRoot.getLeft());
       
    }

	// Remover
	public void delete(String info) {
		rootNode = remove2(rootNode, info);
	}

	private Node remove2(Node current, String info) {
		if (current == null) {
			return null;
		}

		if (info.compareTo(current.getInfo()) < 0) {
			current.setLeft(remove2(current.getLeft(), info));
		} else if (info.compareTo(current.getInfo()) > 0) {
			current.setRight(remove2(current.getRight(), info));
		} else {
			if (current.getLeft() == null) {
				return current.getRight();
			} else if (current.getRight() == null) {
				return current.getLeft();
			}

			Node temp = findMinNode(current.getRight());
			current.setInfo(temp.getInfo());
			current.setRight(remove2(current.getRight(), temp.getInfo()));
		}

		return current;
	}

	private Node findMinNode(Node node) {
		Node current = node;
		while (current.getLeft() != null) {
			current = current.getLeft();
		}
		return current;
	}

	// Printar
	public void printPreOrder() {
		System.out.print("Pre-order: ");
		printPreOrder(rootNode);
		System.out.println();
	}

	private void printPreOrder(Node node) {
		if (node != null) {
			System.out.print(node.getInfo() + " ");
			printPreOrder(node.getLeft());
			printPreOrder(node.getRight());
		}
	}

	public void printInOrder() {
		System.out.print("In-order: ");
		printInOrder(rootNode);
		System.out.println();
	}

	private void printInOrder(Node node) {
		if (node != null) {
			printInOrder(node.getLeft());
			System.out.print(node.getInfo() + " ");
			printInOrder(node.getRight());
		}
	}

	public void printPostOrder() {
		System.out.print("Post-order: ");
		printPostOrder(rootNode);
		System.out.println();
	}

	private void printPostOrder(Node node) {
		if (node != null) {
			printPostOrder(node.getLeft());
			printPostOrder(node.getRight());
			System.out.print(node.getInfo() + " ");
		}
	}

}