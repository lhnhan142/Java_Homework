package entity;

public class Meo extends DongVat{
    private String mauLong;
    
    //constructor
    public Meo(String ten, int tuoi, String mauLong) {
        super(ten, tuoi);
        this.mauLong = mauLong;
    }

    //getter - setter
    public String getMauLong() {
        return mauLong;
    }

    public void setMauLong(String mauLong) {
        this.mauLong = mauLong;
    }

    //phuong thuc

    @Override
    public void keuChu() {
        System.out.println("Meo Meo!");
    }

    @Override
    public String toString() {
        return super.toString() + "Meo{" +
                "mauLong='" + mauLong + '\'' +
                '}';
    }
}
