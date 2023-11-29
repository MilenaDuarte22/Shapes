public class Trapezium extends Shapes{
    private float base;
    private float height;
    private float baseBig;

    Trapezium(float base, float height, float baseBig){
        this.base = base;
        this.height = height;
        this.baseBig = baseBig;
    }

    void carac(){
    String color = "pink";
    System.out.println("its a " + color + " trapezium");
    }

    float areaCalc(){
        return ((baseBig + base) * height) /2;
    }
}