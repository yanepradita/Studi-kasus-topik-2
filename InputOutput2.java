/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inputoutput.pkg2;
import java.util.Scanner;

/**
 * Program: Menformat dan mencetak input 
 * @author Yane Pradita
 */
public class InputOutput2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner inputScanner= new Scanner (System.in);
      System.out.println ("==================================");
      String kata1 = inputScanner.next();
      int a=inputScanner.nextInt();
      String kata2 = inputScanner.next();
      int b=inputScanner.nextInt();
      String kata3 = inputScanner.next();
      int c=inputScanner.nextInt();
      System.out.printf("%-15s%03d%n",kata1,a);
      System.out.printf("%-15s%03d%n",kata2,b);
      System.out.printf("%-15s%03d%n",kata3,c);
      System.out.println("==================================");    
          
    }
    
}
