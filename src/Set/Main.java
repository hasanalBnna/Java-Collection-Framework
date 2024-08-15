
package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class Main {


    public static void main(String[] args) {
        //Hashset
        Set<Integer> set= new HashSet<>();
        set.add(10);
        set.add(5);
        set.add(16);
        set.add(5);
        System.out.println("HashSet= "+set);
        
        //LinkedHashSet
        LinkedHashSet<Integer> lhset = new LinkedHashSet<>();
        lhset.add(5);
        lhset.add(2);
        lhset.add(2);
        lhset.add(10);
        System.out.println("LinkedHashSet= "+lhset);
        boolean bl = lhset.contains(2);// check 2 is present or not
        System.out.println("2 is present not= "+bl);
        
        //TreeSet
        System.out.println("TreeSet = Ascending order");
        TreeSet<Integer> tset = new TreeSet<>();
        tset.add(20);
        tset.add(5);
        tset.add(10);
        tset.add(12);
        tset.add(6);
        tset.add(6);
        System.out.println("TreeSet = "+tset);
    
    }
    
}
