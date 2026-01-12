//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Temel Bilgisayar
        Bilgisayar bilgisayar = new TemelBilgisayar();
        System.out.println("Açıklama: " + bilgisayar.aciklama());
        System.out.println("Fiyat: " + bilgisayar.fiyat() + " TL");

        //RAM Eklenmiş Bilgisayar
        Bilgisayar ramBilgisayar = new RamEkleDecorator(new TemelBilgisayar(), 32);
        System.out.println("Açıklama: " + ramBilgisayar.aciklama());
        System.out.println("Fiyat: " + ramBilgisayar.fiyat() + " TL");

        //SSD Disk Eklenmiş Bilgisayar
        Bilgisayar ssdBilgisayar = new DepolamaBirimiEkleDecorator(new RamEkleDecorator(new TemelBilgisayar(), 32));
        System.out.println("Açıklama: " + ssdBilgisayar.aciklama());
        System.out.println("Fiyat: " + ssdBilgisayar.fiyat() + " TL");

        //Sadece SSD Disk Eklenmiş...
        Bilgisayar sadeceSSD = new DepolamaBirimiEkleDecorator(new TemelBilgisayar());
        System.out.println("Açıklama: " + sadeceSSD.aciklama());
        System.out.println("Fiyat: " + sadeceSSD.fiyat() + " TL");

    }
}