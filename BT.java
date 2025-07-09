public class BT {
    class Node {
        int data;
        Node l, right;

        Node(int a) {
            data = a;
            l = right = null;
        }
    }

    Node root = null;

    // Insert into Binary Search Tree (BST)
    Node insert(Node root, int k) {
        if (root == null) {
            return new Node(k);
        }
        if (k < root.data) {
            root.l = insert(root.l, k);
        } else if (k > root.data) {
            root.right = insert(root.right, k);
        }
        return root;
    }

    // Preorder traversal: Root → Left → Right
    void preorder(Node a) {
        if (a == null) return;
        System.out.print(a.data + " ");
        preorder(a.l);
        preorder(a.right);
    }

    // Inorder traversal: Left → Root → Right
    void inorder(Node a) {
        if (a == null) return;
        inorder(a.l);
        System.out.print(a.data + " ");
        inorder(a.right);
    }

    // Postorder traversal: Left → Right → Root
    void postorder(Node a) {
        if (a == null) return;
        postorder(a.l);
        postorder(a.right);
        System.out.print(a.data + " ");
    }

    // Search in BST
    boolean find(Node root, int a) {
        if (root == null) return false;

        if (root.data == a) {
            return true;
        } else if (a < root.data) {
            return find(root.l, a);
        } else {
            return find(root.right, a);
        }
    }

    public static void main(String[] args) {
        BT obj = new BT();
        int[] arr = {5, 7, 11, 1, 3};
        for (int val : arr) {
            obj.root = obj.insert(obj.root, val);
        }

        System.out.println("Inorder:");    // Should be sorted: 1 3 5 7 11
        obj.inorder(obj.root);

        System.out.println("\nPreorder:");
        obj.preorder(obj.root);

        System.out.println("\nPostorder:");
        obj.postorder(obj.root);

        System.out.println("\nFinding 3: " + obj.find(obj.root, 3)); // true
        System.out.println("Finding 9: " + obj.find(obj.root, 9)); // false
    }
}
