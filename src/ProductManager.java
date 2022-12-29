import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class ProductManager {
    private Scanner input = new Scanner(System.in);
    private Product product;
    private static ArrayList<Product> urunler = new ArrayList<>();
    private static TreeSet<String> markalar = new TreeSet<>(new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            return o1.compareTo(o2);
        }
    });

    {
        markalar.add("Samsung");
        markalar.add("Lenovo");
        markalar.add("Apple");
        markalar.add("Huawei");
        markalar.add("Casper");
        markalar.add("Asus");
        markalar.add("HP");
        markalar.add("Xiaomi");
        markalar.add("Monster");
    }

    public void add(Product product){
        urunler.add(product);

        if (!markalar.contains(product.getMarkaBilgisi())){
            markalar.add(product.getMarkaBilgisi());
        }
    }

    public void delete(Product product){
        if (urunler.contains(product)){
            urunler.remove(product);
        }
    }

    public static void list(){
        for (Product p : urunler){
            System.out.println(p);
        }
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public static ArrayList<Product> getUrunler() {
        return urunler;
    }

    public void printMarkalar(){
        for (String s : markalar){
            System.out.println(s);
        }
    }

    public void urunIslemleri(String kategori){
        System.out.println("1 - Ürün Ekle");
        System.out.println("2 - Ürün Sil");
        System.out.println("3 - Çıkış");
        System.out.println();

        int secilen;
        try {
            do {
                secilen = input.nextInt();

            } while (secilen < 0 || secilen > 3);
        } catch (Exception e){
            secilen = 0;
        }

        switch (secilen){
            case 1:
                System.out.println("--------------- Ürün Ekleme ---------------");
                try {
                    System.out.print("Ürün Adı: ");
                    String urunAdi = input.nextLine();
                    System.out.print("Birim Fiyatı: ");
                    double birimFiyat = input.nextInt();
                    System.out.print("Stok Miktarı: ");
                    int stok = input.nextInt();

                    System.out.println("Markalar: ");
                    int k = 1;
                    for (String s : markalar){
                        System.out.println(k + " - " + s);
                        k++;
                    }

                    int secilenMarka;
                    System.out.print("Marka Seçiniz: ");
                    do {
                        secilenMarka = input.nextInt();
                    } while (secilenMarka < 1 || secilenMarka > 9);
                    String marka = "";

                    switch (secilenMarka){
                        case 1:
                            marka = "Apple";
                            break;
                        case 2:
                            marka = "Asus";
                            break;
                        case 3:
                            marka = "Casper";
                            break;
                        case 4:
                            marka = "HP";
                            break;
                        case 5:
                            marka = "Huawei";
                            break;
                        case 6:
                            marka = "Lenovo";
                            break;
                        case 7:
                            marka = "Monster";
                            break;
                        case 8:
                            marka = "Samsung";
                            break;
                        case 9:
                            marka = "Xiaomi";
                            break;
                    }

                    System.out.print("Ram: ");
                    int ram = input.nextInt();
                    System.out.print("Depolama: ");
                    int depolama = input.nextInt();
                    System.out.print("Ekran Boyutu: ");
                    double ekranBoyutu = input.nextDouble();
                    add(new Notebook(birimFiyat,stok,urunAdi,marka,ram,depolama,ekranBoyutu,kategori));
                    System.out.println("Ürün eklendi!");
                } catch (Exception e){
                    System.out.println("Ürün eklenemedi");
                    break;
                }
                break;
            case 2:
                System.out.println("--------------- Ürün Silme ---------------");
                System.out.println("Silmek istediğiniz ürünün ID sini giriniz.");
                int silinecekID;
                try {
                    do {
                        silinecekID = input.nextInt();

                    } while (silinecekID < 0);
                } catch (Exception e){
                    System.out.println("Geçersiz Değer");
                    break;
                }
                if (kategori.equals("laptop")){
                    for (Product p : urunler){
                        if (p.getKategori().equals("laptop")){
                            if (p.getId() == silinecekID){
                                delete(p);
                                System.out.println("Ürün Silindi");
                                break;
                            }
                        }
                    }
                } else if (kategori.equals("telefon")){
                    for (Product p : urunler){
                        if (p.getKategori().equals("telefon")){
                            if (p.getId() == silinecekID){
                                delete(p);
                                System.out.println("Ürün Silindi");
                                break;
                            }
                        }
                    }
                }
                break;
            case 3:
                break;
        }
    }
}
