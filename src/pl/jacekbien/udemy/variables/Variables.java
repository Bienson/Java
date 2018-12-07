package pl.jacekbien.udemy.variables;

public class Variables {
    public static void main(String[] args) {

        // Variables

        byte b = 127;
        byte b1 = -128;
        short s = Short.MAX_VALUE;
        long l = Long.MAX_VALUE;
        Long l1 = 23L;
        int i = Integer.MAX_VALUE;
        Integer integer = 2;

        int sum = i + 1;


        float f = Float.MAX_VALUE;
        float f1 = 1.5f;
        double d = Double.MAX_VALUE;
        double d1 = 2.1d;

        char c = 'a';
        String helloHowAreYou = "Hello, how are You?";

        boolean boo = true;
        boolean boo2 = false;
        System.out.println(b);
        System.out.println(s);
        System.out.println(l);
        System.out.println(l1);
        System.out.println(i);
        System.out.println(f);
        System.out.println(d);
        System.out.println(boo);
        System.out.println(helloHowAreYou);

        // The meaning of brackets

        System.out.println("---------------------------------");
        System.out.println("Sum: " + b + b1);
        System.out.println("Sum: " + (b + b1));

        // Operations on variables

        int x = 1 + 2;
        int x1 = x + b;
        int y = b - b1;
        int xx = y * y;
        int yy = x1 / x;
        double dd = x1 / x;
        double dx = 3;
        double dy = 130;
        double dz = dy / dx;
        int r = x1%x;
        System.out.println("-------------------------------------");
        System.out.println(x);
        System.out.println(x1);
        System.out.println(y);
        System.out.println(xx);
        System.out.println(yy); // 130 / 3 = 43 => Missing reminder
        System.out.println(dd); // 130 / 3 = 43.0 => Still missing reminder
        System.out.println(dz); // 130 / 3 = 43.333333333333336
        System.out.println(r);

        // Incrementation and decrementation

        int i1 = 10;
        int i2 = 20;
        int i3 = 30;
        int i4 = 40;

        System.out.println("-----------------------------------------");
        System.out.println(i1++); // i1 = i1 + 1
        System.out.println(i1);
        System.out.println(++i2); // i2 = x2 + 1
        System.out.println(i3--); // i3 = i3 - 1
        System.out.println(i3);
        System.out.println(--i4); // i4 = i4 - 1

        x += 5; // x = x + 5;
        x -= 5; // x = x - 5;
        x *= 5; // x = x * 5;
        x /= 5; // x = x / 5;
        x %= 5; // x = x % 5;

        System.out.println(x);

        // Const

        final int Z_Z = 13;

        System.out.println(Z_Z);

        // Var

        var sdf = 7;
        // var = q;
        // var = null;  var nie może być typu object
        var g = 1; //wartość var jest typu int do momentu aż braknie miejsca, wtedy ma wartość long
        var o = 1.1; //Zawsze wartość double
        var q = "napis";
        var w = 'q';

    }
}
