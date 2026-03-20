package entity;

public class TaiKhoanNganHang {
    private String soTaiKhoan;
    private String chuTaiKhoan;
    private double soDu;

    //constructor
    public TaiKhoanNganHang(String soTaiKhoan, String chuTaiKhoan, double soDu) {
        this.soTaiKhoan = soTaiKhoan;
        this.chuTaiKhoan = chuTaiKhoan;
        this.soDu = soDu;
    }
    public TaiKhoanNganHang()
    {
        this.soTaiKhoan = "";
        this.chuTaiKhoan = "";
        this.soDu = 0.0;
    }

    //getter/ setter
    public String getSoTaiKhoan() {
        return soTaiKhoan;
    }

    public void setSoTaiKhoan(String soTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
    }

    public String getChuTaiKhoan() {
        return chuTaiKhoan;
    }

    public void setChuTaiKhoan(String chuTaiKhoan) {
        this.chuTaiKhoan = chuTaiKhoan;
    }

    public double getSoDu() {
        return soDu;
    }

    public void setSoDu(double soDu) {
        this.soDu = soDu;
    }

    //to String
    @Override
    public String toString() {
        return "TaiKhoanNganHang{" +
                "soTaiKhoan='" + soTaiKhoan + '\'' +
                ", chuTaiKhoan='" + chuTaiKhoan + '\'' +
                ", soDu=" + soDu +
                '}';
    }
}
