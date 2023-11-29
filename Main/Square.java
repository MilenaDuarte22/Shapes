public class Square extends Shapes{
    private float side;

    Square(float side){
        this.side = side;
    }

    @Override
    void carac(){
        String color = "Green";
        System.out.println("its a " + color + " square");
        
    }

    @Override
    float areaCalc() {
        float areaSquare = side * side ;
        return areaSquare;
    }
}