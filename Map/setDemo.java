package Map;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class setDemo {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();//have unique values
         set.add(1);
          set.add(2);
         set.add(5553);
         set.add(4);
         System.out.println(set);
         System.out.println();
        //set bhi kisi bhi order me print hoga hasmap ki tarah kyuki isko O(1) complexity maintain rakhna hai
        //tree set me sorted order me value aaenge or complexity log(n) ho jaegi.jaise treemap me thi
        //tree set me bhi key ko null nhi karsakte tree map ki tarah
        LinkedHashSet<Integer> set2=new LinkedHashSet<>();//isme insetion order preserve hota hai.
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);
        System.out.println(set2);//isme null add kar sakte hai o(1);
    }
    
}
