import java.util.Scanner;

public class p52 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nMasukkan Data Yang Dibutuhkan!!!\n");

        System.out.print("Nama              : ");
        String nama = scanner.nextLine();

        System.out.println("\nPilih Departemen :\n1. Produksi\n2. Marketing\n3. Inventory");
        System.out.print("Departemen        : ");
        String departemen = scanner.nextLine();

        double gaji = 0.0;

        if (departemen.equalsIgnoreCase("Produksi")) {

            System.out.println("\nPengalaman kerja : ");
            System.out.println("Ketik 1 jika kurang dari 1 tahun\nKetik 2 jika 1-2 tahun\nKetik 3 jika lebih dari 2 tahun");
            System.out.print("Masukan pilihan : ");
            int pengalaman = scanner.nextInt();

            if (pengalaman == 1) {
            gaji = 3000000.0;
            } else if (pengalaman == 2) {
            gaji = 4000000.0;
            } else if (pengalaman == 3) {
            gaji = 5000000.0;
            } else {
            System.out.println("\nSALAH MEMASUKAN PILIHAN PENGALAMAN!!!\n");
            System.exit(0);
            }
        }
        else if (departemen.equalsIgnoreCase("Marketing")) {

            System.out.println("\nPengalaman kerja : ");
            System.out.println("Ketik 1 jika kurang dari 1 tahun\nKetik 2 jika 1-2 tahun\nKetik 3 jika lebih dari 2 tahun");
            System.out.print("Masukan pilihan : ");
            int pengalaman = scanner.nextInt();

            if (pengalaman == 1) {
            gaji = 3000000.0;
            } else if (pengalaman == 2) {
            gaji = 4000000.0;
            } else if (pengalaman == 3) {
            gaji = 5000000.0;
            } else {
            System.out.println("\nSALAH MEMASUKAN PILIHAN PENGALAMAN!!!\n");
            System.exit(0);
            }
        }
        else if (departemen.equalsIgnoreCase("Inventory")) {

            System.out.println("\nPengalaman kerja : ");
            System.out.println("Ketik 1 jika kurang dari 1 tahun\nKetik 2 jika 1-2 tahun\nKetik 3 jika lebih dari 2 tahun");
            System.out.print("Masukan pilihan : ");
            int pengalaman = scanner.nextInt();

            if (pengalaman == 1) {
            gaji = 3000000.0;
            } else if (pengalaman == 2) {
            gaji = 4000000.0;
            } else if (pengalaman == 3) {
            gaji = 5000000.0;
            } else {
            System.out.println("\nSALAH MEMASUKAN PILIHAN PENGALAMAN!!!\n");
            System.exit(0);
            }
        } else {
            System.out.println("\nSALAH MEMASUKAN DEPARTEMEN!!!");
        }

        System.out.println("\n==============================\n");
        System.out.println("Hasil dari data yang anda masukan :\n");
        System.out.println("Nama        : " + nama);
        System.out.println("Departemen  : " + departemen);
        System.out.println("Gaji        : Rp " + gaji);
        System.out.println("\n");

        scanner.close();
    }
}
