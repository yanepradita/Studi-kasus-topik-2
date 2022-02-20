/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array;

/**
 * Program : 
 * @author Yane Pradita
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //One Dimensional Arrays
        int[] firstArray = {2, 5, 3};
        int[] secondArray = {9, 5, 3};
        int[] thirdArray = {2, 4, 9};
        int[] fourthArray = {10, 11, 12}; 
        int[] fifthArray = {13, 14, 15}; 
        int[] sixthArray = {16,17, 18}; 
        int[] seventhArray = {19, 20, 21}; 
        int[] eigthArray = {22, 23, 24}; 
        int[] ninthArray = {25, 26, 27}; 
        
        //Two Dimensional Arrays
        int[][] twoDimensionalArray1 = {firstArray, secondArray, thirdArray};
        int[][] twoDimensionalArray2 = {fourthArray, fifthArray, sixthArray};
        int[][] twoDimensionalArray3 = {seventhArray, eigthArray, ninthArray};
        
        //Three Dimensional Array
        int[][][] threeDimensionalArray = {twoDimensionalArray1, twoDimensionalArray2, twoDimensionalArray3};
        
        int x;
        int y;
        int z;
        //menampilkan isi Array
           for(x=0; x<3; x++){
               //menampilkan elemen sejumlah baris
                System.out.print("{");
                 for(y=0; y<3 ; y++){
                     //menampilkan sejumlah kolom
                      System.out.print("{");
                    for(z=0; z<3;z++){
                        //menampilkan isi elemen baris dan kolom
                        System.out.print(threeDimensionalArray[x][y][z] + " ");    
                    }
                    System.out.print("}");
                 }
                  System.out.println("}");
           }
          
        
    }
    
}
    
