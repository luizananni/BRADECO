// Código original
import java.util.ArrayList;
import java.util.List;

public class Main {

    /**Resposta das oerguntas:
     * A mudança permitiu adicionar o Triangle sem tocar na função principal porque agora essa função trabalha com um a interface Shape, ao inves de se preocupar com cada tipo de forma.
        Assim, o código está fechado para mudanças, ou seja, não precisa ser alterado para cada forma nova. E também aberto para crescimento, com as novas formas podendo serem adicionadas facilmente.
     */
    public static void drawAllShapes(List<Shape> shapes) {
        for (Shape s : shapes) {
            s.draw();
        }
    }

    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();

        System.out.println("___ Desenhando as formas iniciais ___");
        shapes.add(new Circle());
        shapes.add(new Square());
        drawAllShapes(shapes);

        System.out.println("\n___ Adicionando o Triangulo sem modificar o codigo original ___");
        shapes.add(new Triangle());
        drawAllShapes(shapes);
    }
}