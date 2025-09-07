package modem;

public interface DataChannel {
    void send(char c);
    char recv();
}