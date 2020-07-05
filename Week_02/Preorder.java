package algorithm;

import org.mockito.internal.creation.bytebuddy.MockMethodInterceptor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Preorder {
    public static void main(String[] args) {
        List<Node> rootChildren = new ArrayList<Node>();
        List<Node> child_1_children = new ArrayList<Node>();
        Node rootC1 = new Node(3, child_1_children);
        Node rootC2 = new Node(2, null);
        Node rootC3 = new Node(4, null);
        rootChildren.add(rootC1);rootChildren.add(rootC2);rootChildren.add(rootC3);
        Node root = new Node(1, rootChildren);
        Node child_1_1 = new Node(5, null);
        Node child_1_2 = new Node(6, null);
        child_1_children.add(child_1_1);child_1_children.add(child_1_2);
        Preorder preorder = new Preorder();
        System.out.println(preorder.solution(root));
    }

    public List<Integer> solution(Node root) {
        List<Integer> result = new ArrayList<>();
        process(root, result);
        return result;
    }

    public void process(Node root, List<Integer> result) {
        if (root == null) return;
        result.add(root.val);
        List<Node> children = root.children;
        if (children != null)
            for (Iterator<Node> iterator = children.iterator(); iterator.hasNext(); ) process(iterator.next(),result);
    }

    static class Node {
        public int val;

        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
}
