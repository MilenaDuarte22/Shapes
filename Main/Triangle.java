public class Triangle extends Shapes{
    private float base;
    private float height;

    public Triangle(float base, float height){
        this.base = base;
        this.height = height;
    }


    void carac(){
        
        String color = "Blue";
        System.out.printf("its a %s Triangle", color);
        

    }

    float areaCalc(){
       
        float  area = (base * height)/ 2; 
        return  area;
    }
}