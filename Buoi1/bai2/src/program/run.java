package program;

import entity.TaiKhoanNganHang;
import service.TKService;

import java.util.Scanner;

public class run {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        TaiKhoanNganHang tk = new TaiKhoanNganHang();
        TKService service = new TKService();
        //nap tien
        service.napTien(tk, sc);
        //rut tien
        service.rutTien(tk, sc);
        //in
        service.xemSoDu(tk);
    }
}
