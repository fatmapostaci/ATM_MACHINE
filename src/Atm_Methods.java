import java.util.Scanner;

  class Atm_Methods {
    Atm_Methods() {
    }

    static Scanner scanf = new Scanner(System.in);

    public static void bakiye_ogrenme(double bakiye) {
        System.out.printf("HESAP BAKİYENİZ  :    %.2f  TL  \n", bakiye);
    }

    double para_cekme(double bakiye) {

        try {
            System.out.print("PARA ÇEKMEK İÇİN SEÇİMİNİZİ YAPINIZ \n" +
                    " 1 -> 100  TL \n" +
                    " 2 -> 200  TL \n" +
                    " 3 -> 500  TL \n" +
                    " 4 -> TUTAR GİRİN \n" +
                    "SEÇİM: ");
            int secenek = scanf.nextInt();
            int cekilecek_tutar = switch (secenek) {
                case 1 -> 100;
                case 2 -> 200;
                case 3 -> 500;
                case 4 -> {
                    System.out.print("Çekilecek tutarı girin: ");
                    yield scanf.nextInt();
                }
                default -> {
                    System.out.println("HATALI GİRDİ");
                    yield 0;
                }

            };
            bakiye = bakiye - cekilecek_tutar;
            System.out.println("Hesabınızdan " + cekilecek_tutar + " TL para çekilmiştir ");
//                "KALAN BAKİYE:  " + bakiye + "  TL ");
        } catch (Exception e) {
            System.out.println("Para çekilemedi");
        }
        return bakiye;
    }

    double para_yatirma(double bakiye) {
        try {
            System.out.print("Para yatırmak istediğiniz tutarı girin: ");
            double yatirilacak_tutar = scanf.nextDouble();
            bakiye += yatirilacak_tutar;
            System.out.println("Hesabınıza " + yatirilacak_tutar + " TL para yatırılmıştır ");
            //   "GUNCEL BAKİYE:  " + bakiye + "  TL ");

        } catch (Exception e) {
            System.out.println("Para yatırılamadı");
        }
        return bakiye;
    }

    public static boolean cikis_islemi(boolean cikis) {
        System.out.println("GUVENLE ÇIKIŞ YAPILDI \n Kartınızı almak için lütfen bekleyin...");
        return cikis = true;
    }
}
