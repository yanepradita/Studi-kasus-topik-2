/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bignumber;
import java.util.Scanner;
import java.math.*;
/**
 * Program : menjumlahkan dan mengalikan bilangan besar
 * @author Yane Pradita
 */
public class BigNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BigInteger a = input.nextBigInteger();
        BigInteger b = input.nextBigInteger();
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
    
}
