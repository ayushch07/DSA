package Abstraction;

public interface stack1 extends DSAI,DSA_Client{
    public void push();
    public int pop();
    public int size();
    int f=9;//ye by-default public static and final hai.
    //static matlab ye variable dusre interface me use kia ja sakta hai, final means constant no changes to be done.
   //java 8 ke baad hum public static ko body de sakte hai
    
}
