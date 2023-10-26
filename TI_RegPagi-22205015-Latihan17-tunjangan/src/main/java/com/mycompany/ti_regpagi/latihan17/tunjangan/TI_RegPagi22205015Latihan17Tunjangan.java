/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ti_regpagi.latihan17.tunjangan;

import java.util.Scanner;

/**
 * Nama          : Ahmad Nurfaqih
 * Nim          : 22205015
 * prodi        :Teknik Informatia
 * Deskripsi    : Program ini berisi tentang tunjangan
 *
 * @author 62895
 */
public class TI_RegPagi22205015Latihan17Tunjangan {

    public static void main(String[] args) {
        System.out.println("=====PROGRAM TUNJANGAN======");
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("berapa gaji pokok anda perbulan?: Rp.");
        double gaji = scanner.nextDouble();
        
        System.out.print("Status Anda? (menikah/belum) : ");
        String status = scanner.next();
        System.out.println("");
        
        System.out.println("===HASIL PERHITUNGAN GAJI ANDA===");
        
//        perhitungan tunjangan
        double tunjangan = 0;
        if (status.equalsIgnoreCase("menikah")) {
            tunjangan = gaji * 0.35;   
        } else if(status.equalsIgnoreCase("belum")) {
            System.out.println("anda tidak mendapatkan tunjangan"); 
        }

        double totalgaji = gaji + tunjangan;
        
        System.out.println("Gaji pokok      :"+gaji);
        System.out.println("Tunjangan :" + tunjangan);
        System.out.println("Total gaji: " + totalgaji);
        
    }
    
}
