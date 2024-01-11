package Comparator_Comparable;
public class cars implements Comparable<cars> {
    int price ;
    int speed;
    String color;
    public cars(){

    }
  

    public cars (int price, int speed,String color){
         this.price = price;
         this.speed = speed;
         this.color = color;
    }
    
    public String toString(){
        return "P : " + this.price +" S: "+ this.speed + " C: " + this.color;
    }


    @Override
    public int compareTo(cars o) {
        // TODO Auto-generated method stub
       // throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
        // return this.speed-o.speed;
        //Now sorting on the basis of price
        //return o.price-this.price;
        //On the color basis
        return this.color.compareTo(o.color);
    }
}