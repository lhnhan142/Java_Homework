package service;
import java.util.Scanner;

import entity.TaiKhoanNganHang;

public class TKService {
    public void napTien(TaiKhoanNganHang tk, Scanner sc)
    {
        double tien = 0.0;
        while(true)
        {
            try
            {
                System.out.print("Nhap so tien can nap: ");
                tien = Double.parseDouble(sc.nextLine());
                if(tien <= 0)
                {
                    System.out.println("vui long nhap lai!");
                    continue;
                }
                break;
            }
            catch(NumberFormatException e)
            {
                System.out.println("Sai dinh dang!");
            }
        }
        tk.setSoDu(tk.getSoDu() + tien);
    }

    public void rutTien(TaiKhoanNganHang tk, Scanner sc)
    {
        double tien = 0.0;
        try
        {
            while(true)
            {
                System.out.print("Nhap so tien can rut: ");
                tien = Double.parseDouble(sc.nextLine());
                if(tk.getSoDu() < tien)
                {
                    System.out.println("So du khong du!");
                    continue;
                }
                break;
            }
        }
        catch(NumberFormatException e)
        {
            System.out.println("Khong dung dinh dang!");
        }
        tk.setSoDu(tk.getSoDu() - tien);
    }

    public void xemSoDu(TaiKhoanNganHang tk)
    {
        System.out.println(tk);
    }
}
