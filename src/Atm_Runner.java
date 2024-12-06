import java.util.Scanner;

public class Atm_Runner {
    /*
        Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme, çıkış işlemlerinin yapıldıgı bir
         ATM app. code create ediniz
         */
    static double bakiye = 1000;//$
    public static void main(String[] args) throws Exception {

        boolean cikis = false;
        Atm_Methods atm = new Atm_Methods();
        do {
            System.out.print("________________________________________\n" +
                    "LUTFEN YAPMAK ISTEDIĞINIZ İŞLEMİ SEÇİNİZ \n" +
                    "1. BAKİYE ÖĞRENME \n" +
                    "2. PARA ÇEKME \n" +
                    "3. PARA YATIRMA \n" +
                    "4. ÇIKIŞ \n" +
                    "________________________________________\n" +
                    "SEÇİM:");

            try {
                Scanner scanf = new Scanner(System.in);
                int selection = scanf.nextInt();
                switch (selection) {
                    case 1:
                        Atm_Methods.bakiye_ogrenme(bakiye);
                        break;
                    case 2:
                        bakiye = atm.para_cekme(bakiye);
                        break;
                    case 3:
                        bakiye = atm.para_yatirma(bakiye);
                        break;
                    case 4:
                        cikis = Atm_Methods.cikis_islemi(cikis);
                        break;
                    default:
                        break;
                }
            } catch (Exception e) {
                System.out.println("HATA");
            }

        } while (!cikis);
    }


}//Class sonu
