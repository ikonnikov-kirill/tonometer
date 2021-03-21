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
public class Display {
 private int hiBloodPressure=0;
 private int lowBloodPressure=0;
 private int pulse=0;
    public Display () {
    System.out.println("Display created");
    }
    
        public void getDataDisplay (int hiBloodPressure1, int lowBloodPressure1, int pulse1) {
        hiBloodPressure=hiBloodPressure1;
        lowBloodPressure=lowBloodPressure1;
        pulse=pulse1;
        System.out.println("Display hi pressure "+hiBloodPressure+" , low pressure "+lowBloodPressure+" , pulse "+pulse);
        
    }
        
        public void dataTwoTransfer (int pressure2) {
            if (pressure2 ==0) {
             System.out.println("Display - no air pressure or arm not inside wrap");
            }
            
            if (pressure2 ==-1 ) {
                System.out.println("Display - airpressure present but arm not inserted");   
            }
            
            
        }
}
