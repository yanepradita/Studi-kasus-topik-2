/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package strings;
import java.util.Scanner;
/**
 *
 * @author Yane Pradita
 */
public class Strings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
       Scanner input = new Scanner(System.in);
       String kataA = input.nextLine();
       String kataB = input.nextLine();
       
       String kata1 = kataA.substring(0,1).toUpperCase()+kataA.substring(1);
       String kata2   = kataB.substring(0,1).toUpperCase()+kataB.substring(1);
       
       int pjgA = kataA.length();
       int pjgB = kataB.length();
       int jumlah = pjgA + pjgB;
       System.out.println(jumlah);
       
       if(kataA.compareToIgnoreCase(kataB)>=0){
            System.out.println("Yes");
       }
       else{
            System.out.println("No");
       }
               
       System.out.println(kata1 + " " + kata2);
        
    }
    
}