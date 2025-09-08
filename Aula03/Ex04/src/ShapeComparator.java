import java.util.Comparator;

public class ShapeComparator {
    public static Comparator<Shape> getDrawingOrder() {
        return (s1, s2) -> {
            if (s1 instanceof Circle && s2 instanceof Rectangle) {
                return -1;
            } else if (s1 instanceof Circle && s2 instanceof Triangle) {
                return -1;
            } else if (s1 instanceof Rectangle && s2 instanceof Triangle) {
                return -1;
            } else if (s1 instanceof Rectangle && s2 instanceof Circle) {
                return 1;
            } else if (s1 instanceof Triangle && s2 instanceof Circle) {
                return 1;
            } else if (s1 instanceof Triangle && s2 instanceof Rectangle) {
                return 1;
            }
            return 0;
        };
    }
}