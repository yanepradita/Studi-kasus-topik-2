/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal5;
import java.util.Scanner;
/**
 * Program : menentukan mobil untuk jalan atau berhenti
 * @author Yane Pradita
 */
public class Soal5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        int PlatMobil1= input.nextInt();
        int PlatMobil2= input.nextInt();
        int PlatMobil3= input.nextInt();
        int PlatMobil4= input.nextInt();
        
        String angka1 = String.valueOf(PlatMobil1);
        String angka2 = String.valueOf(PlatMobil2);
        String angka3 = String.valueOf(PlatMobil3);
        String angka4 = String.valueOf(PlatMobil4);
        
        String total = angka1 + angka2 + angka3 +angka4;
        String jumlah = total;
        
        Long nomor = Long.valueOf(jumlah);
        Long hasil = (nomor-999999)%5;
        
        if (hasil==0){
            System.out.println("jalan");
        }else{
            System.out.println("berhenti");
        }
        
        
        
        
        
        
    }
    
}
