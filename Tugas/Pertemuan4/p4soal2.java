import java.util.Scanner;

public class p4soal2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);

        System.out.println("\n***********SOAL 2***********");
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
        System.out.println("\nNilai Akhir: " + akhr);

        // Grade Nilai A >= 80, >=70 B < 80, >= 60 C < 70, > = 50 D < 60, E < 50
        if (akhr >= 80){
            System.out.println("Grade Nilai : A");
        }else if(akhr >= 70){
            System.out.println("Grade Nilai : B");
        }else if(akhr >= 60){
            System.out.println("Grade Nilai : C");
        }else if(akhr >= 50){
            System.out.println("Grade Nilai : D");
        }else if(akhr < 50){
            System.out.println("Grade Nilai : E");
        }

        // LULUS jika nilai >= 60 atau TIDAK LULUS jika nilai < 60
        if (akhr >= 60){
            System.out.println("\nANDA LULUS");
        }else if(akhr < 60){
            System.out.println("\nANDA TIDAK LULUS");
        }

        // Atau langsung seperti ini
        //  if (akhr >= 80){
        //     System.out.println("Grade Nilai : A");
        //     System.out.println("\nANDA LULUS");
        // }else if(akhr >= 70){
        //     System.out.println("Grade Nilai : B");
        //     System.out.println("\nANDA LULUS");
        // }else if(akhr >= 60){
        //     System.out.println("Grade Nilai : C");
        //     System.out.println("\nANDA LULUS");
        // }else if(akhr >= 50){
        //     System.out.println("Grade Nilai : D");
        //     System.out.println("\nANDA TIDAK LULUS");
        // }else if(akhr < 50){
        //     System.out.println("Grade Nilai : E");
        //     System.out.println("\nANDA TIDAK LULUS");
        // }

        // if (akhr >= 80){
        //     System.out.println("Grade Nilai : A");
        // }else if(akhr >= 70){
        //     System.out.println("Grade Nilai : B");
        // }else if(akhr >= 60){
        //     System.out.println("Grade Nilai : C");
        // }else if(akhr >= 50){
        //     System.out.println("Grade Nilai : D");
        // }else if(akhr < 50){
        //     System.out.println("Grade Nilai : E");
        // }

        System.out.println("\n");
    }
}