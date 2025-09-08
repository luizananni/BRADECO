import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    /*Resposta das perguntas
        A) Não é possível adicionar essa funcionalidade de ordenação sem modificar o método, já que ele itera sobre a lista de forma fixa.
        B) A codigo está aberto para a extensão mas fechado para modificação, tudo isso com a refatoração.
     */
    public static void drawAllShapes(List<Shape> shapes, Comparator<Shape> comparator) {
        shapes.stream()
              .sorted(comparator)
              .forEach(Shape::draw);
    }

    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Rectangle());
        shapes.add(new Circle());
        shapes.add(new Triangle());

        System.out.println("___ Desenhando com a ordem padrão: ___");
        drawAllShapes(shapes, (s1, s2) -> 0);

        System.out.println("\n___ Desenhando com a ordem: Circle, Rectangle, Triangle ___");
        Comparator<Shape> order1 = (s1, s2) -> {
            if (s1 instanceof Circle) return -1;
            if (s2 instanceof Circle) return 1;
            if (s1 instanceof Rectangle) return -1;
            if (s2 instanceof Rectangle) return 1;
            return 0;
        };
        drawAllShapes(shapes, order1);

        System.out.println("\n___ Desenhando com a ordem: Rectangle, Triangle, Circle ___");
        Comparator<Shape> order2 = (s1, s2) -> {
            if (s1 instanceof Rectangle) return -1;
            if (s2 instanceof Rectangle) return 1;
            if (s1 instanceof Triangle) return -1;
            if (s2 instanceof Triangle) return 1;
            return 0;
        };
        drawAllShapes(shapes, order2);
    }
}