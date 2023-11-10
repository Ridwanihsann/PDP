package Pertemuan10;
import java.util.Scanner;

public class p10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n===== PENJUMLAHAN MATRIK =====\n");

        // Input ukuran matrik
        System.out.print("Masukkan jumlah baris matrik: ");
        int baris = scanner.nextInt();
        System.out.print("Masukkan jumlah kolom matrik: ");
        int kolom = scanner.nextInt();

        // Input elemen-elemen matrik pertama
        System.out.println("\nMasukkan matrik ke-1:");
        int[][] matrik1 = bacaMatrik(scanner, baris, kolom);

        // Input elemen-elemen matrik kedua
        System.out.println("\nMasukkan matrik ke-2:");
        int[][] matriks2 = bacaMatrik(scanner, baris, kolom);

        // Menjumlahkan dua matrik
        int[][] hasil = tambahMatrik(matrik1, matriks2, baris, kolom);

        // Menampilkan hasil penjumlahan matrik
        System.out.println("\nHasil penjumlahan matrik 1 dan matrik 2:");
        tampilMatriks(hasil);
    }

    // Fungsi untuk membaca matrik dari input pengguna
    public static int[][] bacaMatrik(Scanner scanner, int baris, int kolom) {
        int[][] matrik = new int[baris][kolom];
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("Masukkan matrik[" + i + "][" + j + "]: ");
                matrik[i][j] = scanner.nextInt();
            }
        }
        return matrik;
    }

    // Fungsi untuk menambahkan dua matrik
    public static int[][] tambahMatrik(int[][] matrik1, int[][] matriks2, int baris, int kolom) {
        int[][] hasil = new int[baris][kolom];
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                hasil[i][j] = matrik1[i][j] + matriks2[i][j];
            }
        }
        return hasil;
    }

    // Fungsi untuk menampilkan matrik
    public static void tampilMatriks(int[][] matrik) {
        for (int i = 0; i < matrik.length; i++) {
            for (int j = 0; j < matrik[0].length; j++) {
                System.out.print(matrik[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(" ");
    }
}
