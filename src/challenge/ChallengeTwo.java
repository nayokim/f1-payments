package challenge;

import java.util.ArrayList;

//helper class - given
class Node {
    public int value;
    public Node left;
    public Node right;

    public Node(int v, Node l, Node r) {
        this.value = v;
        this.left = l;
        this.right = r;
    }
}

public class ChallengeTwo {

    //for testing purposes
    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.value + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static Node balancedTree(ArrayList<Integer> inputList) {
        int mid = (inputList.size()) / 2;

        if (inputList.size() == 0) {
            return null;
        }

        ArrayList<Integer> left = new ArrayList<Integer>();
        for (int i = 0; i < mid; i++) {
            left.add(inputList.get(i));
        }

        ArrayList<Integer> right = new ArrayList<Integer>();
        for (int j = mid + 1; j < inputList.size(); j++) {
            right.add(inputList.get(j));
        }

        return new Node(inputList.get(mid), balancedTree(left), balancedTree(right));
    }


    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        preOrder(balancedTree(arrayList));
    }
}


