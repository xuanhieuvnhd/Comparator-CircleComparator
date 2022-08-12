public class Circle {
    private String name;
    private double radius;
    private String color;
    private boolean filled;

    public Circle(String name, double radius, String color, boolean filled) {
        this.name = name;
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }
    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }
    public Circle(String name) {
        this.name = name;
    }

    public Circle(String name, double radius) {
        this.name = name;
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "name='" + name + '\'' +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
