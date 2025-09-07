package modem;

public class ModemImpl implements Connection, DataChannel {

    @Override
    public void dial(String pno) {
        System.out.println("Discando para: " + pno + "...");
    }

    @Override
    public void hangup() {
        System.out.println("Encerrando a chamada...");
    }

    @Override
    public void send(char c) {
        System.out.println("Enviando caractere: " + c);
    }

    @Override
    public char recv() {
        System.out.println("Recebendo caractere...");
        return 'A';
    }
}
