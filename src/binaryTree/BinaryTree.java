package binaryTree;

/**
 * @author SanketKalode
 * @date 28-03-2024
 */
public class BinaryTree {

    private Node head;

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    void inOrderTraversal(Node node){
        if (node.getLeft() != null){
            inOrderTraversal(node.getLeft());
        }
        System.out.println(node.getData());
        if (node.getRight() != null){
            inOrderTraversal(node.getRight());
        }
    }

    void preOrderTraversal(Node node){
        System.out.println(node.getData());
        if (node.getLeft() != null){
            inOrderTraversal(node.getLeft());
        }
        if (node.getRight() != null){
            inOrderTraversal(node.getRight());
        }
    }

    void deleteNode(int value){

    }

    void  insertNode(Node node){
        if (this.head == null){
            this.head = node;
        }else {
            Node newNode = this.head;

            while (true){
                if(newNode.getData() >= node.getData() ){
                    if (newNode.getLeft() == null){
                        newNode.setLeft(node);
                        break;
                    }
                    else {
                        newNode = newNode.getLeft();
                    }
                }
                else if (newNode.getData() < node.getData()){
                    if (newNode.getRight() == null){
                        newNode.setRight(node);
                        break;
                    }else {
                        newNode = newNode.getRight();
                    }
                }
            }
        }
    }


}
