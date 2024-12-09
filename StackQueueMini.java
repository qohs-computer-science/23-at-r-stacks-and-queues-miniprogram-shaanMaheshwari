import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

class StackQueueMini {
  public static void main(String[] args) {

    //PART 1

    Scanner myObj = new Scanner(System.in);
    
    Stack <Integer> numStack = new Stack<Integer>();

    System.out.print("Enter a whole number: ");
    int num1 = myObj.nextInt();
    numStack.push(num1);

    System.out.print("Enter a whole number: ");
    int num2 = myObj.nextInt();
    numStack.push(num2);

    System.out.print("Enter a whole number: ");
    int num3 = myObj.nextInt();
    numStack.push(num3);

    System.out.print("Enter a whole number: ");
    int num4 = myObj.nextInt();
    numStack.push(num4); 

    System.out.print("Enter a whole number: ");
    int num5 = myObj.nextInt();
    numStack.push(num5);
       
    System.out.println(numStack);
    
    Stack<Integer>tempStack = new Stack<Integer>();
    
    while(!numStack.isEmpty()){
        tempStack.push(numStack.pop());
    }

    while(!tempStack.isEmpty()){
        int popVal = tempStack.pop();
        numStack.push(popVal);
        numStack.push(popVal);
    }

    System.out.println("Doubled Stack: " + numStack);


    //PART 2

  } // end main
} // end class
