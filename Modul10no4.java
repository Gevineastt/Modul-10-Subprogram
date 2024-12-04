package modul7;

import java.util.Scanner;

public class Modul10no4 {

    // fungsi untuk menghitung niolai f(z) dari distribusi normal
    static double f(double z) {
        return (1 / Math.sqrt(2 * Math.PI)) * Math.exp(-0.5 * z * z);
    }

    // metode untuk menghitung nilai normal
    static int normal (int n, double z) {
        double fValue = f(z);
        return (int) Math.round(fValue * n);
    }
    
    // metode untuk mencetak bintng sebanyak m buah 
    static void bintang (int m) {
        for (int i = 0; i < m; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // membaca nilai n dari yang dimasukan user
        System.out.print("Masukkan nilai n: (dari 30-60): ");
        int n = input.nextInt();

        // validasi input n 
        while (n < 30 || n > 60) {
            System.out.print("Nilai n tidak valid. Masukan nilai n (antara 30-60): ");
            n = input.nextInt();
        }

        // menghitung dan mencetak bintang untuk z dari -4 sampai ke 4 dengan menggnakan increment 0.1
        for (double z = -4; z <= 4; z += 0.1){
            int nilaiNormal = normal(n, z);
            bintang(nilaiNormal);
        }

        input.close();
    }
}