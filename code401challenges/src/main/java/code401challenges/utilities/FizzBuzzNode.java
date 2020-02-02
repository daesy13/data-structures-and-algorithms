package code401challenges.utilities;

public class FizzBuzzNode {

    public String value;
    public FizzBuzzNode left;
    public FizzBuzzNode right;

    // constructor Node
    public FizzBuzzNode(String value, FizzBuzzNode left, FizzBuzzNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    // convert node into String
    @Override
    public String toString() {
        return "FizzBuzzNode{" + value + '\'' + '}';
    }
}

