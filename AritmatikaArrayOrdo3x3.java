
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author felix
 */
public class AritmatikaArrayOrdo3x3 {
    public static void main(String[] args) {
        
        Scanner masukan = new Scanner(System.in);
        int matrix1[] [] = new int[3][3];
        int matrix2[] [] = new int[3][3];
        
        System.out.println("=====MATRIX 1=====");
        
            for (int a = 0; a < matrix1.length; a++){
            for (int b = 0; b < matrix1[0].length; b++)
            {
                System.out.println("Masukkan Nilai [" + a +"][" +b +"] : ");
                matrix1[a][b] = masukan.nextInt();
            }
            System.out.println("");
            }
        
            System.out.println("=====MATRIX 2=====");
            for (int a = 0; a < matrix2.length; a++){
            for (int b = 0; b < matrix2[0].length; b++)
            {
                System.out.println("Masukkan Nilai [" + a +"][" +b +"] : ");
                matrix2[a][b] = masukan.nextInt();
            }
            System.out.println("");
        }

        System.out.println("=====MATRIX 1=====");
        
        for (int a = 0; a < matrix1.length; a++){
            for (int b = 0; b < matrix1[0].length; b++)
            {
                System.out.print(matrix1[a][b] + " ");
            }
            System.out.println("");
        }
        System.out.println("=====MATRIX 2=====");
        
        for (int a = 0; a < matrix2.length; a++){
            for (int b = 0; b < matrix2[0].length; b++)
            {
                System.out.print(matrix2[a][b] + " ");
            }
            System.out.println("");
        }
        System.out.println("=====PENGURANGAN=====");
        
        for (int a = 0; a < matrix1.length; a++){
            for (int b = 0; b < matrix1[0].length; b++){
                int hasil = matrix1[a][b] - matrix2[a][b];
                System.out.print(hasil + " ");
            }
            System.out.println("");
        }
    }
}
