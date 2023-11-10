import java.util.Arrays;
import java.util.Scanner;

public class p93 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();

        int[] nilaiMahasiswa = new int[jumlahMahasiswa];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMahasiswa[i] = input.nextInt();
        }

        Arrays.sort(nilaiMahasiswa);

        System.out.println("\n=== Nilai Mahasiswa ===");
        for (int i = jumlahMahasiswa - 1; i >= 0; i--) {
            System.out.println(nilaiMahasiswa[i]);
        }

    }
}