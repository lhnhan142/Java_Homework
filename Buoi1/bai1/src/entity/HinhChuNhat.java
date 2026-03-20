package entity;

public class HinhChuNhat {
    public double c_dai;
    public double c_rong;

    //constructor
    public HinhChuNhat(double c_dai, double c_rong) {
        this.c_dai = c_dai;
        this.c_rong = c_rong;
    }

    public HinhChuNhat() {
        this.c_dai = 0;
        this.c_rong = 0;
    }

    //getter - seter
    public double getC_dai() {
        return c_dai;
    }

    public void setC_dai(double c_dai) {
        this.c_dai = c_dai;
    }

    public double getC_rong() {
        return c_rong;
    }

    public void setC_rong(double c_rong) {
        this.c_rong = c_rong;
    }

    public double S(){
        return c_dai * c_rong;
    }

    public double C(){
        return (c_dai = c_rong) / 2;
    }

    @Override
    public String toString() {
        return "HinhChuNhat{" +
                "c_dai=" + c_dai +
                ", c_rong=" + c_rong +
                ", S = " + this.S() +
                ", C = " + this.C() +
                '}';
    }
}
