public class Phone extends Product{
    private int depolama;
    private double ekranBoyutu;
    private int pilKapasitesi;
    private int ram;
    private String renk;

    public Phone(double birimFiyati, int stokMiktari, String urunAdi, String markaBilgisi, String kategori, int depolama, double ekranBoyutu, int pilKapasitesi, int ram, String renk) {
        super(birimFiyati, stokMiktari, urunAdi, markaBilgisi, kategori);
        this.depolama = depolama;
        this.ekranBoyutu = ekranBoyutu;
        this.pilKapasitesi = pilKapasitesi;
        this.ram = ram;
        this.renk = renk;
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

    public int getPilKapasitesi() {
        return pilKapasitesi;
    }

    public void setPilKapasitesi(int pilKapasitesi) {
        this.pilKapasitesi = pilKapasitesi;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }
}
