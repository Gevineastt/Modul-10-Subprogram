package modul7;

import java.util.Scanner;

public class Modul10no2 {
    // Metode untuk menghitung C(n, r)
    public static int kombinasi(int n, int r) {
        if (r > n) {
            return 0;
        }
        if (r == 0 || r == n) {
            return 1;
        }
        return kombinasi(n - 1, r - 1) + kombinasi(n - 1, r);
    }

    // Metode untuk mencetak Segitiga Pascal
    public static void cetakSegitigaPascal(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(kombinasi(i, j) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris Segitiga Pascal yang ingin dicetak: ");
        int n = input.nextInt();
        cetakSegitigaPascal(n);
        input.close();
    }
}


