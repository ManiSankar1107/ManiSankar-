class BinarySearchTree {
    // Node class representing each node in the BST
    class Node
     {
        int key;
        Node left, right;

        public Node(int item) 
        {
            key = item;
            left = right = null;
        }
    }
    Node root;
    // Constructor
    BinarySearchTree() 
    {
        root = null;
    }
    // Insert a new key
    void insert(int key) 
    {
        root = insertRec(root, key);
    }
    // Recursive insert function
    Node insertRec(Node root, int key)
     {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);
        return root;
    }
    // Inorder traversal (Left, Root, Right)
    void inorder() 
    {
        inorderRec(root);
    }
    void inorderRec(Node root) 
    {
        if (root != null) 
        {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    } 
    void preorder()
    {
        preorderRec(root);
    }
    void preorderRec(Node root)
    {
        if(root!=null)
        {
            System.out.print(root.key+" ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }
    void postorder()
    {
        postorderRec(root);
    }
    void postorderRec(Node root)
    {
        if(root!=null)
        {
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.key+" ");
        }
    }
    int getMaxDepth() {
        return maxDepth(root);
    }

    int maxDepth(Node root) {
        if (root == null)
            return 0;
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return Math.max(leftDepth, rightDepth) + 1;
    }

    // ✅ Min depth of tree
    int getMinDepth() {
        return minDepth(root);
    }
    int minDepth(Node root) {
        if (root == null)
            return 0;
        int leftDepth = minDepth(root.left);
        int rightDepth = minDepth(root.right);
        return Math.max(leftDepth, rightDepth)+1;
    }
    // Main method to test the BST
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
       int[] values={13,48,22,57,91,36,81,4,75,29,65,18,93,41,54,24,69,8,79,33,50,16,87,28,61,44,19,97,72,11};
       for(int value:values){
        tree.insert(value);
       }
        System.out.print("Inorder traversal:");
        tree.inorder();
        System.out.println();

        System.out.print("preorder traversal:");
        tree.preorder();
        System.out.println();

        System.out.print("postorder traversal:");
        tree.postorder();
        System.out.println();
        System.out.println("min depth:"+tree.getMaxDepth());
        System.out.println("max depth:"+tree.getMinDepth());
    }
}