package Comparator_Comparable;

public class cars_Client {
    public static void main(String args[]){
        cars[] ar=new cars[5];
        ar[0]=new cars(200,10,"Yellow");
        ar[1]=new cars(250,8,"Black");
        ar[2]=new cars(500,9,"Blue");
        ar[3]=new cars(100,12,"Gray");
        ar[4]=new cars(50,15,"White");
        display(ar); //agar object ka tostring method nhi hai to by defaul object apna toString method chala deta hai or address print ho jaate hai diplay run karne se
        //ab hum apna tostring method banaenge cars me to ab vo chalega.
        //har class ka parent class object class hota hai to islie toString ke uper @override lagaenge
        System.out.println("***********");
        sort(ar);
        display(ar);
    }
    public static void display(cars[] arr)
    {
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
            
        }
    }
        public static <T extends Comparable<T>> void sort(T[] arr) {//bubble sort ki jagah seedhe arrays.sort() se bhi kaam ho jaega.
               for(int turn=1;turn<arr.length;turn++)
             {
               for(int i=0;i<arr.length-turn;i++)
                {
                    if(arr[i].compareTo(arr[i+1])>0)//normal arr[i]>arr[i+1] nhi kar sakte kyuki arr[i] or arr[i+1] me address hai or address ko compare > is symbol se nhi kar sakte.
                    //ab compareTO se karenge to arr[i] ka address this me gya hai
                    //compareTo non-static method hai islie .marke use kar rhe hai
                    //T vahi aaega jiske paas comparable function ka logic ho jo comparable interface ko apne andar implement karke betha hoga
                    {
                        T temp=arr[i];
                        arr[i]=arr[i+1];
                        arr[i+1]=temp;
                    }
                }
            }    
            
        }
        //normal Arrays.sort(ar,new Comparator<cars>(){
        //       @Override
        //       public int compare(cars o1,cars o2){
        //         return o2.price-o1.price;
        //       }
        // });
     
    
}
