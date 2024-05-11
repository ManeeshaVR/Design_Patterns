public class ShapMaker {

    private Circle circle;

    private Rectangle rectangle;

    public ShapMaker(){
        circle = new Circle();
        rectangle = new Rectangle();
    }

    public void drawCircle(){
        circle.draw();
    }

    public void drawRectangle(){
        rectangle.draw();
    }
}
