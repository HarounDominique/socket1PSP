import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
    public static void main(String[] args) {
        int Puerto = 6000;// Puerto
        ServerSocket Servidor = null;
        try {
            Servidor = new ServerSocket(Puerto);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Escuchando en " + Servidor.getLocalPort());
        try {
            Socket cliente1 = Servidor.accept();//esperando a un cliente
            Socket Cliente1 = null;//conecta
            Cliente1 = new Socket("localhost", Puerto);
            System.out.println("Puerto local: "+Cliente1.getLocalPort());//devuelve el puerto local
            System.out.println("Puerto Remoto: "+Cliente1.getPort());//devuelve el puerto remoto
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //realizar acciones con clientel
        try {
            Socket cliente2 = Servidor.accept();//esperando a otro cliente
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //realizar acciones con cliente2
        //realizar acciones con cliente3
        try {
            Socket cliente3 = Servidor.accept();//esperando a otro cliente
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            Servidor.close(); //cierro socket servidor
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
