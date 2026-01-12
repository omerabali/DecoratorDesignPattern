    public class DepolamaBirimiEkleDecorator extends   BilgisayarDecorator{

        public DepolamaBirimiEkleDecorator(Bilgisayar bilgisayar) {
            super(bilgisayar);
        }

        @Override
        public double fiyat() {
            return super.fiyat() + 5000;
        }

        @Override
        public String aciklama() {
            return super.aciklama() + ", 2 TB SSD Disk eklendi.";
        }
    }