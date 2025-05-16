package module_14;

public class Box {

    private double width;
    private double depth;
    private double height;

    public Box(double width, double depth, double height){
        this.depth = depth;
        this.height = height;
        this.width = width;
    }

    public double getWidth(){
        return width;
    }

    @Override
    public String toString() {
        return String.format("Box [width=%.2f, height=%.2f, depth=%.2f]", width, height, depth);
    }
}
