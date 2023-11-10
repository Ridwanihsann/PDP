import java.util.Scanner;

public class tes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama          : ");
        String nama = input.nextLine();

        //System.out.println("Pilih Departemen Dengan Memasukan Angka :\n1. Produksi\n2. Marketing\n3. Inventory");
        
        int 1 = "Produksi" ;
        int 2 = "Marketing";
        int 3 = "Inventory";

        System.out.print("Departemen    : ");
        int departemen = input.nextInt();

        

        // System.out.print("Masukkan pengalaman kerja (dalam tahun): ");
        // int pengalaman = input.nextInt();

        double gaji = 0.0;

        if (departemen == 1 ) {
            System.out.println("pilih pengalaman");
            System.out.print("Pengalaman kerja (dalam tahun): ");
            int pengalaman = input.nextInt();

            if (pengalaman < 1) {
            gaji = 3000000.0;
            } else if (pengalaman >= 1 && pengalaman <= 2) {
            gaji = 4000000.0;
            } else if (pengalaman > 2) {
            gaji = 5000000.0;
            } else {
            System.out.println("Salah memasukan pengalaman");
            System.exit(0);
            }
        }
        else if (departemen == 2 ) {

            System.out.print("Pengalaman kerja (dalam tahun): ");
            int pengalaman = input.nextInt();

            if (pengalaman < 1) {
            gaji = 3000000.0;
            } else if (pengalaman >= 1 && pengalaman <= 2) {
            gaji = 4000000.0;
            } else if (pengalaman > 2) {
            gaji = 5000000.0;
            } else {
            System.out.println("Salah memasukan pengalaman");
            System.exit(0);
            }
        }
        else if (departemen == 3 ) {

            System.out.print("Pengalaman kerja (dalam tahun): ");
            int pengalaman = input.nextInt();

            if (pengalaman < 1) {
            gaji = 3000000.0;
            } else if (pengalaman >= 1 && pengalaman <= 2) {
            gaji = 4000000.0;
            } else if (pengalaman > 2) {
            gaji = 5000000.0;
            } else {
            System.out.println("Salah memasukan pengalaman");
            System.exit(0);
            }
        }

        //     gaji = 3000000.0;
        // } else if (departemen == "Marketing") {

        //     gaji = 4000000.0;
        // } else if (departemen == "Inventory") {
        //     gaji = 5000000.0;
        // } else {
        //     System.out.println("Pengalaman kerja tidak valid");
        //     System.exit(0);
        // }





        // if (pengalaman < 1) {
        //     gaji = 3000000.0;
        // } else if (pengalaman >= 1 && pengalaman <= 2) {
        //     gaji = 4000000.0;
        // } else if (pengalaman > 2) {
        //     gaji = 5000000.0;
        // } else {
        //     System.out.println("Pengalaman kerja tidak valid");
        //     System.exit(0);
        // }

        System.out.println("\n");
        System.out.println("Nama        : " + nama);
        System.out.println("Departemen  : " + departemen);
        // System.out.println("Departemen  : " + a);
        // System.out.println("Departemen  : " + b);
        // System.out.println("Departemen  : " + c);
        System.out.println("Gaji        : Rp " + gaji);

        input.close();
    }
}
