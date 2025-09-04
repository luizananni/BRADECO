import java.util.HashMap;
import java.util.Map;

class ModuloCardapio {
    private Map<String, Double> itens;

    public ModuloCardapio() {
        this.itens = new HashMap<>();
        this.itens.put("Café", 5.50);
        this.itens.put("Pão de Queijo", 4.00);
        this.itens.put("Bolo", 8.00);
    }

    public Double getPreco(String item) {
        return itens.get(item);
    }
}