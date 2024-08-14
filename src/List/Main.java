

package List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class Main {


    public static void main(String[] args) {
    //list
    List list = new ArrayList();
    list.add(10);
    list.add(20);
    list.add(30);
    list.add(2, 25);
    list.add("Banna");
    System.out.println("List= "+list);
    
    //specific data type ArrayList
    ArrayList<Integer> list2 = new ArrayList<>();
    list2.add(10);
    list2.add(20);
    list2.add(30);
    list2.add(1, 15);
    System.out.println("Arraylist= "+list2);
    
    //linkedList 
    LinkedList<Integer> list3 = new LinkedList<>();
    list3.add(20);
    list3.add(10);
    list3.add(1, 15);
    list3.remove(1);
    System.out.println("Linkedlist= "+list3);
    
    //vector
    Vector<String> vector = new Vector<>();
    vector.add("5");
    vector.add("10");
    vector.add("15");
    System.out.println("Vector= "+vector);
    
    //Stack 
    Stack<Integer> stack= new Stack<>();
    stack.push(10);
    stack.push(10);
    stack.push(20);
    System.out.println("Stack= "+stack);
    }
    
}
