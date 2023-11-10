import java.util.Scanner;

public class p3soal2 {
    public static void main(String[] args) {

        System.out.println("\n**********SOAL 2**********\n");

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi A: ");
        double sisiA = input.nextDouble();

        System.out.print("Masukkan panjang sisi B: ");
        double sisiB = input.nextDouble();

        // Menghitung panjang sisi C menggunakan Hukum Pythagoras
        double sisiC = Math.sqrt((sisiA * sisiA) + (sisiB * sisiB));

        System.out.println("\nPanjang sisi C adalah: " + sisiC + "\n");

        input.close();
    }
}