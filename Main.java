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
        System.out.println("\nA Função Programa está disponivel numa planilha (.xlsx) ou em formato de imagem (.jpg) que pode ser encontrada no git hub: https://github.com/kaiofbgarcia/TuringMachine-JAVA/tree/main/FuncaoPrograma");
    }
}

