package gemalto;

public class TwoTriangle extends Shape {
    private final double a, b, c;

    public TwoTriangle(double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    @Override
    public double area(){
        //area of triangle is A=sqr.rt(s(s-a)*(s-b)*(s-c)
        double s = (a + b + c) / 2;
        double area= Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Area of triangle is "+area);
        return area;
    }
}
