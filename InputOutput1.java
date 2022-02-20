/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inputoutput1;
import java.util.Scanner;

/**
 * Program : menunjukkan jumlah token dalam string dan memisahkan string 
 * @author Yane Pradita
 */
public class InputOutput1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner inputScanner = new Scanner(System.in);
       System.out.print("Masukkan String: ");
       String kata = inputScanner.nextLine();
       
       String []tokens= (kata.replaceAll("^[\\W+\\s+]", "").split("[\\s!,@?._']+"));
       System.out.println(tokens.length);
       for (String string : tokens){
       System.out.println(string);
        }
       
       
       
       
       
       
    }
    
}
