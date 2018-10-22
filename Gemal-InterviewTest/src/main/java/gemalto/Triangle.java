package gemalto;

public class Triangle extends Shape{
    private final double a, b, c;

    public Triangle(double a, double b, double c){
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

    public static void main(String args[]){
        Triangle triangle= new Triangle(10.02,11.05,20.07);
        triangle.area();
    }
}