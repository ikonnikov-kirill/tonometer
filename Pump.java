/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tonometr;

import java.util.Scanner;

/**
 *
 * @author workway
 */
public class Pump {
//    private Tonometr blankTonometr;
    private Wrap blankWrap;
    private int pressure;
   // private Valve blankValve;
    Scanner scanner = new Scanner(System.in);
    
    public Pump (Wrap wrap) {
   // blankTonometr = tonometr;
   blankWrap=wrap;
    System.out.println("Pump created");
    }
    
    public void connectValve (int pressure) {
        System.out.println("Air pressure "+pressure+" is pumping");
   blankWrap.setWrapPressure(pressure);
// blankTonometr.getValve().pressureTransfer(pressure);
    
    }
    
    public void coonectWrap (Wrap wrap) {
        blankWrap=wrap;
    }
    
    public void startPump () {
       // blankValve=blankTonometr.getValve();
         System.out.println("enter air pressure");
         pressure = scanner.nextInt();
        connectValve(pressure);
        
    }

    public int getPumpPressure () {
        return this.pressure;
    }
    

}
