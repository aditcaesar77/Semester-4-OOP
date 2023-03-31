/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas;
import java.util.Scanner;
/**
 *
 * @author PC-A-30
 */
public class Tugas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner rekam = new Scanner(System.in);

        System.out.print("Silakan masukan nilai siswa: ");
        int skor = rekam.nextInt();

        if (skor <= 65) {
            System.out.println("Siswa tidak lulus Seem.");
        } else {
            System.out.println("Siswa lulus.");
        }
    }
}   

