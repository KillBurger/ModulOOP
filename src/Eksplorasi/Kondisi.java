/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eksplorasi;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10
 */
public class Kondisi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        int nilai;
        System.out.println("Masukkan nilai ahir PBO: ");
        nilai = masukan.nextInt();
        if (nilai < 70) {
            System.out.println("Siswa tidak lulus");
        }
        if (nilai > 70) {
            System.out.println("Siswa LULLUS");
        }
    }

}
