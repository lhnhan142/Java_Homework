package Main;

import entity.Cho;
import entity.Meo;

public class Program {
    public static void main(String[] args)
    {
        Cho cho = new Cho("Sigma", 12, "Becgie");
        Meo meo = new Meo("Kitty", 3, "Xam");
        //Dang an
        cho.anUong();
        meo.anUong();
        //keu chu
        cho.keuChu();
        meo.keuChu();
        //in bang toString
        System.out.println(cho);
        System.out.println(meo);
    }
}
