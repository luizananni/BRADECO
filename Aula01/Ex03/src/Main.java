public class Main {
    public static void main(String[] args) {
        ModuloPedidos meuPedido = new ModuloPedidos();
        meuPedido.adicionarItem("Café");
        meuPedido.adicionarItem("Bolo");

        System.out.println("Pedido criado. Total do pedido: " + meuPedido.getValorTotal());
        ModuloPagamento meuPagamento = new ModuloPagamento();
        meuPagamento.processarPagamento(meuPedido.getValorTotal());
    }
}