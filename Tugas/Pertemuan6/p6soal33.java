import java.util.Scanner;
public class p6soal33 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("\n===Proram rata-rata nilai mahasiswa===\n");

        System.out.print("Masukkan jumlah matakuliah : ");
        int n = in.nextInt();
        
        // if (n <= 0) {
        //     System.out.println("Banyaknya data harus lebih dari 0.");
        //     return;
        // }
        
        double total = 0;
        
        for (int i = 1; i <= n; i++) {
            System.out.print("Masukkan data ke-" + i + ": ");
            double data = in.nextDouble();
            total += data;
        }
        
        double rataRata = total / n;
        System.out.println("Nilai rata-rata: " + rataRata);

        
    }
}
