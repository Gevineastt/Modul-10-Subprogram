package modul7;

import java.util.Scanner;

public class Modul10no3 {
     double x1, y1, x2, y2, x3, y3;

    // metode untuk membaca koordinat titik 
    public void bacaTitik() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan koordinat titik A (x1 y1): ");
        x1 = input.nextDouble();
        y1 = input.nextDouble();
        System.out.print("Masukkan koordinat titik B (x2 y2): ");
        x2 = input.nextDouble();
        y2 = input.nextDouble();
        System.out.print("Masukkan koordinat titik C (x3 y3): ");
        x3 = input.nextDouble();
        y3 = input.nextDouble();

        input.close();
    }

    // metode unntuk menghitung jarak antar titik
    static double hitungJarak(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // metode untuk menghitung keliling segitiga
    static double hitungKeliling(double sisiA, double sisiB, double sisiC) {
        return sisiA + sisiB + sisiC;
    }

    // Metode untuk menampilkan segitiga
    public void hitungLuas() {
        double sisiA = hitungJarak((int)x1, (int)y1, (int)x2, (int)y2);
        double sisiB = hitungJarak((int)x2, (int)y2, (int)x3, (int)y3);
        double sisiC = hitungJarak((int)x3, (int)y3, (int)x1, (int)y1);
        
        double keliling = hitungKeliling(sisiA, sisiB, sisiC);
        double s = keliling / 2; 
        double luas = Math.sqrt(s * (s - sisiA) * (s - sisiB) * (s - sisiC));

        System.out.printf("Luas segitiga: %.2f", luas);
    }


    public static void main(String[] args) {
        Modul10no3 hitung = new Modul10no3();
        hitung.bacaTitik();
        hitung.hitungLuas();

        
    }
}

