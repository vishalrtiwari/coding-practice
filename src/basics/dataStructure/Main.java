package basics.dataStructure;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[]args) {
        Stack  obj = new Stack(13);
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.push(5);
        obj.push(6);
        obj.push(7);
        obj.push(8);
        obj.push(9);
        obj.push(10);
        obj.pop();
        obj.pop();
        obj.pop();
        System.out.println( obj.getTop());
        obj.push(11);
        obj.push(12);
        System.out.println( obj.getTop());

    }
}


   class Stack
 {
     int arr[];
     int top;
     int length;


     Stack(int n) {
         arr = new int[n];
         top = -1;
         length = arr.length;
     }

     Stack() {
         arr = new int[10];
         top = -1;
         length = 10;
     }


     public int pop() {
         int n = 0;
         if (top > -1) {
             n = arr[top];
             arr[top] = 0;
             top = top - 1;


         }
         return n;

     }

     public void push(int n) {
         if (top < length) {
             top = top + 1;
             arr[top] = n;
         }


     }

     public int getTop() {
         return arr[top];
     }
 }
