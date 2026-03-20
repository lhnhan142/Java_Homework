package backend;
import entity.*;
import java.util.Scanner;

public class QuanLy {
    //1.Nhap
    public static HinhChuNhat Nhap(Scanner sc)
    {
        double dai = 0, rong = 0;
        while(true)
        {
            try
            {
                System.out.print("Nhap chieu dai: ");
                dai = Double.parseDouble(sc.nextLine());

                System.out.print("Nhap chieu rong: ");
                rong = Double.parseDouble(sc.nextLine());

                if(dai <= 0 || rong <= 0)
                {
                    System.out.println("Nhap lai so > 0");
                    continue;
                }

                if(dai < rong)
                {
                    System.out.println("Chieu dai phai lon hon chieu rong!");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Sai dinh dang! Nhap lai.");
            }
        }
        return new HinhChuNhat(dai, rong);
    }

    //2.Xuat
    public static void Xuat(HinhChuNhat hcn)
    {
        System.out.println(hcn);
    }

    //3.So sanh
    public static void CompareByS(HinhChuNhat a, HinhChuNhat b)
    {
        if(a.S() > b.S())
        {
            System.out.println("Hinh 1  co dien tich lon hon");
        }
        else if(a.S() == b.S())
        {
            System.out.println("Dien tich bang nhau");
        }
        else System.out.println(" Hinh 2 co dien tich lon hon hinh 1");
    }
}
