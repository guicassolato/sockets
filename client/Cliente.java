import java.net.UnknownHostException;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;
import java.io.PrintStream;

public class Cliente {
  public static void main(String[] args) throws UnknownHostException, IOException {
    new Cliente("127.0.0.1", 12345).executa();
  }

  private String host;
  private int porta;

  public Cliente (String host, int porta) {
    this.host = host;
    this.porta = porta;
  }

  public void executa() throws UnknownHostException, IOException {
    Socket cliente = new Socket(this.host, this.porta);
    System.out.println("O cliente se conectou ao servidor!");

    Recebedor r = new Recebedor(cliente.getInputStream());
    new Thread(r).start();

    Scanner teclado = new Scanner(System.in);
    PrintStream saida = new PrintStream(cliente.getOutputStream());
    while (teclado.hasNextLine()) {
      saida.println(teclado.nextLine());
    }

    saida.close();
    teclado.close();
    cliente.close();    
  }
}