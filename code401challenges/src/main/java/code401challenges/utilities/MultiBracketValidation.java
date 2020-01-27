package code401challenges.utilities;

import java.util.Stack;

public class MultiBracketValidation {

    public static void main(String[] args){
        System.out.println(multiBracketValidation("{}{Code}[Fellows](())"));
        System.out.println(multiBracketValidation("[({}]"));
        System.out.println(multiBracketValidation("(]("));
    }
    // Your function should take a string as its only
    // argument, and should return a boolean representing
    // whether or not the brackets in the string are
    // balanced. There are 3 types of brackets:
    //
    //Round Brackets : ()
    //Square Brackets : []
    //Curly Brackets : {}
    public static boolean multiBracketValidation(String input){
        Stack<Character> temp = new Stack<>();
        char[] inputChar = input.toCharArray();

        for (char ch : inputChar ) {
//            System.out.println("ch = " + ch);
            if((ch == '(') || (ch =='{') || (ch == '[')) {
                temp.add(ch);
            }
            else if(ch == ')'){
                if (temp.peek() == '(') {
                    temp.pop();
                }
            }
            else if(ch == '}'){
                if (temp.peek() == '{') {
                    temp.pop();
                }
            }
            else if(ch == ']'){
                if (temp.peek() == '[') {
                    temp.pop();
                }
            }
        }
        return temp.isEmpty();
    }
}
