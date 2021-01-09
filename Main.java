import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        int menu;
	do{
		Scanner in = new Scanner(System.in);
			System.out.println("\nEscolha uma opção:\n1) Analisar palavra contida no arquivo.\n2) Mostrar a Função Programa da MT.\n3) Sair.\n");
			menu = in.nextInt();
        	switch (menu){
            	case 1:
                	Turing maquina = new Turing();
                	FileReader txtFile = new FileReader("enterFile.txt");
                	BufferedReader txtBuffer = new BufferedReader(txtFile); 
                	String palavra = txtBuffer.readLine();
                	maquina.Iniciar(palavra);
                	break;
            	case 2: 
                	printFuncaoPrograma();
                	break;
            	case 3: 
                	System.out.println("\nFim!\n");
                	break;
        	}
	} while(menu != 3);  
    }

    public static void printFuncaoPrograma(){
        System.out.println("\nδ\t|\ta\t|\tb\t|\tA\t|\tB\t|\tX");
        System.out.println("q0\t| q1,A,D|\t\t|\t\t| q0,B,D| q3,X,D");
        System.out.println("q1\t| q1,a,D| q2,B,E|\t\t| q1,B,D| ");
        System.out.println("q2\t| q2,a,E|\t\t| q0,A,D| q2,B,E|");
        System.out.println("q3\t|\t\t|\t\t|\t\t|\t\t|");
    }
}

