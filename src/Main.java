import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Notebook notebook1 = new Notebook(7000,10,"HUAWEI Matebook 14","Huawei",16,512,14.0,"laptop");
        Notebook notebook2 = new Notebook(3699,10,"LENOVO V14 IGL","Lenovo",8,1024,14.0,"laptop");
        Notebook notebook3 = new Notebook(15000,10,"ASUS Tuf Gaming","Asus",32,2048,15.6,"laptop");

        productManager.add(notebook1);
        productManager.add(notebook2);
        productManager.add(notebook3);

        Phone phone1 = new Phone(7000,10,"SAMSUNG GALAXY A51","Samsung","telefon",166,6,5000,8,"Siya");
        Phone phone2 = new Phone(9000,10,"iPhone 11","Apple","telefon",166,6,5000,8,"Siya");
        Phone phone3 = new Phone(8500,10,"Redmi Note 10 Pro","Xiaomi","telefon",166,6,5000,8,"Siya");

        productManager.add(phone1);
        productManager.add(phone2);
        productManager.add(phone3);

        System.out.println("PatikaStore Ürün Yönetim Paneli");
        while (true){
            System.out.println("1 - Notebook İşlemleri");
            System.out.println("2 - Cep Telefonu İşlemleri");
            System.out.println("3 - Marka Listele");
            System.out.println("4 - Ürünleri Listele");
            System.out.println("0 - Çıkış Yap");

            Scanner input = new Scanner(System.in);
            int secilen;
            try {
                do {
                    secilen = input.nextInt();

                } while (secilen < 0 || secilen > 4);
            } catch (Exception e){
                System.out.println("Geçersiz Değer");
                secilen = 6;
            }

            switch (secilen){
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("Notebook İşlemleri");
                    for (Product p : ProductManager.getUrunler()){
                        if (p.getKategori().equals("laptop")){
                            System.out.println(p);
                        }
                    }
                    productManager.urunIslemleri("laptop");
                    break;
                case 2:
                    System.out.println("2 - Cep Telefonu İşlemleri");
                    for (Product p : ProductManager.getUrunler()){
                        if (p.getKategori().equals("telefon")){
                            System.out.println(p);
                        }
                    }
                    productManager.urunIslemleri("telefon");
                    break;
                case 3:
                    System.out.println("------------------ Markalar ------------------");
                    productManager.printMarkalar();
                    System.out.println();
                    break;
                case 4:
                    System.out.println("------------------ Ürünler ------------------");
                    System.out.println();
                    ProductManager.list();
                    System.out.println();
            }
        }
    }
}
