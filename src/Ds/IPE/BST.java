package Ds.IPE;

//binary search tree
public class BST {
    Node root = null;

    void insert(int data) {
        Node n = new Node(data);
        if (root == null) {
            root = n;
            return;
        }
        Node temp = root;
        while (true) {
            if (data < temp.data) {
                if (temp.left == null) {
                    temp.left = n;
                    return;
                }
                temp = temp.left;
            } else {
                if (temp.right == null) {
                    temp.right = n;
                    return;
                }
                temp = temp.right;
            }
        }
    }

    boolean search(int data) {
        if (root == null) {
            return false;
        }
        Node temp = root;
        while (temp != null) {
            if (temp.data == data) {
                return true;
            } else if (data < temp.data) {
                temp = temp.left;
            } else {
                temp = temp.right;
            }
        }
        return false;
    }

    void display() {
        inOrder(root);
        System.out.println();
    }

    void delete(int data) {
        root = deleteRec(root, data);
    }

    Node deleteRec(Node root, int data) {
        if (root == null) {
            return root;
        }

        if (data < root.data) {
            root.left = deleteRec(root.left, data);
        } else if (data > root.data) {
            root.right = deleteRec(root.right, data);
        } else {
            // Node with only one child or no child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }


            root.data = minValue(root.right);

            // Delete the inorder successor
            root.right = deleteRec(root.right, root.data);
        }
        return root;
    }

    int minValue(Node root) {
        int minv = root.data;
        while (root.left != null) {
            minv = root.left.data;
            root = root.left;
        }
        return minv;

    }

    int maxValue(Node root){
        int maxv=root.data;
        while (root.right!=null){
            maxv=root.right.data;
            root=root.right;
        }
        return maxv;
    }

    void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.data + " ");
            inOrder(node.right);
        }
    }

    class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
}
