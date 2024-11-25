/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Overriding;

/**
 *
 * @author Pinky
 */
public class Retriever extends Dog {
    
    int avgSize = 50;
    
    @Override
    public void bark()
    {
        System.out.println("woof woof!");
    }
    
    public int getAvgsize()
    {
      return avgSize;
    }
}
