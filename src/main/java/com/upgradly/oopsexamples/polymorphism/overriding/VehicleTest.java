/*
 * Upgradly - A Learnig and Earning Plateform.
 */
package com.upgradly.oopsexamples.polymorphism.overriding;

/**
 *
 * @author Upgradly <Mridula Tiwari at https://www.upgradly.com>
 */
public class VehicleTest {

    public static void main(String[] args) {
        Vehicle vh = new MotorBike();
        vh.move(); // prints MotorBike can move and accelerate too!!
        vh = new Vehicle();
        vh.move(); // prints Vehicles can move!!
    }
}
