import java.*;
public class Pessoa {
	public float Peso;
	public double Altura;
	public String Nome;
	public String Raca;
	public float MostrarPeso() {
		return this.Peso;
	}
	public double MostrarAltura() {
		return this.Altura;
	}
	public String MostrarNome() {
		return Nome;
	}
	public String MostrarRaca() {
		return this.Raca;
	}
	public void InserirPeso(float Peso) {
		this.Peso = Peso;
	}
	public void InserirAltura(double Altura) {
		this.Altura = Altura;
	}
	public void InserirNome(String Nome) {
		this.Nome = Nome;
	}
	public void InserirRaca(String Raca) {
		this.Raca = Raca;
	}
	public void Andar() {
		System.out.println(MostrarNome() + " esta Andando");
	}
	public void Correr() {
		System.out.println(MostrarNome() + " esta Correndo");
	}
	public void Falar() {
		System.out.println(MostrarNome() + " esta Conversando");
	}
}
