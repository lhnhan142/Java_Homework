package entity;

public class DongVat {
    private String ten;
    private int tuoi;

    //constructor
    public DongVat(String ten, int tuoi) {
        this.ten = ten;
        this.tuoi = tuoi;
    }
    public DongVat()
    {
        ten = "";
        tuoi = 0;
    }
    
    //getter - setter
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    //phuong thuc
    public void anUong()
    {
        System.out.println(ten + " Dang an");
    }
    public void keuChu()
    {
        System.out.println("...");
    }

    @Override
    public String toString() {
        return "DongVat{" +
                "ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                '}';
    }
}
