import java.util.Scanner;

public class p52 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama pegawai: ");
        String nama = input.nextLine();

        System.out.print("Masukkan departemen (Produksi/Marketing/Inventory): ");
        String departemen = input.nextLine();

        System.out.print("Masukkan pengalaman kerja (dalam tahun): ");
        int pengalaman = input.nextInt();

        double gaji = 0.0;

        if (pengalaman < 1) {
            gaji = 3000000.0;
        } else if (pengalaman >= 1 && pengalaman <= 2) {
            gaji = 4000000.0;
        } else if (pengalaman > 2) {
            gaji = 5000000.0;
        } else {
            System.out.println("Pengalaman kerja tidak valid");
            System.exit(0);
        }

        System.out.println("Nama Pegawai: " + nama);
        System.out.println("Departemen: " + departemen);
        System.out.println("Gaji: Rp " + gaji);

        input.close();
    }
}
