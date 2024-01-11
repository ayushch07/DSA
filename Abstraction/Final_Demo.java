package Abstraction;

public class Final_Demo {
    final int val=89;
    public void fun(){
        // val+=7;//update nhi kar sakte final datatype ko
        //kisi function ke samne final laga denge to us function ko override nhi karenge. or kisi class ke saath lag gya to class ko inherit nhi kar sakte
        System.out.println(val);
    }
}
