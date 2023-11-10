import java.util.Scanner;

public class p5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama pegawai                              : ");
        String nama = scanner.nextLine();

        System.out.print("Departemen (Produksi/Marketing/Inventory) : ");
        String departemen = scanner.nextLine();

        System.out.print("Pengalaman kerja (dalam tahun)            : ");
        int pengalaman = scanner.nextInt();

        int gaji = 0;

        if (pengalaman < 1) {
            gaji = 3000000;
        } else if (pengalaman >= 1 && pengalaman <= 2) {
            gaji = 4000000;
        } else if (pengalaman > 2) {
            gaji = 5000000;
        } else {
            System.out.println("Pengalaman kerja tidak valid");
            return;
        }

        if (departemen.equalsIgnoreCase("Produksi")) {
            System.out.println("\nNama      : " + nama);
            System.out.println("Departemen  : " + departemen);
            System.out.println("Gaji        : " + gaji);
        } else if (departemen.equalsIgnoreCase("Marketing")) {
            System.out.println("Nama        : " + nama);
            System.out.println("Departemen  : " + departemen);
            System.out.println("Gaji    : " + gaji);
        } else if (departemen.equalsIgnoreCase("Inventory")) {
            System.out.println("Nama        : " + nama);
            System.out.println("Departemen  : " + departemen);
            System.out.println("Gaji        : " + gaji);
        } else {
            System.out.println("Departemen tidak valid");
    }
    }
}