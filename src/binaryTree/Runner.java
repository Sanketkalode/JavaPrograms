package binaryTree;

/**
 * @author SanketKalode
 * @date 28-03-2024
 */
public class Runner {

    public static void main(String[] args) {

        Node node = new Node(5);

        BinaryTree tree = new BinaryTree();

        tree.insertNode(node);

        System.out.println(tree.getHead());

        tree.insertNode(new Node(7));
        tree.insertNode(new Node(1));
        tree.insertNode(new Node(3));
        tree.insertNode(new Node(54));
        tree.insertNode(new Node(6));
        tree.insertNode(new Node(4));
        System.out.println("Inorder traverse");
        tree.inOrderTraversal(tree.getHead());
        System.out.println("preorder traverse");
        tree.preOrderTraversal(tree.getHead());


    }
}
