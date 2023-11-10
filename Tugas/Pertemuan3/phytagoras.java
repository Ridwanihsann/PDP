import java.util.Scanner;

public class phytagoras {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n**********SOAL 2**********\n");

        // Input panjang dua sisi segitiga
        System.out.print("Masukkan panjang sisi A : ");
        double sisiA = input.nextDouble();

        System.out.print("Masukkan panjang sisi B : ");
        double sisiB = input.nextDouble();

        // Menghitung panjang sisi C menggunakan Hukum Pythagoras
        double sisiC = Math.sqrt(Math.pow(sisiA, 2) + Math.pow(sisiB, 2));
        
        // Menampilkan hasil
        System.out.println("Panjang sisi C adalah   : " + sisiC);

        // Menutup scanner
        input.close();
    }
}