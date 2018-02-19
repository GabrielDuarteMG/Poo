import java.io.*;
import java.*;
import java.util.*;
public class main {
	public static void main(String[] args) {
		System.out.println("Programação Orientada a Objetos\nFacudade: UNIPAC\nAluno: Gabriel Duarte dos Santos\nProfessor: Diego Alves da Silva\nPeriodo: Primeiro\n");
		Menu();
	}
	static void Menu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1 - Le 2 numeros e faz a soma dos mesmos");
		System.out.println("2 - Le o numero e imprime o próximo número par.");
		System.out.println("3 - Le o numero e verifica se o número é par ou impar.");
		System.out.println("4 - Le o numero e verifica se o número é positivo ou negativo.");
		System.out.println("5 - Calcula o IMC");
		System.out.println("6 - Calcula o KM/h");
		System.out.println("7 - Le 3 notas e mostra se foi ou não aprovado");
		System.out.println("8 - Le uma quantidade de notas e mostra usando a media se foi ou não aprovado");
		int primeiro = scanner.nextInt();
		
		switch(primeiro) {
		case 1:Ex1();break;
		case 2:Ex2();break;
		case 3:Ex3();break;
		case 4:Ex4();break;
		case 5:Ex5();break;
		case 6:Ex6();break;
		case 7:Ex7();break;
		case 8:Ex8();break;
		default:return;
		}
	}
	static void Ex1() {
		Scanner scanner = new Scanner(System.in);
		int primeiro = scanner.nextInt();
		int segundo = scanner.nextInt();
		segundo = segundo + primeiro;
		System.out.println(segundo);
	}
	static void Ex2() {
		Scanner scanner = new Scanner(System.in);
		int primeiro = scanner.nextInt();
		if(primeiro % 2 == 0)
			System.out.println(primeiro + 2);
		else
			System.out.println(primeiro + 1);
	}
	static void Ex3() {
		Scanner scanner = new Scanner(System.in);
		int primeiro = scanner.nextInt();
		if(primeiro % 2 == 0)
			System.out.println(primeiro + " É par");
		else
			System.out.println(primeiro + " É impar");
	}
	static void Ex4() {
		Scanner scanner = new Scanner(System.in);
		int primeiro = scanner.nextInt();
		if(primeiro >= 0)
			System.out.println(primeiro + " É positivo");
		else
			System.out.println(primeiro + " É negativo");
	}
	static void Ex5() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite seu Peso");
		float primeiro = scanner.nextFloat();
		System.out.println("Digite sua Altura");
		float segundo = scanner.nextFloat();
		float imc;
		imc = primeiro / (segundo*segundo);
		System.out.println("Seu IMC = " + imc);
	}
	static void Ex6() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite a distancia percorrida em KM");
		float primeiro = scanner.nextFloat();
		System.out.println("Digite o tempo gasto em horas");
		float segundo = scanner.nextFloat();
		float imc;
		imc = primeiro/ segundo;
		System.out.println("Velocidade media foi de " + imc +"km/h");
	}
	static void Ex7() {
		Scanner scanner = new Scanner(System.in);
		int primeiro = scanner.nextInt();
		int segundo = scanner.nextInt();
		int terceiro = scanner.nextInt();
		terceiro = terceiro + segundo + primeiro;
		if(terceiro >= 60)
			System.out.println("Voce foi aprovado com "+ terceiro + " pontos");
		else
			System.out.println("Voce foi reprovado com "+ terceiro + " pontos");
	}
	static void Ex8() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite a quantidade de notas");
		int primeiro = scanner.nextInt();
		float segundo = 0;
		int x;
		float[] Notas = new float[primeiro];
		for(x = 0; x != primeiro; x++) {
			System.out.println("Digite a nota "+ x + " de " + x);
			float terceiro = scanner.nextFloat();
			segundo = segundo + terceiro;
			Notas[x] = terceiro;
		}
		segundo = segundo / x;
		if(segundo >= 60)
			System.out.println("Voce foi aprovado com "+ segundo + " pontos");
		else
			System.out.println("Voce foi reprovado com "+ segundo + " pontos");
	}
}
