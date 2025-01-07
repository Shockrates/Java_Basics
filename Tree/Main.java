package Tree;

public class Main {
    
    public static void main(String[] args) {
        
        BinaryTree tree = new BinaryTree();

        tree.insert(5);
        tree.insert(51);
        tree.insert(8);
        tree.insert(12);
        tree.insert(15);
        tree.insert(9);
        tree.insert(21);

        tree.inOrder();
    }
}
