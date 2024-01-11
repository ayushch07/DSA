package Abstraction;
public class Generics_client {
    public static void main(String[] args) {
        Generics_Demo<Integer> gd=new Generics_Demo<>();
        Comparator_Comparable.LinkedList<String> ll=new Comparator_Comparable.LinkedList<>();
        ll.addlast("DSJF");
          ll.addlast("afdka");
          ll.Display();
          //agar hum arraylist me angular bracket na de to vo kisi bhi type ka value lelega
    }
    
}
