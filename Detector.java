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
public class Detector {
    private int pressure;
    private Wrap oneWrap;
    private int hiBloodPressure=0;
    private int lowBloodPressure=0;
    private int pulse=0;
    Random random = new Random();
            
    public Detector () {
    System.out.println("Detector created");
    }
    
    public void connectDetector (Wrap wrap) {
        oneWrap=wrap;
    }
    
    public void startDetector (int pressure1) {
        pressure=pressure1;
        if (pressure<=0){
          //  System.out.println("no air pressure or arm not inside wrap");
            oneWrap.dataTwoTransfer(pressure);
            return;
        }
        
        if (pressure>=1 && oneWrap.getArm()==null){
            //System.out.println("airpressure "+pressure+" but arm not inserted");
            pressure=-1;
            oneWrap.dataTwoTransfer(pressure);
            return;
        }
        
        if (pressure>=1 && oneWrap.getArm()!=null){
            System.out.println("start taking blood pressure");
            
            for (int i =0; i<5; i++) {
              int temp =random.nextInt(270-120)+120;
              hiBloodPressure=(hiBloodPressure+temp)/2;
            }
            
            for (int j =0; j<5; j++) {
            int temp =random.nextInt(100-50)+50;
            lowBloodPressure=(lowBloodPressure+temp)/2;    
            }
            
            for (int h =0; h<5; h++) {
            int temp =random.nextInt(135-65)+65;
            pulse=(pulse+temp)/2;    
            }
            
            System.out.println(" Detector hi pressure "+hiBloodPressure+" , low pressure "+lowBloodPressure+" , pulse "+pulse);
            oneWrap.getDataWrap(hiBloodPressure, lowBloodPressure, pulse);
            
            }
        }
    }
