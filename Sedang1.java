public class Sedang1 {
    public static void main(String[] args) {
        int tabunganBulanan = 100000; // Tabungan bulan pertama
        int kenaikan = 50000; // Kenaikan tabungan tiap bulan
        int totalTabungan = 0; // Total tabungan selama 12 bulan

        for (int bulan = 1; bulan <= 12; bulan++) {
            if (bulan != 1) {
                tabunganBulanan += kenaikan;   
            }
            totalTabungan += tabunganBulanan; 
            System.out.println("Tabungan bulan ke-" + bulan + ": Rp" + tabunganBulanan);
        }
        
        System.out.println("\nTotal tabungan selama 12 bulan: Rp" + totalTabungan);
    }
}
