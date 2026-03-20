package frontend;
import backend.*;
import entity.*;

import java.util.Scanner;

public class Program {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        //1.Nhap
        HinhChuNhat hcn1 = QuanLy.Nhap(sc);
        HinhChuNhat hcn2 = QuanLy.Nhap(sc);

        //Xuat
        QuanLy.Xuat(hcn1);
        QuanLy.Xuat(hcn2);

        //so sanh
        QuanLy.CompareByS(hcn1, hcn2);

        sc.close();
    }
}
