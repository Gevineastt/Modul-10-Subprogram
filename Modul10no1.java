package modul7;

import java.util.Scanner;

public class Modul10no1 {
    public static void main(String[] args) {

        int n, r;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        n = input.nextInt();
        System.out.print("Masukkan nilai r: ");
        r = input.nextInt();

        while (r > n) {
            System.out.println("Nilai r harus kurang dari atau sama dengan n");
            System.out.print("Masukkan nilai r: ");
            r = input.nextInt();
        }

        int hasilFaktorial_N;
        hasilFaktorial_N = faktorial(n);
        int hasilFaktorial_R;
        hasilFaktorial_R = faktorial(r);
        int hasilFaktorial_NR;
        hasilFaktorial_NR = faktorial(n - r);

        int hasil_CNR;
        hasil_CNR = hasilFaktorial_N / (hasilFaktorial_R * hasilFaktorial_NR);

        System.out.println("Nilai dari " + n + "! adalah " + hasilFaktorial_N);
        System.out.println("Nilai dari " + r + "! adalah " + hasilFaktorial_R);
        System.out.println("Nilai dari " + (n - r) + "! adalah " + hasilFaktorial_NR);
        System.out.println("Nilai dari C(" + n + "," + r + ") adalah " + hasil_CNR);

        input.close();

        
    }

    static int faktorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * faktorial(n - 1);
        }

    }

}
