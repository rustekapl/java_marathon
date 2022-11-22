package day18;

public class Task3 {


    public static void main(String[] args) {

        Node root = new Node(20);
        int[] numbers = {14, 23, 11, 16, 22, 27, 5, 15, 18, 24, 150, 8};

        for (int number : numbers) {
            insertNode(number, root);
        }

        dfs(root);
    }

    private static void dfs(Node node) {
        if (node == null) {
            return;
        }
        dfs(node.getLeftChild());
        System.out.print(node.getValue() + " ");
        dfs(node.getRightChild());
    }

    private static void insertNode(int value, Node root) {
        Node currentNode = null;
        Node nextNode = root;

        while (nextNode != null) {
            currentNode = nextNode;

            if (value < currentNode.getValue()) {
                nextNode = currentNode.getLeftChild();
            } else {
                nextNode = currentNode.getRightChild();
            }
        }
        if (value < currentNode.getValue()) {
            currentNode.setLeftChild(new Node(value));
        } else {
            currentNode.setRightChild(new Node(value));
        }
    }
}