/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tonometr;

import jdk.internal.org.objectweb.asm.tree.MethodInsnNode;

/**
 *
 * @author workway
 */
public class Tonometr {

    private Wrap blankWrap;
    private Pump blankPump;
    private Battery oneBattery;
    private Display oneDisplay;
    private Controller oneController;
     private int hiBloodPressure=0;
    private int lowBloodPressure=0;
    private int pulse=0;

    public Tonometr() {
        oneBattery = new Battery();
        oneController = new Controller();
        oneDisplay = new Display();
        blankPump = new Pump(blankWrap);
        System.out.println("Tonometr created");
//        controllerConnect(oneController);
        oneController.connectBatteryPumpDisplay(oneBattery, blankPump, oneDisplay);

    }

//    public void controllerConnect(Controller controller) {
//        this.oneController = controller;
//    }

    public void connectWrap(Wrap wrap) {
        blankWrap = wrap;
        
    }

    public void dataTwotransfer (int pressure2) {
        oneController.dataTwoTransfer(pressure2);
    }
    
    public void start(Wrap wrap) {
        connectWrap(wrap);
        blankPump.coonectWrap(wrap);
        System.out.println("Start button pressed");
        oneController.signalTransfer();
        
    }

    public int getValvePressure() {
        return this.blankPump.getPumpPressure();
    }

    public Valve getValve() {
        return blankWrap.getValve();
    }
    
    public void dataWrapTonometrController (int hiBloodPressure1, int lowBloodPressure1, int pulse1) {
        hiBloodPressure=hiBloodPressure1;
        lowBloodPressure=lowBloodPressure1;
        pulse=pulse1;  
        oneController.getDataController(hiBloodPressure, lowBloodPressure, pulse);
    }

}
