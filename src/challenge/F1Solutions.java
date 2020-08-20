package challenge;

import java.util.ArrayList;

public class F1Solutions {

    //solution to challenge zero

    //notes:
    // Questions to ask for clarity - what if it is divisible by all 3? (technically all multiples of 6 so baz but could also print foo and bar?).
    // constraints : not technically named - in theory counts to infinity

    public static void printFooBarBaz(){
        double inf = Double.POSITIVE_INFINITY;
        for (int i = 1; i <=inf ; i++) {
            if (i % 6 == 0) {
                System.out.println("baz ");
            } else if (i % 2 == 0) {
                System.out.println("foo ");
            } else if (i % 3 == 0) {
                System.out.println("bar ");
            } else {
                System.out.println(i);
            }
        }
    }

    // Solution to challenge one
    public static String reverseCharacters(String input) {
        String[] sentence = input.split("\\s");
        String reverseString = "";
        for (String word : sentence) {
            StringBuilder string = new StringBuilder(word);
            string.reverse();
            reverseString = reverseString + string.toString() + " ";
        }
        return reverseString.trim();
    }

    class Node {
        public int value;
        public challenge.Node left;
        public challenge.Node right;

        public Node(int v, challenge.Node l, challenge.Node r) {
            this.value = v;
            this.left = l;
            this.right = r;
        }
    }

    public static void preOrder(challenge.Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.value + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static challenge.Node balancedTree(ArrayList<Integer> inputList) {
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

        return new challenge.Node(inputList.get(mid), balancedTree(left), balancedTree(right));
    }

    public static void main(String[] args) {

        //run challenge zero
        printFooBarBaz();


        //run challenge one
        System.out.println(reverseCharacters("the cat is fat"));
        System.out.println(reverseCharacters("band camp is great!"));

        //unit test challenge one
        System.out.println((reverseCharacters("the cat is fat")).equals("eht tac si taf"));
        System.out.println((reverseCharacters("band camp is great!")).equals("dnab pmac si !taerg"));


        //run challenge two
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
