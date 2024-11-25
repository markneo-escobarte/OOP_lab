/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package HierarchicalInheritance;

/**
 *
 * @author Pinky
 */
public class AnimalMain {

    /**
     * @param args  the command line arguments
     */
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.Bark();
        dog.Eating();
        
        Cat kitty = new Cat();
        kitty.Meow();
        kitty.Eating();
    }
    
}
