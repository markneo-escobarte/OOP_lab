/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Overloading;

/**
 *
 * @author Pinky
 */
public class Calculators {
    private int firstInteger, secondInteger, sumInt;
    private double firstDouble, secondDouble, sumDouble;
    private String firstString, secondString, concatenate;
    
    public void add (int firstInteger, int secondInteger){
        sumInt = firstInteger + secondInteger;
        System.out.println("The sum of two integer is: " + sumInt);
    }
    
    public void add (double firstDouble, double secondDouble){
        sumDouble = firstDouble + secondDouble;
        System.out.println("The sum of two double is: " + sumDouble);
    }
    
    public void add (String firstString, String secondString){
        concatenate = firstString + secondString;
        System.out.println("The concatenate of two string are: " + concatenate);
    }
}


