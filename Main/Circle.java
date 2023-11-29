public class Circle extends Shapes{

     // Constructor that takes radius as a parameter
     private float radius; // New private attribute

     public Circle(float radius){
        this.radius = radius;
    }

    void carac(){
        
        String color = "yellow";
        System.out.println("It's a " + color + " circle");
        System.out.println("Radius: " + radius + " cm");
    }

    float areaCalc(){
        return (float) (Math.PI * Math.pow(radius, 2));
    }
} 