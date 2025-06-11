class Node{
    int key;
    Node left,right;

    public Node(int item){
        key=item;
        left=right=null;
    }
}
class BinaryTree{
    Node root;
     void inorder(Node node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.key + " ");
            inorder(node.right);
        }
    }
     void postorder(Node node) {
        if (node != null) {
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.key + " ");
        }
    }
     void preorder(Node node) {
        if (node != null) {
            System.out.print(node.key + " ");
            preorder(node.left);
            preorder(node.right);
        }
    }
public static void main(String[] args){
    BinaryTree tree=new BinaryTree();
    tree.root=new Node(7);
    tree.root.left=new Node(4);
    tree.root.right=new Node(11);
    tree.root.left.right=new Node(5);
    tree.root.left.left=new Node(1);
    tree.root.right.left=new Node(9);
    tree.root.right.right=new Node(12);
    tree.root.right.left.right=new Node(10);
    tree.root.right.right.right=new Node(15);
    System.out.println("Binary Tree(Inorder):");
    tree.inorder(tree.root);
    System.out.println();
    System.out.println("Binary Tree(preorder):");
    tree.preorder(tree.root);
    System.out.println();
    System.out.println("Binary Tree(postorder):");
    tree.postorder(tree.root);
    System.out.println();
}
}