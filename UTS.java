/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts;

/**
 *
 * @author argal
 */


    import java.util.Scanner;

class MataKuliah {

    String nama;
    int sks;
    String nilai;
    double bobot;

    double konversiNilai(String nilaiHuruf){

        switch(nilaiHuruf){
            case "A":
                return 4.0;
            case "A-":
                return 3.7;
            case "B+":
                return 3.3;
            case "B":
                return 3.0;
            case "B-":
                return 2.7;
            case "C+":
                return 2.3;
            case "C":
                return 2.0;
            case "D":
                return 1.0;
            default:
                return 0.0;
        }

    }

}

public class UTS {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlah = input.nextInt();

        MataKuliah mk = new MataKuliah();

        double totalMutu = 0;
        int totalSKS = 0;

        for(int i = 1; i <= jumlah; i++){

            System.out.println("\nMata Kuliah ke-" + i);

            System.out.print("Nama Mata Kuliah: ");
            input.nextLine();
            mk.nama = input.nextLine();

            System.out.print("Jumlah SKS: ");
            mk.sks = input.nextInt();

            System.out.print("Nilai Huruf: ");
            mk.nilai = input.next();

            mk.bobot = mk.konversiNilai(mk.nilai);

            double mutu = mk.bobot * mk.sks;

            totalMutu = totalMutu + mutu;
            totalSKS = totalSKS + mk.sks;
        }

        double IPS = totalMutu / totalSKS;

        System.out.println("\n===== HASIL =====");
        System.out.println("IPS Semester = " + IPS);

    }
}

