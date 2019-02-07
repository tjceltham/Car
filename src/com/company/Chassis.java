package com.company;

/**
 * Created by tjc on 07/02/2019.
 */
public class Chassis {
    private Wheel[] wheels;


    public Chassis(){
        System.out.println("Constructing a Chassis");
        wheels = new Wheel[4];
        for(int x=0; x<4;x++){
            wheels[x] = new Wheel();
        }
    }

    public void move(){
        for(int x=0; x<4;x++){
            wheels[x].turn();
        }
    }

}
