import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape{

    //collection of Shapes
    private List<Shape> shapes = new ArrayList<Shape>();

    @Override
    public void drawShape(String color) {
        for(Shape sh : shapes)
        {
            sh.drawShape(color);
        }
    }

    public void add(Shape s){
        this.shapes.add(s);
    }

    public void remove(Shape s){
        shapes.remove(s);
    }

    public String clear(){
        this.shapes.clear();
        return "All shapes were cleared";
    }
}