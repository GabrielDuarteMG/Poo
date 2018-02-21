import java.*;
import java.util.*;
import java.lang.Boolean;
public class Festa {
	public List<String> Nomes = new ArrayList<String>();
	public String NomeDaFesta;
	public void SetNomeDaFesta(String NomeDaFesta) {
		this.NomeDaFesta = NomeDaFesta;
	}
	public String GetNomeDaFesta() {
		return this.NomeDaFesta;
	}
	public void AdicionarNaLista(String Nome) {
		Nomes.add(Nome);
	}
	public void RemoverDaLista(String Nome){
		if(Nomes.contains(Nome)== true)
			Nomes.remove(Nome);
	}
	public boolean VerificarLista(String Nome) {
		if(Nomes.contains(Nome)== true)
			return true;
		else 
			return false;
	}
}
