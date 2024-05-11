public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("CIRCLE : normal border");
        circle.draw();
        System.out.println("\nCIRCLE : normal border");
        redCircle.draw();
        System.out.println("\nRECTANGLE : normal border");
        redRectangle.draw();
    }
}