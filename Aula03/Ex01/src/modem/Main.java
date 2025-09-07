package modem;

public class Main {
    public static void main(String[] args) {
        ModemImpl modem = new ModemImpl();

        modem.dial("888-888");
        modem.hangup();

        modem.send('X');
        char recebido = modem.recv();
        System.out.println("Caractere recebido: " + recebido);
    }
}
