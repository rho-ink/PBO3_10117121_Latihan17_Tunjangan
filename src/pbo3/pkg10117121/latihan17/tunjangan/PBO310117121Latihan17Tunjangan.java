/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117121.latihan17.tunjangan;

import java.util.Scanner;

/**
 *
 * @author CHEEKIBREEKIIVDAMKE
 */
public class PBO310117121Latihan17Tunjangan {

    /**
     * @param args the command line arguments
     *NAMA                 : M Rifqi S M
     *KELAS                : PBO-3 
     *NIM                  : 10117121
     *Program Deskripsi    : Program menghitung totalgaji
     */
    public static void main(String[] args) {
         String status;
         double tunjangan;
         double gaji;
         double totalGaji;
         Scanner scanner = new Scanner(System.in);
         
        System.out.println("Program Tunjangan");
        System.out.print("Berapa gaji pokok Anda perbulan ? : Rp.");
        gaji = scanner.nextDouble();
        System.out.print("Status Anda? (menikah/belum) :");
        System.out.print("Status Anda? (Menikah/Belum) :");
        status = scanner.next();
        
        if (status.equals("menikah") || status.equals("Menikah"))
             tunjangan=0.35*gaji;
        else tunjangan=0;
        
        totalGaji = gaji+tunjangan;
        
        System.out.println("");
        System.out.println("Hasil Perhitungan");
        System.out.println("Gaji Pokok\t : Rp "+gaji);
        System.out.println("Tunjangan\t : Rp "+tunjangan);
        System.out.println("Total gaji\t : Rp "+totalGaji);
        
    }
    
}
