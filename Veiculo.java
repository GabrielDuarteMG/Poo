import java.*;
public class Veiculo {
	public String Nome;
	public String Missao;
	public String Combustivel;
	public String Local;
	public void SetNome(String N) {
		this.Nome = N;
	}
	public void SetMissao(String M) {
		this.Missao = M;
	}
	public void SetCombustivel(String C) {
		this.Combustivel = C;
	}
	public void SetLocal(String L) {
		this.Local = L;
	}
	public String GetNome() {
		return this.Nome;
	}
	public String GetMissao() {
		return this.Missao;
	}
	public String GetCombustivel() {
		return this.Combustivel;
	}
	public String GetLocal() {
		return this.Local;
	}
	public void Ligar() {
		System.out.println(GetNome() +" Esta pronto para " + GetMissao());
	}
	public void Desligar() {
		System.out.println(GetNome() +" Esta desligado mas qualquer hora voce pode ligar");
	}
	public void Andar() {
		System.out.println(GetNome() +" Esta andando agora");
	}
	public void Freiar() {
		System.out.println(GetNome() +" Esta parado agora");
	}
}
