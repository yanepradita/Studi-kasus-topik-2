/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gajiagent;
import java.util.Scanner;
/**
 * Program :
 * @author Yane Pradita
 */
public class GajiAgent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner inputScanner = new Scanner(System.in); 
       int item = inputScanner.nextInt();
       int gajiPokok = 500000;
       int bonus1= (gajiPokok*25)/100;
       int bonus2= (gajiPokok*35)/100;
       int gaji;
       int denda;
       int potongan= (15-item)*50000;
       int bonusPerItem = ((item*50000)*10)/100;
       
       if(item>=40 && item<=80){
           gaji= gajiPokok + bonus1;
           System.out.println(gaji);
       }
       else if(item>80){
           gaji= gajiPokok + bonus2;
           System.out.println(gaji);
       }
       else if(item<15){
           denda = (potongan*15)/100;
           gaji=gajiPokok-denda;
           System.out.println(gaji);
       }
       else {
           gaji=bonusPerItem + gajiPokok;
           System.out.println(gaji);
       }
       
    }
    
}
