package com.company;

/**
 * Created by tjc on 07/02/2019.
 */
public class Car {
    private String name;
    private Chassis c;

    public Car(String n){
        System.out.println("Constructing a car");
        name = n;
        c = new Chassis();
    }
	// blah
    public void drive(){
        System.out.println(name + "'s Car is moving");
        c.move();
    }


}
