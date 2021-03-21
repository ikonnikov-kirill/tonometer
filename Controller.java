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
public class Controller {
    private Battery blankBattery;
    private Display blankDisplay;
    private Pump blankPump;
    private int hiBloodPressure=0;
    private int lowBloodPressure=0;
    private int pulse=0;
    
    public Controller () {
    System.out.println("Controller created");
    
    }
    
    public void connectBatteryPumpDisplay (Battery battery, Pump pump, Display display) {
        this.blankBattery=battery;
        blankPump=pump;
        blankDisplay=display;
    }
    
    public void signalTransfer () {
     blankBattery.useBattery();
     blankPump.startPump();
    }
    
        public void getDataController (int hiBloodPressure1, int lowBloodPressure1, int pulse1) {
        hiBloodPressure=hiBloodPressure1;
        lowBloodPressure=lowBloodPressure1;
        pulse=pulse1;
        System.out.println("Controller hi pressure "+hiBloodPressure+" , low pressure "+lowBloodPressure+" , pulse "+pulse);
        blankDisplay.getDataDisplay(hiBloodPressure, lowBloodPressure, pulse);
    }
        
        public void dataTwoTransfer (int pressure2) {
            blankDisplay.dataTwoTransfer(pressure2);
        }
        
    
}
