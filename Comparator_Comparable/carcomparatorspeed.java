package Comparator_Comparable;
import java.util.Comparator;
public class carcomparatorspeed implements Comparator<cars>{

    @Override
    public int compare(cars o1, cars o2) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'compare'");
        return o1.speed-o2.speed;
        //jiske hisab se sort karna hai use yaha se bhejte rho.
        //jo code cars me likha hai toString sorting ke lie use comment karke cars_client me Comparator<T> cmp likdo T[] arr ke baad or extends hata do poora or cmp.compare(arr[i],arr[i+1]>0) likhdo or sort function jaha call kia hai use new carcomparatorspeed() likhdo ho gya sort or agar koi or cheez ke hisab se sort karna hai to uski class banao or sort me call kardos.
        
    }
    
}