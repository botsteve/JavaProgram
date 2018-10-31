package com.company;

public class Main {
    public static void swap(Integer x, Integer y){
        Integer temp = new Integer(x);
        x = y;
        y = temp;
    }

    public static void main(String[] args) {
	    Integer x = new Integer(10);
	    Integer y = new Integer(20);

	    swap(x,y);

	    System.out.println("x= "+ x+ " y= "+ y);
    }
}
