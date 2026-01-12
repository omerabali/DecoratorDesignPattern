public class RamEkleDecorator extends BilgisayarDecorator{

    private int ramBoyutu;

    public RamEkleDecorator(Bilgisayar bilgisayar,  int ramBoyutu) {
        super(bilgisayar);
        this.ramBoyutu = ramBoyutu;
    }

    public double fiyat() {
        double ramFiyati = 0;
        switch (ramBoyutu) {
            case 8:
                ramFiyati = 4500;
                break;
            case 16:
                ramFiyati = 9000;
            case 32:
                ramFiyati = 16000;
                break;
            default:
                ramFiyati = 0;
        }

        return super.fiyat() + ramFiyati;
    }

    public String aciklama() {
        return super.aciklama() + ", " + ramBoyutu + " GB Ram eklendi.";
    }
}