/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tonometr;

/**
 *
 * @author workway
 */
public class Main {
    public static void main(String[] args) {
        
        Tonometr firstTonometr = new Tonometr();
        Arm firstArm = new Arm();
        Wrap firstWrap = new Wrap(firstTonometr);
        firstWrap.armIn(firstArm);
        firstTonometr.start(firstWrap);
        //firstWrap.armOut();
    }
}
