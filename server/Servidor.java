import java.io.IOException;
import java.util.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.PrintStream;
 
public class Servidor {
  public static void main(String[] args) throws IOException {
    new Servidor(12345).executa();
  }

  private int porta;
  private List<PrintStream> clientes;

  public Servidor (int porta) {
    this.porta = porta;
    this.clientes = new ArrayList<PrintStream>();
  }

  public void executa () throws IOException {
    ServerSocket servidor = new ServerSocket(this.porta);
    System.out.println("Porta 12345 aberta!");

    while (true) {
      Socket cliente = servidor.accept();
      System.out.println("Nova conexão com o cliente " +   
        cliente.getInetAddress().getHostAddress()
      );

      PrintStream ps = new PrintStream(cliente.getOutputStream());
      this.clientes.add(ps);

      Atendente a = new Atendente(cliente.getInputStream(), this);
      new Thread(a).start();
    }
  }

  public void distribuiMensagem(String msg) {
    for (PrintStream cliente: this.clientes) {
      cliente.println(msg);
    }
  }
}