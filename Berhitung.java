/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package berhitung;
import java.util.Scanner;
/**
 * Program: operator matematika
 * @author Yane Pradita
 */
public class Berhitung {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // penjumlahan (+)
        // pengurangan (-)
        // perkalian   (*)
        // pembagian   (/)
        // sisa hasil bagi (%)
        String operator;
      Scanner input = new Scanner(System.in);
      System.out.print(" masukkan variabel beserta operator: ");
      int var1 = input.nextInt();
      operator= input.next();
      int var2 = input.nextInt();
      int hasil;
      
      switch(operator){
          case "+":
               hasil= var1+var2;
               System.out.println(hasil);
               break;
          case "-":
               hasil= var1-var2;
               System.out.println(hasil); 
                break;
          case "*":
               hasil= var1*var2;
               System.out.println(hasil);
                break;
          case "/":
               hasil= var1/var2;
               System.out.println(hasil);
                break;
          case "%":
               hasil= var1%var2;
               System.out.println(hasil);
                break;
          default:
              System.out.println("operator"+operator+"tidak ditemukan");
          
      }
          
          
      }
        
      
}
