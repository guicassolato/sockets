import java.io.InputStream;
import java.util.Scanner;

public class Atendente implements Runnable {
  private InputStream cliente;
  Servidor servidor;
  
  public Atendente(InputStream cliente, Servidor servidor) {
    this.cliente = cliente;
    this.servidor = servidor;
  }
  
  public void run() {    
    Scanner s = new Scanner(this.cliente);
    while (s.hasNextLine()) {
      servidor.distribuiMensagem(s.nextLine());
    }
     
    s.close();    
  }  
}