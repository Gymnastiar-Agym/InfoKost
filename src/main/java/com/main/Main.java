/**
 * Kelas utama untuk menjalankan aplikasi info kost.
 */
public class Main {
    /**
     * Metode utama yang memulai aplikasi info kost.
     *
     * @param args argumen baris perintah
     */
    public static void main(String[] args) {
        KostInfo kost1 = new KostInfo("Kost Putri A", "Jl. Merdeka No.10", 500000, true);

        // Display Kost Info
        KostDisplay display = new KostDisplay();
        display.tampilkanInformasiKost(kost1);

        // Update Harga Kost
        KostManager manager = new KostManager();
        manager.ubahHargaKost(kost1, 550000);
    }
}
