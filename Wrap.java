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
public class Wrap {
   
    private Tonometr blankTonometr;
    private Valve blankValve;
    private int pressure;
    private Detector oneDetector;
    private Arm oneArm=null;
    private int hiBloodPressure=0;
    private int lowBloodPressure=0;
    private int pulse=0;
        
    public Wrap (Tonometr tonometr) {
        oneDetector = new Detector();
        oneDetector.connectDetector(this);
        Valve oneValve = new Valve();
        blankValve=oneValve;
        blankValve.connectWrap(this);
        blankTonometr=tonometr;
        blankTonometr.connectWrap(this);
        System.out.println("Wrap created");
    
      
    }
    
    public int connectPump () {
    return blankTonometr.getValvePressure();
    }
    
    public void valvePressureTransfer () {
      blankValve.pressureTransfer(connectPump());
    }
    
    public Valve getValve () {
        return this.blankValve;
    }
    
    public void setWrapPressure (int pressure1) {
        pressure=pressure1;
        System.out.println("Wrap air pressure = "+pressure+"");
        oneDetector.startDetector(pressure);
    }
    
    public void armIn (Arm arm) {
        oneArm=arm;
        System.out.println("Arm inserted");
    }
    
    public void armOut () {
        oneArm=null;
        System.out.println("Arm taken out");
    }
    
    public Arm getArm () {
        return this.oneArm;
    }
    
    public void getDataWrap (int hiBloodPressure1, int lowBloodPressure1, int pulse1) {
        hiBloodPressure=hiBloodPressure1;
        lowBloodPressure=lowBloodPressure1;
        pulse=pulse1;
        System.out.println("Wrap hi pressure "+hiBloodPressure+" , low pressure "+lowBloodPressure+" , pulse "+pulse);
        blankValve.getDataValve(hiBloodPressure1, lowBloodPressure1, pulse1);
    }
    
    public void dataTwoTransfer (int pressure2) {
        blankTonometr.dataTwotransfer(pressure2);
    }
    
    
    public void dataValveWrapController (int hiBloodPressure1, int lowBloodPressure1, int pulse1) {
        hiBloodPressure=hiBloodPressure1;
        lowBloodPressure=lowBloodPressure1;
        pulse=pulse1;
        blankTonometr.dataWrapTonometrController(hiBloodPressure, lowBloodPressure, pulse);
    }
    
    
}
