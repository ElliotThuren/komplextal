package Komplex;

public class Komplex {
    double real, img;

    Komplex(double r, double i){
        this.real = r;
        this.img = i;
    }
    public static Komplex sum(Komplex c1, Komplex c2)
    {
        Komplex temp = new Komplex(0, 0);

        temp.real = c1.real + c2.real;
        temp.img = c1.img + c2.img;

        return temp;
    }
    public static void main(String args[]) {
        Komplex c1 = new Komplex(5.5, 4);
        Komplex c2 = new Komplex(1.2, 3.5);
        Komplex temp = sum(c1, c2);
        System.out.printf("Sum is: " + temp.real + " + " + temp.img + "i");
    }
}
