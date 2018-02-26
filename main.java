import java.io.*;
import java.*;
import java.util.*;
public class main {
 public static void main(String[] args) {
  System.out.println("Programacao Orientada a Objetos\nFacudade: UNIPAC\nAluno: Gabriel Duarte dos Santos\nProfessor: Diego Alves da Silva\nPeriodo: Primeiro\n");
  Menu();
 }

 static void Menu() {
  Scanner scanner = new Scanner(System.in);
  System.out.println("1 - Le 2 numeros e faz a soma dos mesmos");
  System.out.println("2 - Le o numero e imprime o proximo numero par.");
  System.out.println("3 - Le o numero e verifica se o numero e par ou impar.");
  System.out.println("4 - Le o numero e verifica se o numero e positivo ou negativo.");
  System.out.println("5 - Calcula o IMC");
  System.out.println("6 - Calcula o KM/h");
  System.out.println("7 - Le 3 notas e mostra se foi ou nao aprovado");
  System.out.println("8 - Le uma quantidade de notas e mostra usando a media se foi ou nao aprovado");
  System.out.println("9 - Exemplo Classe Pessoa");
  System.out.println("10 - Exemplo Classe Veiculo");
  System.out.println("11 - Exemplo Classe Animal");
  System.out.println("12 - Exemplo Classe CPF");
  System.out.println("13 - Exemplo Classe Festa");

  int primeiro = scanner.nextInt();
  switch (primeiro) {
   case 1:
    Ex1();
    break;
   case 2:
    Ex2();
    break;
   case 3:
    Ex3();
    break;
   case 4:
    Ex4();
    break;
   case 5:
    Ex5();
    break;
   case 6:
    Ex6();
    break;
   case 7:
    Ex7();
    break;
   case 8:
    Ex8();
    break;
   case 9:
    Ex9();
    break;
   case 10:
    Ex10();
    break;
   case 11:
    Ex11();
    break;
   case 12:
    Ex12();
    break;
   case 13:
    Ex13();
    break;
   default:
    return;
  }
 }
 static void FinalMenu(int Ex) {
  Scanner scanner = new Scanner(System.in);
  System.out.println("Deseja Fechar?(1 -Sim //0 -Nao)");
  Integer Resposta = scanner.nextInt();
  int a = 1;
  if (Resposta.equals(a))
   return;
  else {
   System.out.println("Deseja repetir o ex?(1 -Sim //0 -Nao)");
   Resposta = scanner.nextInt();
   if (Resposta.equals(0))
    Menu();
   else {
    switch (Ex) {
     case 1:
      Ex1();
      break;
     case 2:
      Ex2();
      break;
     case 3:
      Ex3();
      break;
     case 4:
      Ex4();
      break;
     case 5:
      Ex5();
      break;
     case 6:
      Ex6();
      break;
     case 7:
      Ex7();
      break;
     case 8:
      Ex8();
      break;
     case 9:
      Ex9();
      break;
     case 10:
      Ex10();
      break;
     case 11:
      Ex11();
      break;
     case 12:
      Ex12();
      break;
     case 13:
      Ex13();
      break;

     default:
      return;
    }
   }
  }

 }
 static void Ex1() {
  Scanner scanner = new Scanner(System.in);
  int primeiro = scanner.nextInt();
  int segundo = scanner.nextInt();
  segundo = segundo + primeiro;
  System.out.println(segundo);
  FinalMenu(1);
 }
 static void Ex2() {
  Scanner scanner = new Scanner(System.in);
  int primeiro = scanner.nextInt();
  Integer a,x = 0;
  a =primeiro % 2;
  if (a.equals(x))
   System.out.println(primeiro + 2);
  else
   System.out.println(primeiro + 1);
  FinalMenu(2);
 }
 static void Ex3() {
  Scanner scanner = new Scanner(System.in);
  int primeiro = scanner.nextInt();
  Integer a,x = 0;
  a =primeiro % 2;
  if (a.equals(x))
   System.out.println(primeiro + " e par");
  else
   System.out.println(primeiro + " e impar");
  FinalMenu(3);
 }
 static void Ex4() {
  Scanner scanner = new Scanner(System.in);
  int primeiro = scanner.nextInt();
  if (primeiro >= 0)
   System.out.println(primeiro + " e positivo");
  else
   System.out.println(primeiro + " e negativo");
  FinalMenu(4);
 }
 static void Ex5() {
  Scanner scanner = new Scanner(System.in);
  System.out.println("Digite seu Peso");
  float primeiro = scanner.nextFloat();
  System.out.println("Digite sua Altura");
  float segundo = scanner.nextFloat();
  float imc;
  imc = primeiro / (segundo * segundo);
  System.out.println("Seu IMC = " + imc);
  FinalMenu(5);
 }
 static void Ex6() {
  Scanner scanner = new Scanner(System.in);
  System.out.println("Digite a distancia percorrida em KM");
  float primeiro = scanner.nextFloat();
  System.out.println("Digite o tempo gasto em horas");
  float segundo = scanner.nextFloat();
  float imc;
  imc = primeiro / segundo;
  System.out.println("Velocidade media foi de " + imc + "km/h");
  FinalMenu(6);
 }
 static void Ex7() {
  Scanner scanner = new Scanner(System.in);
  int primeiro = scanner.nextInt();
  int segundo = scanner.nextInt();
  int terceiro = scanner.nextInt();
  terceiro = terceiro + segundo + primeiro;
  if (terceiro >= 60)
   System.out.println("Voce foi aprovado com " + terceiro + " pontos");
  else
   System.out.println("Voce foi reprovado com " + terceiro + " pontos");
  FinalMenu(7);
 }
 static void Ex8() {
  Scanner scanner = new Scanner(System.in);
  System.out.println("Digite a quantidade de notas");
  int primeiro = scanner.nextInt();
  float segundo = 0;
  int x;
  float[] Notas = new float[primeiro];
  for (x = 0; x != primeiro; x++) {
   System.out.println("Digite a nota " + x + " de " + x);
   float terceiro = scanner.nextFloat();
   segundo = segundo + terceiro;
   Notas[x] = terceiro;
  }
  segundo = segundo / x;
  if (segundo >= 60)
   System.out.println("Voce foi aprovado com " + segundo + " pontos");
  else
   System.out.println("Voce foi reprovado com " + segundo + " pontos");
  FinalMenu(8);
 }
 static void Ex9() {
  /*
   * 1. Quais s�o as caracter�sticas de pessoa, menino e menina?
   *  R_:Peso,Altura,Ra�a,Nome;
   * 2. Quais s�o as a��es de uma pessoa?
   *  R_:Andar,Falar,Correr
   * 3. Como ficaria a implementa��o deste cen�rio em Java?
   * */
  Pessoa Pessoa1 = new Pessoa();
  Pessoa1.InserirAltura(1.80);
  Pessoa1.InserirPeso(75.0f);
  Pessoa1.InserirNome("Gabriel");
  Pessoa1.InserirRaca("Branco");
  Pessoa1.Correr();
  FinalMenu(9);
 }
 static void Ex10() {
  /*
   * 10- Utilize seus conhecimentos para criar um cen�rio para representar ve�culo, carro, moto,
   *	caminh�o, avi�o e barco respondendo as seguintes quest�es
   * 1. Quais s�o as caracter�sticas de cada um?
   *  R_:O Carro � um veiculo auto motor de passeio e pouco ultilitario, a moto e um veiculo de locomocao,
   *  o caminhao e um veiculo ultilitario de carga terrestrem, o aviao e um veiculo ultilitario de carga ou de passageiros aereo,
   *  e o barco e um veiculo ultilitario de carga ou de passageiros aquatico.
   * 2. Quais s�o as a��es de cada um?
   *  R_:Ligar, Desligar, Andar, Freiar.
   * 3. De um exemplo de classe e objeto utilizando a linguagem Java
   */
  Veiculo Barco = new Veiculo();
  Barco.SetNome("Barco de vela");
  Barco.SetCombustivel("Vento");
  Barco.SetLocal("Mar");
  Barco.SetMissao("Passeio");
  Veiculo Carro = new Veiculo();
  Carro.SetNome("Carro sedan");
  Carro.SetCombustivel("Gasolina");
  Carro.SetLocal("Terra");
  Carro.SetMissao("Passeio");
  Veiculo Caminhao = new Veiculo();
  Caminhao.SetNome("Caminhao 3x4");
  Caminhao.SetCombustivel("Diesel");
  Caminhao.SetLocal("Terra");
  Caminhao.SetMissao("Carregar cargas");
  FinalMenu(10);
 }
 static void Ex11() {
  /*
   * Crie uma classe animal, utilizando suas caracter�sticas como atributo. Tamb�m crie
   * objetos para 5 tipos de animais diferentes.
   */
  Animais Animal1 = new Animais();
  Animal1.SetRaca("Cachorro");
  Animal1.SetTipo("Terrestre");
  Animal1.SetClasseAlimenticia("Onivoro");
  Animal1.SetClasse("Mamifero");
  Animais Animal2 = new Animais();
  Animal2.SetRaca("Gato");
  Animal2.SetTipo("Terrestre");
  Animal2.SetClasseAlimenticia("Onivoro");
  Animal2.SetClasse("Mamifero");
  Animais Animal3 = new Animais();
  Animal3.SetRaca("Peixe");
  Animal3.SetTipo("Aquatico");
  Animal3.SetClasseAlimenticia("Onivoro");
  Animal3.SetClasse("Peixe");
  Animais Animal4 = new Animais();
  Animal4.SetRaca("Galinha");
  Animal4.SetTipo("Terrestre");
  Animal4.SetClasseAlimenticia("Herbivoro");
  Animal4.SetClasse("Ave");
  Animais Animal5 = new Animais();
  Animal5.SetRaca("Cobra");
  Animal5.SetTipo("Terrestre");
  Animal5.SetClasseAlimenticia("Carnivora");
  Animal5.SetClasse("Reptio");
  FinalMenu(11);
 }
 static void Ex12() {
  /*
   *	Crie a classe hist�rico de transfer�ncia, nesta classe voc� deve armazenar o cpf de
   *	quem realizou a transfer�ncia (cpfOrigem), o cpf de quem recebeu (cpfDestino) e o valor
   *	recebido.
   */
  CPFBase BancoDeDados = new CPFBase();
  BancoDeDados.SetcpfOrigem(1111111111);
  BancoDeDados.SetcpfDestino(1111111111);
  BancoDeDados.SetValor(200);
  BancoDeDados.GerenateHistorico();
  BancoDeDados.SetcpfOrigem(1111111111);
  BancoDeDados.SetcpfDestino(1111111111);
  BancoDeDados.SetValor(50);
  BancoDeDados.GerenateHistorico();
  BancoDeDados.SetcpfOrigem(1111111111);
  BancoDeDados.SetcpfDestino(1111111111);
  BancoDeDados.SetValor(250);
  BancoDeDados.GerenateHistorico();
  BancoDeDados.SetcpfOrigem(1111111111);
  BancoDeDados.SetcpfDestino(1111111111);
  BancoDeDados.SetValor(240);
  BancoDeDados.GerenateHistorico();
  BancoDeDados.SetcpfOrigem(1111111111);
  BancoDeDados.SetcpfDestino(1111111111);
  BancoDeDados.SetValor(300);
  BancoDeDados.GerenateHistorico();
  BancoDeDados.ExibirTodasTransacoes();
  FinalMenu(12);
 }
 static void Ex13() {
  /*
   * Crie e classe Lista de autoriza��o, nesta classe voc� dever� armazenar o nome do
   *	evento, e o nome das pessoas que est�o liberadas para entrar no mesmo.
   */
  Scanner scanner = new Scanner(System.in);
  Festa HipHopParty = new Festa();
  HipHopParty.SetNomeDaFesta("Batalha do Beco");
  HipHopParty.AdicionarNaLista("Gabriel");
  HipHopParty.AdicionarNaLista("Daniel");
  HipHopParty.AdicionarNaLista("Lucas");
  String NomeDesejado = scanner.next();
  if (HipHopParty.VerificarLista(NomeDesejado) == true)
   System.out.println("Autorizado");
  else
   System.out.println("Nao consta na lista");
  FinalMenu(13);
 }
}
