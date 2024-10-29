/**
 * Kelas yang bertanggung jawab untuk menampilkan informasi kost.
 */
public class KostDisplay {
    /**
     * Menampilkan informasi kost termasuk nama, alamat, harga per bulan, dan status ketersediaan.
     *
     * @param kost objek KostInfo yang akan ditampilkan informasinya
     */
    public void tampilkanInformasiKost(KostInfo kost) {
        System.out.println("Nama Kost: " + kost.getNama());
        System.out.println("Alamat: " + kost.getAlamat());
        System.out.println("Harga Per Bulan: " + kost.getHargaPerBulan());
        System.out.println("Tersedia: " + (kost.isTersedia() ? "Ya" : "Tidak"));
    }
}
