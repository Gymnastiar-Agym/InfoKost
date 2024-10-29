/**
 * Kelas yang merepresentasikan informasi kost.
 */
public class KostInfo {
    private String nama;
    private String alamat;
    private double hargaPerBulan;
    private boolean tersedia;

    /**
     * Konstruktor untuk membuat objek KostInfo baru dengan nama, alamat, harga per bulan, dan status ketersediaan.
     *
     * @param nama         nama kost
     * @param alamat       alamat kost
     * @param hargaPerBulan harga sewa per bulan
     * @param tersedia     status ketersediaan kost
     */
    public KostInfo(String nama, String alamat, double hargaPerBulan, boolean tersedia) {
        this.nama = nama;
        this.alamat = alamat;
        this.hargaPerBulan = hargaPerBulan;
        this.tersedia = tersedia;
    }

    // Getters
    /**
     * Mendapatkan nama kost.
     *
     * @return nama kost
     */
    public String getNama() {
        return nama;
    }

    /**
     * Mendapatkan alamat kost.
     *
     * @return alamat kost
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * Mendapatkan harga sewa per bulan.
     *
     * @return harga sewa per bulan
     */
    public double getHargaPerBulan() {
        return hargaPerBulan;
    }

    /**
     * Mengecek apakah kost tersedia atau tidak.
     *
     * @return true jika kost tersedia, false jika tidak
     */
    public boolean isTersedia() {
        return tersedia;
    }

    // Setters
    /**
     * Mengatur harga sewa per bulan yang baru.
     *
     * @param hargaBaru harga sewa baru per bulan
     */
    public void setHargaPerBulan(double hargaBaru) {
        this.hargaPerBulan = hargaBaru;
    }

    /**
     * Mengatur status ketersediaan kost.
     *
     * @param tersedia true jika kost tersedia, false jika tidak
     */
    public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia;
    }
}
