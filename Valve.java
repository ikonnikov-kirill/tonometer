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
public class Valve {
private int pressure;
private Wrap blankWrap;
private int hiBloodPressure=0;
private int lowBloodPressure=0;
private int pulse=0;

    public Valve () {
    System.out.println("Valve created");  
   
    }
    
    public void pressureTransfer (int pressure1) {
   this.pressure=pressure1;
        
        System.out.println("Valve transferring air pressure "+pressure+" to wrap");
        blankWrap.setWrapPressure(pressure);
    }
    
    public void connectWrap (Wrap wrap) {
        blankWrap =wrap;
    }
      
        public void getDataValve (int hiBloodPressure1, int lowBloodPressure1, int pulse1) {
        hiBloodPressure=hiBloodPressure1;
        lowBloodPressure=lowBloodPressure1;
        pulse=pulse1;
        System.out.println("Valve hi pressure "+hiBloodPressure+" , low pressure "+lowBloodPressure+" , pulse "+pulse);
        blankWrap.dataValveWrapController(hiBloodPressure, lowBloodPressure, pulse);
    }
    
}
