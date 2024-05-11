public abstract class ShapeDecorator implements Shape{

    //can be inherited to sub class
    protected Shape decoratorShape;

    //constructor
    public ShapeDecorator(Shape decoratorShape){
        this.decoratorShape = decoratorShape;
    }

    //override
    public void draw(){
        decoratorShape.draw();
    }
}