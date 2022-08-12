import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle("C1");
        Circle c2 = new Circle("C2",3.6);
        Circle c3 = new Circle("C3",2.3,"green",false);
        Circle[] circles = {c1,c2,c3};

        System.out.println("Truoc khi sap xep: ");
        for (Circle circle : circles) {
            System.out.println(circle);
        }

        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);

        System.out.println("Sau khi sap xep theo duong kinh: ");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
    }
}
