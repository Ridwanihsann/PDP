import java.util.Scanner;

public class p7soal1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Jumlah Awal   : ");
        int aw = in.nextInt();
        
        System.out.print("Jumlah akhir  : ");
        int ak = in.nextInt();
        
        
        for (int i = aw; i <= ak; i++){
            for (int j = 1; j<= i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    
}
