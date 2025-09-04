import java.util.ArrayList;
import java.util.List;

class ModuloPedidos {
    private List<String> itens;
    private double valorTotal;
    private ModuloCardapio cardapio;

    public ModuloPedidos() {
        this.itens = new ArrayList<>();
        this.valorTotal = 0.0;
        this.cardapio = new ModuloCardapio();
    }

    public void adicionarItem(String item) {
        Double preco = cardapio.getPreco(item);
        if (preco != null) {
            itens.add(item);
            valorTotal += preco;
            System.out.println("Item selecionado: " + item + ", Preço: " + preco);
        } else {
            System.out.println("Item '" + item + "' não encontrado no cardápio.");
        }
    }

    public double getValorTotal() {
        return valorTotal;
    }
}