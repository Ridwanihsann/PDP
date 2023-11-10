import java.util.Scanner;
public class p6soal2 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("\n===Menampilkan bilangan ganjil===\n");
        System.out.println("*****Menggunakan for*****\n");
        
        System.out.print("Angka Awal    : ");
        int awal = in.nextInt();
        
        System.out.print("Angka Akhir   : ");
        int akhir = in.nextInt();

        for (int i = awal; i <= akhir; i++ ){
            if(i % 2 == 1){
                System.out.println(i);
            }
        }

        System.out.println("\n*****Menggunakan while*****\n");
        
        System.out.print("Angka Awal    : ");
        int awl = in.nextInt();
        
        System.out.print("Angka Akhir   : ");
        int akhr = in.nextInt();

        int i = awl;
        while (i <= akhr){
            if(i % 2 == 1){
                System.out.println(i);
            }i++; 
        }

        System.out.println("\n*****Menggunakan do while*****\n");
        
        System.out.print("Angka Awal    : ");
        int a = in.nextInt();
        
        System.out.print("Angka Akhir   : ");
        int k = in.nextInt();

        int j = a;
        do {
            if(j % 2 == 1){
                System.out.println(j); 
            }j++;
        }while (j <= k);
        
    }
}
