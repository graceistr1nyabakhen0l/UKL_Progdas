import java.util.Scanner;

public class Sulit1 {
    public static void main(String[] args) { // dijalankan pertama kali saat program dimulai
        Scanner input = new Scanner(System.in); // untuk membaca inputan dari user

        System.out.println("Masukkan jumlah siswa: ");
        int jumlahSiswa = input.nextInt(); // disimpan ke variabel

        int[] hariHadir = new int[jumlahSiswa]; 
        double totalHadir = 0.0;

        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("masukkan kehadiran siswa ke- " + (i + 1) + ": ");
            hariHadir[i] = input.nextInt();
            totalHadir += hariHadir[i];
        }
        double rataRata = 0.0;
        rataRata = (double) totalHadir / jumlahSiswa;

        System.out.println("\nRekap kehadiran:");
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("Siswa ke- " + (i+1) + " :" + hariHadir[i] + " hari hadir");
        }
  
        System.out.println("Rata-rata kehadiran siswa: " + rataRata + " hari");

        System.out.println("\n- Siswa di atas rata-rata:");
        for (int i = 0; i < jumlahSiswa; i++) {                                                    
            if (hariHadir[i] > rataRata) {
                System.out.println("Siswa ke-" + (i + 1) + " (" + hariHadir[i] + " hari)");
            }
        }

        System.out.println("\n- Siswa di bawah rata-rata:");
        for (int i = 0; i < jumlahSiswa; i++) {
            if (hariHadir[i] < rataRata) {
                System.out.println("Siswa ke-" + (i + 1) + " (" + hariHadir[i] + " hari)");
            }
        } 

        input.close();
    }
}
