class ModuloPagamento {
    public boolean processarPagamento(double valor) {
        System.out.println("Pagamento Inicial de:" + valor + "...");
        if (valor > 0) {
            System.out.println("Pagamento processado! Valor; " + valor);
            return true;
        } else {
            System.out.println("Erro: Não é possível processar um pagamento de valor zero.");
            return false;
        }
    }
}