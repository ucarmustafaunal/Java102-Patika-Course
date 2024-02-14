package final_keyword;

public class Circle {
    public int r;
    public final double PI_NUMBER = 3.14;


    public Circle(int r){
        this.r = r;
    }

    public void calcArea(){
        double area = PI_NUMBER * this.r * this.r;
        System.out.println("Area of the circle is : "+area);
    }
}
