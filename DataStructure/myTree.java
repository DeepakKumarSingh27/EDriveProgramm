package RaghuSir.DataStructure;

public class myTree {
    class Node {
        Object data;
        Node left;
        Node right;

        Node(Object data) {
            this.data = data;
        }
    }

    Node root;

    public boolean add(Object data) {
        if (root == null) {
            root = new Node(data);
            return true;
        }
        return add(root, (Comparable) data);
    }

    public boolean add(Node rt, Comparable data) {
        if (data.compareTo(rt.data) == 0) {
            return false;
        }
        if (data.compareTo(rt.data) > 0) {
            if (rt.right == null) {
                rt.right = new Node(data);
                return true;
            }
            return add(rt.right, data);
        } else {
            if (rt.left == null) {
                rt.left = new Node(data);
                return true;
            }
            return add(rt.left, data);
        }
    }

    public void display() {
        if (root == null) {
            return;
        }
        inorder(root);
    }

    public void inorder(Node rt) {
        if (rt == null) {
            return;
        }
        inorder(rt.left);
        System.out.print(rt.data + " ");
        inorder(rt.right);
    }
    public void preorder(Node rt) {
        if (rt==null) {
            return;
        }
        System.out.print(rt.data+" ");
        preorder(rt.left);
        preorder(rt.right);
    }
    public void postorder(Node rt) {
        if (rt == null) {
            return;
        }
        postorder(rt.left);
        postorder(rt.right);
        System.out.print(rt.data+" ");
    }
    public int size() {
        return size(root,0);
    }
    public int size(Node rt,int count) {
        if (rt == null)
            return count;
        count++;
        count = size(rt.left,count);
        count = size(rt.right,count);
        return count;
    }
}

