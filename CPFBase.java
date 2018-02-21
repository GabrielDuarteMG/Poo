import java.*;
import java.util.*;
public class CPFBase {
	List<String> Historico = new ArrayList<String>();
	public int cpfOrigem;
	public int cpfDestino;
	public double Valor;
	public int Transacoes = 0;
	public void SetcpfOrigem(int cpf) {
		this.cpfOrigem = cpf;
	}
	public void SetcpfDestino(int cpf) {
		this.cpfDestino = cpf;
	}
	public void SetValor(double Valor) {
		this.Valor = Valor;
	}
	public int GetcpfOrigem() {
		return this.cpfOrigem;
	}
	public int GetcpfDestino() {
		return this.cpfDestino;
	}
	public double GetValor() {
		return this.Valor;
	}
	public void GerenateHistorico() {
		Historico.add( "CpfOrigem:" + GetcpfOrigem() + "//CpfDestino:" + GetcpfDestino()+ "//Valor:R$" + GetValor());
		Transacoes++;
	}
	public void ExibirTodasTransacoes() {
		for(int x = 0; x!= Transacoes;x++)
		System.out.println(Historico.get(x));
	}
}
