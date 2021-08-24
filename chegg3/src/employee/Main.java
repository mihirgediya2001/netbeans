package employee;

class Node {

    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

class BST {

    // Root of BST
    Node root;

    // Constructor
    BST() {
        root = null;
    }

    void insert(int key) {
        root = insertRecursive(root, key);
    }

    /*
     * A recursive function to insert a new key in BST
     */
    Node insertRecursive(Node root, int key) {

        /*
         * If the tree is empty, return a new node
         */
        if (root == null) {
            root = new Node(key);
            return root;
        }

        /* Otherwise, recur down the tree */
        if (key < root.key) {
            root.left = insertRecursive(root.left, key);
        } else if (key > root.key) {
            root.right = insertRecursive(root.right, key);
        }

        /* return the (unchanged) node pointer */
        return root;
    }

    void inorder() {
        inorderRecursive(root);
    }

    // do inorder traversal of BST
    void inorderRecursive(Node root) {
        if (root != null) {
            inorderRecursive(root.left);
            System.out.print(root.key + " ");
            inorderRecursive(root.right);
        }
    }

    public boolean findSubTreeOfThreeNodes(BST subtree) {
        Node curr = root;
        int ans = 0;

        // if subtree is not null
        if (subtree != null) {

            // search for the key
            while (curr != null) {
                if (curr.key == subtree.root.key) {

                    // check for the left key
                    if (curr.left != null && curr.left.left == null) {
                        if (curr.left.key == subtree.root.left.key) {
                            ans += 1;
                            return true;
                        }
                        return false;
                        // check for the right key
                    } else if (curr.right != null && curr.right.right == null) {
                        if (curr.right.key == subtree.root.right.key) {
                            ans += 1;
                            return true;
                        }
                        return false;
                    }
                } else if (curr.key > subtree.root.key) {
                    curr = curr.left;
                } else if (curr.key < subtree.root.key) {
                    curr = curr.right;
                }
            }
        }
        return ans == 2;
    }
}

public class Main {

    public static void main(String[] args) {
        BST T1 = new BST();
        BST T2 = new BST();
        BST T3 = new BST();
        BST T4 = new BST();

        T1.insert(15);
        T1.insert(7);
        T1.insert(20);
        T1.insert(3);
        T1.insert(10);
        T1.insert(18);
        T1.insert(22);

        T2.insert(20);
        T2.insert(18);
        T2.insert(22);

        T3.insert(20);
        T3.insert(14);
        T3.insert(22);

        T4.insert(7);
        T4.insert(3);
        T4.insert(10);

        // print inorder traversal of the BST
        System.out.println("Inorder traversal of T1: ");
        T1.inorder();
        System.out.println();

        System.out.println("Inorder traversal of T2: ");
        T2.inorder();
        System.out.println();

        System.out.println("Inorder traversal of T3: ");
        T3.inorder();
        System.out.println();

        System.out.println("Inorder traversal of T4: ");
        T4.inorder();
        System.out.println();

        if (T1.findSubTreeOfThreeNodes(T2)) {
            System.out.println("T2 is subtree of T1");
        } else {
            System.out.println("T2 is not subtree of T1");
        }

        if (T1.findSubTreeOfThreeNodes(T3)) {
            System.out.println("T3 is subtree of T1");
        } else {
            System.out.println("T3 is not subtree of T1");
        }

        if (T1.findSubTreeOfThreeNodes(T4)) {
            System.out.println("T4 is subtree of T1");
        } else {
            System.out.println("T4 is not subtree of T1");
        }
    }
}
