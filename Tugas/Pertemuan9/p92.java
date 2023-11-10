import java.util.Scanner;

public class p92 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();

        String[] namaMahasiswa = new String[jumlahMahasiswa];
        String[] nimMahasiswa = new String[jumlahMahasiswa];
        int[] nilaiMahasiswa = new int[jumlahMahasiswa];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + ": ");
            namaMahasiswa[i] = input.next();

            System.out.print("Masukkan NIM mahasiswa ke-" + (i + 1) + ": ");
            nimMahasiswa[i] = input.next();

            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMahasiswa[i] = input.nextInt();
        }

        System.out.println("\nData Mahasiswa:");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Nama: " + namaMahasiswa[i]);
            System.out.println("NIM: " + nimMahasiswa[i]);
            System.out.println("Nilai: " + nilaiMahasiswa[i]);
        }

        System.out.print("\nMasukkan NIM mahasiswa yang ingin dihapus: ");
        String nimHapus = input.next();

        int indexHapus = -1;
        for (int i = 0; i < jumlahMahasiswa; i++) {
            if (nimMahasiswa[i].equals(nimHapus)) {
                indexHapus = i;
                break;
            }
        }

        if (indexHapus == -1) {
            System.out.println("Data mahasiswa dengan NIM " + nimHapus + " tidak ditemukan.");
        } else {
            for (int i = indexHapus; i < jumlahMahasiswa - 1; i++) {
                namaMahasiswa[i] = namaMahasiswa[i + 1];
                nimMahasiswa[i] = nimMahasiswa[i + 1];
                nilaiMahasiswa[i] = nilaiMahasiswa[i + 1];
            }
            jumlahMahasiswa--;

            System.out.println("Data mahasiswa dengan NIM " + nimHapus + " berhasil dihapus.");

            System.out.println("\nData Mahasiswa:");
            for (int i = 0; i < jumlahMahasiswa; i++) {
                System.out.println("Nama: " + namaMahasiswa[i]);
                System.out.println("NIM: " + nimMahasiswa[i]);
                System.out.println("Nilai: " + nilaiMahasiswa[i]);
            }
        }

    }
}