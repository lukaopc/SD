import java.util.ArrayList;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Correio extends Remote {
  
    boolean cadastrarUsuario (Usuario u) throws RemoteException;
    
	boolean autenticar (String userName, String senha) throws RemoteException;
	
    // recupera a primeira mensagem na fila de mensagens do usuario
	Mensagem getMensagem (String userName) throws RemoteException;
    
    // retorna o número de mensagens na fila de mensagens dos usuário
    int nMensagens (String userName) throws RemoteException;
	
	boolean sendMensagem (Mensagem m, String userNameDestinatario) throws RemoteException;
}
