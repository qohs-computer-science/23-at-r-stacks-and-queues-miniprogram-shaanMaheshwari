//Shaan Maheshwari, pd. 3, 12/9/24
//This program utilizes the Stack and Queue to store values and then traverse through them to perform certain tasks. The stack is used to create dupes of each value already in it and put it next to the original value. Tne Queue sorts the values by even or odd and puts it back in order.
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
       
    System.out.println("Origianl Stack: " + numStack);
    
    Stack<Integer>tempStack = new Stack<Integer>();
    
    while(!numStack.isEmpty()){
        tempStack.push(numStack.pop());
    }//end while

    while(!tempStack.isEmpty()){
        int popVal = tempStack.pop();
        numStack.push(popVal);
        numStack.push(popVal);
    }//end while

    System.out.println("Doubled Stack: " + numStack);

    //PART 2

    Queue<Integer> numQueue = new LinkedList<>();
    
    System.out.print("Enter a whole number: ");
    int q1 = myObj.nextInt();
    numQueue.add(q1);
    
    System.out.print("Enter a whole number: ");
    int q2 = myObj.nextInt();
    numQueue.add(q2);
    
    System.out.print("Enter a whole number: ");
    int q3 = myObj.nextInt();
    numQueue.add(q3);

    System.out.print("Enter a whole number: ");
    int q4 = myObj.nextInt();
    numQueue.add(q4);

    System.out.print("Enter a whole number: ");
    int q5 = myObj.nextInt();
    numQueue.add(q5);

    System.out.print("Enter a whole number: ");
    int q6 = myObj.nextInt();
    numQueue.add(q6);

    System.out.print("Enter a whole number: ");
    int q7 = myObj.nextInt();
    numQueue.add(q7);

    System.out.print("Enter a whole number: ");
    int q8 = myObj.nextInt();
    numQueue.add(q8);

    System.out.print("Enter a whole number: ");
    int q9 = myObj.nextInt();
    numQueue.add(q9);

    System.out.print("Enter a whole number: ");
    int q10 = myObj.nextInt();
    numQueue.add(q10);

    System.out.println("Origianl Queue: " + numQueue);

    Queue<Integer> tempQueue1 = new LinkedList<>();
    Queue<Integer> tempQueue2 = new LinkedList<>();
    
    while(!numQueue.isEmpty()){
      if(numQueue.peek() % 2 == 0){
        tempQueue1.add(numQueue.remove());
      } else {
        tempQueue2.add(numQueue.remove());
      }//end if else
    }//end while

    while(!tempQueue2.isEmpty()){
      tempQueue1.add(tempQueue2.remove());
    }//end while

    while(!tempQueue1.isEmpty()){
      numQueue.add(tempQueue1.remove());
    }//end while

    System.out.println("Sorted Queue: " + numQueue);
  } // end main
} // end class
