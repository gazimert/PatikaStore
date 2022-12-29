public class Product {
    private int id;
    private static int i = 0;
    private double birimFiyati;
    private int stokMiktari;
    private String urunAdi;
    private String markaBilgisi;
    private String kategori;

    public Product(){

    }

    public Product(double birimFiyati, int stokMiktari, String urunAdi, String markaBilgisi, String kategori) {
        this.birimFiyati = birimFiyati;
        this.stokMiktari = stokMiktari;
        this.urunAdi = urunAdi;
        this.markaBilgisi = markaBilgisi;
        this.id = i++;
        this.kategori = kategori.toLowerCase();
    }

    public int getId() {
        return id;
    }

    public double getBirimFiyati() {
        return birimFiyati;
    }

    public void setBirimFiyati(double birimFiyati) {
        this.birimFiyati = birimFiyati;
    }

    public int getStokMiktari() {
        return stokMiktari;
    }

    public void setStokMiktari(int stokMiktari) {
        this.stokMiktari = stokMiktari;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }

    public String getMarkaBilgisi(){
        return markaBilgisi;
    }

    public void setMarkaBilgisi(String markaBilgisi){
        this.markaBilgisi = markaBilgisi;
    }
    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", birimFiyati=" + birimFiyati +
                ", stokMiktari=" + stokMiktari +
                ", urunAdi='" + urunAdi + '\'' +
                ", markaBilgisi='" + markaBilgisi + '\'';
    }
}
