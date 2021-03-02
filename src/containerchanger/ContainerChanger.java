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
        int number;
        int tmp;
        Scanner input=new Scanner(System.in);
        Random rand = new Random();
        int empty;
        double change=0;
        double wochange=0;
        System.out.print("Podaj liczbe generowań: ");
        iter=input.nextInt();
        for(int x=0;x<iter;x++){
            //nagroda
            los=rand.nextInt(3);
            //liczba gracza
            number=rand.nextInt(3);
            //przypadek bez zmiany
            if(los==number){
                wochange++;
                continue;
            }
            //przypadek ze zmianą
            do{
                empty=rand.nextInt(3);
            }while(empty==los || empty==number);
            tmp=number;
            number=0;
            while(true){
                if(number!=tmp && number!=empty)
                    break;
                number++;
            }
            if(number==los) change++;            
        }
        java.text.DecimalFormat df=new java.text.DecimalFormat();
        df.setMaximumFractionDigits(2);
        df.setMinimumFractionDigits(2);
        System.out.println("% wygranych ze zmianą: " + df.format(change*100/iter));
        System.out.println("% wygranych bez zmiany: " + df.format(wochange*100/iter));
    }
    
}
