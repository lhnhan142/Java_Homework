package entity;

public class Cho extends DongVat{
    private String giong;
    
    //constructor
    public Cho(String ten, int tuoi, String giong) {
        super(ten, tuoi);
        this.giong = giong;
    }

    //getter - setter
    public String getGiong() {
        return giong;
    }

    public void setGiong(String giong) {
        this.giong = giong;
    }

    //phuong thuc
    @Override
    public void keuChu() {
        System.out.println("Gau Gau!");
    }

    @Override
    public String toString() {
        return super.toString() + "Cho{" +
                "giong='" + giong + '\'' +
                '}';
    }
}
