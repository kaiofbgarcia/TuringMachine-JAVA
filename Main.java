import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class Main {
    
    public static void main(String[] args) throws IOException {
        Turing maquina = new Turing();
        FileReader txtFile = new FileReader("enterFile.txt");
        BufferedReader txtBuffer = new BufferedReader(txtFile); 
        String palavra = txtBuffer.readLine();
        System.out.println(palavra);
        maquina.Iniciar(palavra);
    }
}
