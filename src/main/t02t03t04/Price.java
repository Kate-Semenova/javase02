package main.t02t03t04;

/**
 * Created by Ekaterina Semenova on 28.02.2018.
 */
public class Price {
    private int rub;
    private int kop;

    public Price(int rub, int kop) {
        this.rub = rub;
        this.kop = kop;
        this.reformat();
    }

    public Price(float price) {
        rub = Math.round(price);
        if (rub > price) {
            rub--;
        }
        kop = (int) (price * 100) - (rub * 100);

    }

    public float getPrice() {
        float price = rub + (float) kop / 100;
        return price;
    }

    public int getRub() {
        return rub;
    }

    public int getKop() {
        return kop;
    }

    public void setRub(int rub) {
        this.rub = rub;
    }

    public void setKop(int kop) {
        this.kop = kop;
    }

    private void reformat() {
        if (kop > 99) {
            rub += kop / 100;
            kop = kop % 100;
        }
    }

    @Override
    public String toString() {
        return rub + " рублей, " + kop + " копеек";
    }

    public Price sum(Price price) {
        price.setRub(rub + price.getRub());
        price.setKop(kop + price.getKop());
        price.reformat();
        return price;
    }

    @Override
    public boolean equals(Object object) {
        this.reformat();
        if (object instanceof Price) {
            Price newObject = (Price) object;
            newObject.reformat();
            return rub == newObject.getRub() && kop == newObject.getKop();
        }
        return false;
    }

    @Override
    public int hashCode() {
        final int prime = 17;
        int result = 1;
        int kopeiki = rub * 100 + kop;
        result = prime * result + kopeiki;
        return result;
    }
}
