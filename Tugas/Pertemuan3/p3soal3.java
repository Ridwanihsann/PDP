import java.util.Scanner;

public class p3soal3 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);

        System.out.println("\n***********SOAL 3***********");

        System.out.println("\n===BIODATA NILAI MAHASISWA===\n");

        // input Nama
        System.out.print("Nama        : ");
        String nama = input.nextLine();

        // input NIM
        System.out.print("NIM         : ");
        int nim = input.nextInt();

        // input Nilai Tugas
        System.out.print("Nilai Tugas : ");
        int tgs = input.nextInt();

        // input Nilai UTS
        System.out.print("Nilai UTS   : ");
        int uts = input.nextInt();

        // input Nilai UAS
        System.out.print("Nilai UAS   : ");
        int uas = input.nextInt();

        // output Nilai Akhir
        double akhr = tgs*30d/100d + uts*30/100d + uas*40/100d ;
        System.out.print("\nNilai Akhir: " + akhr);

        System.out.println("\n");


    }
}
