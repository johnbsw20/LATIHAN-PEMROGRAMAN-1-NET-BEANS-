/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;
//3
import java.util.Scanner;
public class Latihan1 {
    public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    //4
    System.out.print("Kehadiran: ");
    int kehadiran = input.nextInt();
    System.out.print("Total Nilai: ");
    double totalNilai = input.nextDouble(); 
   
    //5
    String grade;
         double n = totalNilai * 75 / 100;

    if (n >= 80) {
            grade = "A";
        } else if (n >= 70) {
            grade = "B";
        } else if (n >= 60) {
            grade = "C";
        } else if (n >= 55) {
            //8
            n = 55; 
            grade = "D";
        } else {
            grade = "E";
        }
    //6
    int validasiKehadiran = 21;
    //7
    if(kehadiran >= validasiKehadiran){
    System.out.println("Nilai Akhir(N):" + n);
    System.out.println("Grade : " + grade);
    }else{
  
        
    }
    input.close();
    }
}
