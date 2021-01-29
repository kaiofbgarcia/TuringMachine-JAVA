import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		int menu;
			do{
				Scanner in = new Scanner(System.in);
				System.out.println("\n=== Simulador de Máquina de Turing ===\n ==Problema do Triplo Balanceamento==");
				System.out.println("\nEscolha uma opção:\n1) Analisar palavra contida no arquivo.\n2) Mostrar a Função Programa da MT.\n3) Definição Formal da MT.\n4) Sair.\n");
				menu = in.nextInt(); 
				switch (menu){
					case 1:
						Turing maquina = new Turing();
						FileReader txtFile = new FileReader("Arquivos/enterFile.txt");
						BufferedReader txtBuffer = new BufferedReader(txtFile); 
						String palavra = txtBuffer.readLine();
						maquina.Iniciar(palavra);
					break;
					case 2: 
						printFuncaoPrograma();
					break;
					case 3:
						printDefiFormal();
					break;
					case 4: 
						System.out.println("\nFim!\n");
					break;
				}
			} while(menu != 4);  
		}

	public static void printFuncaoPrograma(){
		System.out.println("\nA Função Programa está disponivel em formato de planilha (.xlsx) ou em formato de imagem (.jpg) que pode ser encontrada no git hub: https://github.com/kaiofbgarcia/TuringMachine-JAVA/tree/main/FuncaoPrograma");
	}
	
	public static void printDefiFormal(){
		System.out.println(" A MT implementada pode ser definida como:\nMT = (Σ, Q, δ, q0, F, V, β, ❋)");
		System.out.println("Onde:\nΣ={a, b, c}\nQ={q1, q2, q3, q4, q5}\nF={q5}\nV={A, B, C}\nβ = simbolo branco\n❋ = inicio da fita.");
	}
}

