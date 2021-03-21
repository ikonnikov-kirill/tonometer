/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tonometr;

import java.nio.file.FileSystem;
import java.util.Scanner;

/**
 *
 * @author workway
 */
public class Battery {
    
    private int batteryLife;
    private String replace;
    Scanner scanner = new Scanner(System.in);
            
    public Battery () {
        batteryLife=1000;
        System.out.println("Battery created");
    }
    
    public void useBattery () {
        if (batteryLife==0){
            System.out.println("do you want to replace battery? yes or no");
            replace = scanner.next();
            if (replace=="yes"){
            batteryLife=1000;
                System.out.println("new battery inserted, new battery life "+batteryLife);
        }
            if (replace=="no"){
                System.out.println("current battery expired, device not working");
            }
            return;
        }
        batteryLife=batteryLife-1;
        System.out.println("Battery - 1 used, "+batteryLife+" remained");
    }
    
}
