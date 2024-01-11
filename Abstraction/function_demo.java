package Abstraction;
//dono ke lie function chalega display, this is called generics
public class function_demo {
    public static void main(String[] args) {
        Integer arr[]={1,2,3,45};
        display(arr);
        String a[]={"a","b","c","c"};
        display(a);
    }

    private static<T> void display(T[] arr) {
        for(int i=0;i<arr.length;i++)
        System.out.println(arr[i]);
    }
    
}
