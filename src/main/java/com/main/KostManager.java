/**
 * Kelas yang mengelola operasi untuk objek KostInfo, termasuk mengubah harga kost.
 */
public class KostManager {
    /**
     * Mengubah harga kost jika harga baru valid (lebih besar dari 0).
     *
     * @param kost      objek KostInfo yang akan diubah harganya
     * @param hargaBaru harga baru yang akan diterapkan pada kost
     */
    public void ubahHargaKost(KostInfo kost, double hargaBaru) {
        if (hargaBaru > 0) {
            kost.setHargaPerBulan(hargaBaru);
            System.out.println("Harga baru untuk Kost " + kost.getNama() + ": " + kost.getHargaPerBulan());
        } else {
            System.out.println("Harga tidak valid!");
        }
    }

    /**
     * Mengubah status ketersediaan kost.
     *
     * @param kost     objek KostInfo yang status ketersediaannya akan diubah
     * @param tersedia status ketersediaan baru
     */
    public void setTersedia(KostInfo kost, boolean tersedia) {
        kost.setTersedia(tersedia);
        System.out.println("Status ketersediaan untuk Kost " + kost.getNama() + ": " + (tersedia ? "Ya" : "Tidak"));
    }
}
