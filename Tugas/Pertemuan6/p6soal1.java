package Pertemuan6;
import java.util.Scanner;

public class p6soal1 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);


        System.out.println("\n**Pengulangan dengan for**\n");

        System.out.print("Masukan kata : ");
        String kata = input.nextLine();
        
        System.out.print("Masukan jumlah pengulangan : ");
        int peng = input.nextInt();
        input.nextLine();

        for (int f = 1; f <= peng; f++ ){
            System.out.println(kata);
        }
      

        System.out.println("\n==============================\n");
        

        System.out.println("**Pengulangan dengan while**\n");

        System.out.print("Masukan kata : ");
        String katawhile = input.nextLine();
        
        System.out.print("Masukan jumlah pengulangan : ");
        int pengwhile = input.nextInt();
        input.nextLine();

        int w = 1 ;
        while (w <= pengwhile) {
            System.out.println(katawhile);
            w++;
        }


        System.out.println("\n==============================\n");
        

        System.out.println("**Pengulangan dengan do while**\n");

        System.out.print("Masukan kata : ");
        String katado = input.nextLine();
        
        System.out.print("Masukan jumlah pengulangan : ");
        int pengdo = input.nextInt();

        int d = 1 ;
        do {
            System.out.println(katado);
            d++;
        } while (d <= pengdo);
        
        System.out.println(" ");

    }
}
