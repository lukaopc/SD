import java.util.LinkedList;
import java.io.Serializable;

public class Usuario implements Serializable {

	public String userName;
    public String senha;
    //private LinkedList<Mensagem> filaDeMensagens;
    
    public Usuario (String userName, String senha) {
		this.userName = userName;
		this.senha = senha;
	}  

}
