/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kalkulatorbmii;

import java.util.Scanner;

/**
 *
 * @author Pongo
 */
public class KalkulatorBMII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
         // Menampilkan sambutan
        System.out.println("=================================");
        System.out.println("Selamat datang di Kalkulator BB Ideal!");
        System.out.println("=================================");
      
        // Input nama
        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();
        
        // Input berat badan
        System.out.print("Masukkan berat (kg): ");
        double berat = input.nextDouble();
        
        // Input tinggi badan
        System.out.print("Masukkan tinggi (cm): ");
        double tinggi = input.nextDouble();
        
        // Konversi tinggi ke meter
        tinggi = tinggi / 100;
        
        // Hitung BMI
        double bmi = berat / (tinggi * tinggi);
        
        // Tentukan kategori
        String kategori;
        if (bmi < 18.5) {
            kategori = "Kurus Banget Makan Sehari Sekali ya?";
        } else if (bmi < 25) {
            kategori = "Normal";
        } else if (bmi < 30) {
            kategori = "Gemuk";
        } else {
            kategori = "Sering-sering Olahraga Lah";
        }
        
        // Tampilkan hasil
        System.out.println("\n=================================");
        System.out.println("\nHASIL PERHITUNGAN");
        System.out.println("=================================");
        System.out.println("Nama: " + nama);
        System.out.printf("BMI: %.1f\n", bmi);
        System.out.println("Kategori: " + kategori);
        
        input.close();
    }
      
}
