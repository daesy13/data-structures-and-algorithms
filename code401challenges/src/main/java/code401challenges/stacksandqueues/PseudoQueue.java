package code401challenges.stacksandqueues;
// resource https://coderbyte.com/algorithm/implement-queue-using-two-stacks

public class PseudoQueue {
    public Stack enqueueStack;
    public Stack dequeueStack;


    public PseudoQueue(){
        enqueueStack = new Stack();
        dequeueStack = new Stack();
    }

//    public static void main(String[] args) {
//        System.out.println("Main method is working!");
//        Stack p = new Stack();
//        p.push(1);
//        p.push(2);
//        p.push(3);
//        String str = p.toString();
//        System.out.println(str.toString());
//    }

    public void enqueue(int value){
        while(!dequeueStack.isEmpty()) {
            enqueueStack.push(dequeueStack.pop());
        }
        // push new value into stackOne
        enqueueStack.push(value);
    }

    public int dequeue(){
        // while "stackOne" is not empty
        while(!enqueueStack.isEmpty()){
            // push values into new "stackTwo", this will push items to the
            // other extreme and pop them at the same time from their
            // original position, this action will upload the values backwards
            dequeueStack.push(enqueueStack.pop());
        }
        // now that they are backwards we can delete the first(previously last) item
        // which follows the FIFO method for dequeue
        return dequeueStack.pop();
    }
}
