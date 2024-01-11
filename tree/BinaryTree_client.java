package tree;

public class BinaryTree_client {
     public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
		bt.display();
        System.out.println(bt.max());
        System.out.println(bt.find(80));
        System.out.println(bt.ht());

        bt.PreOrder();
        bt.postOrder();
        bt.inorder();
        
    }
    
}
