

package List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
    //list
    List list = new ArrayList();
    list.add(10);
    list.add(20);
    list.add(30);
    list.add(2, 25);
    list.add("Banna");
    System.out.println(list);
    
    //specific data type ArrayList
    ArrayList<Integer> list2 = new ArrayList<>();
    list2.add(10);
    list2.add(20);
    list2.add(30);
    list2.add(1, 15);
    System.out.println(list2);
    
    //linkedList 
    LinkedList<Integer> list3 = new LinkedList<>();
    list3.add(20);
    list3.add(10);
    list3.add(1, 15);
    list3.remove(1);
    System.out.println(list3);
    }
    
}
