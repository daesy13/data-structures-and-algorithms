package code401challenges.stacksandqueues;

public class PseudoQueue {
    public Stack <any> front;
    public Stack <any> back;

    public PseudoQueue(){
        front = null;
    }

    public static void main(String[] args) {
        System.out.println("Main method is working!");
    }

    public void enqueue(int value){
//        Queue newQueue = new Queue();
        while(front != null){
            front.push(value);
        }
    }
}
