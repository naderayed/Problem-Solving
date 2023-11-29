import solutions.Discount;

public class MainApplication {

    public static void main(String[] args)  {

        var d = new Discount();
        int [] tab = {1,20,5};
        System.out.println(d.disc(tab,10));
    }
}

