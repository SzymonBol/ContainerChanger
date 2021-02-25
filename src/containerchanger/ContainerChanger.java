/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containerchanger;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author REDBUL
 */
public class ContainerChanger {


    public static void main(String[] args) {
        int los;
        int iter;
        Scanner input=new Scanner(System.in);
        Random rand = new Random();
        Random rand2 = new Random();
        Random rand3 = new Random();
        double change=0;
        double wochange=0;
        System.out.print("Podaj liczbe generowań: ");
        iter=input.nextInt();
        for(int x=0;x<iter;x++){
            los=rand.nextInt(3);
             //przypadek ze zmianą
            int number=rand2.nextInt(3);
            int change_number=rand.nextInt(3);
            while(number==change_number)
                change_number=rand.nextInt(3);
            if(los==change_number)
                change++;
            //przypadek bez zamiany
            number=rand3.nextInt(3);
            if(los==number)
                wochange++;
        }
        java.text.DecimalFormat df=new java.text.DecimalFormat();
        df.setMaximumFractionDigits(2);
        df.setMinimumFractionDigits(2);
        System.out.println("% wygranych ze zmianą: " + df.format(change*100/iter));
        System.out.println("% wygranych bez zmiany: " + df.format(wochange*100/iter));
    }
    
}
