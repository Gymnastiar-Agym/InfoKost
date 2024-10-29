/**
 * Kelas utama yang menjalankan aplikasi informasi kost.
 */
public class Main {
    /**
     * Metode utama untuk menjalankan aplikasi.
     *
     * @param args argumen baris perintah (tidak digunakan)
     */
    public static void main(String[] args) {
        // Membuat objek KostInfo untuk kost yang pertama
        KostInfo kost1 = new KostInfo("Kost Putri A", "Jl. Merdeka No.10", 500000, true);

        // Menampilkan informasi kost pertama
        KostDisplay display = new KostDisplay();
        display.tampilkanInformasiKost(kost1);

        // Membuat objek KostManager untuk mengelola kost
        KostManager manager = new KostManager();

        // Mengubah harga kost pertama
        manager.ubahHargaKost(kost1, 550000);

        // Menambah kost baru
        KostInfo kostBaru = new KostInfo("Kost Putri B", "Jl. Kebangkitan No.20", 600000, true);
        display.tampilkanInformasiKost(kostBaru);

        // Mengubah status ketersediaan kost baru
        manager.setTersedia(kostBaru, false);
        display.tampilkanInformasiKost(kostBaru);
    }
}
