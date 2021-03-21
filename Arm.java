/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tonometr;

import java.util.Random;

/**
 *
 * @author workway
 */
public class Arm {
    private int armDiameter;
    Random size = new Random();
    
    public Arm () {
    armDiameter=size.nextInt(20-10)+10;
    System.out.println("Arm size "+armDiameter+" created");
    }
    
    
}
