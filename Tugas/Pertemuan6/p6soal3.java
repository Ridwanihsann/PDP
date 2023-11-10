import java.util.Scanner;
public class p6soal3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("\n===Program rata-rata nilai mahasiswa===\n");

        System.out.print("Masukkan jumlah matakuliah : ");
        int n = in.nextInt();

        double total = 0;
        for (int i = 1; i <= n; i++){
            System.out.print("Nilai matakuliah ke-" + i + " : ");
            double nilai = in.nextDouble();
            total += nilai;
        }
        double rataRata = total / n;
        System.out.println("\nRATA-RATA NILAI : " + rataRata);
        System.out.println(" ");
    }
}
