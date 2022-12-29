public class Notebook extends Product{
    private int ram;
    private int depolama;
    private double ekranBoyutu;

    public Notebook(){
    }

    public Notebook(double birimFiyati, int stokMiktari, String urunAdi, String markaBilgisi, int ram, int depolama, double ekranBoyutu, String kategori) {
        super(birimFiyati, stokMiktari, urunAdi, markaBilgisi,kategori);
        this.ram = ram;
        this.depolama = depolama;
        this.ekranBoyutu = ekranBoyutu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getDepolama() {
        return depolama;
    }

    public void setDepolama(int depolama) {
        this.depolama = depolama;
    }

    public double getEkranBoyutu() {
        return ekranBoyutu;
    }

    public void setEkranBoyutu(double ekranBoyutu) {
        this.ekranBoyutu = ekranBoyutu;
    }
}
