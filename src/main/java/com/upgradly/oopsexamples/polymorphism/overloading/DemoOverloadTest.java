/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upgradly.oopsexamples.polymorphism.overloading;

/**
 *
 * @author Upgradly <Mridula Tiwari at https://www.upgradly.com>
 */
public class DemoOverloadTest {

    public static void main(String[] args) {

        DemoOverload demo = new DemoOverload();

        System.out.println(demo.add(2, 3)); //method 1 called

        System.out.println(demo.add(2, 3, 4)); //method 2 called

        System.out.println(demo.add(2, 3.4)); //method 4 called

        System.out.println(demo.add(2.5, 3)); //method 3 called

    }

}
