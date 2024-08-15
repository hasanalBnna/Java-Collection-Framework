
package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;


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
    
    }
    
}
