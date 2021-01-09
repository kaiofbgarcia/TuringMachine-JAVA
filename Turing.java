import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Turing {
    
    int cont;
    char fita [];
    String resultante = "";

    public void Iniciar(String m) throws IOException{
        cont = 0;
        fita = m.toCharArray();
        q0();
    }
    public void q0() throws IOException{
        if(cont < fita.length){
            if(fita[cont] == 'a'){
                fita[cont] = 'A';
                cont ++;
                q1();
            } else if(fita[cont] == 'B'){
                fita[cont] = 'B';
                cont ++;
                q0();
            } else if(fita[cont] == 'X'){
                fita[cont] = ' ';
                q3();
            } 
            else{
                qErro();
            }
        }
    }
    public void q1() throws IOException{
        if(cont < fita.length){
            if(fita[cont] == 'a'){
                fita[cont] = 'a';
                cont ++;
                q1();
            } else if(fita[cont] == 'B'){
                fita[cont] = 'B';
                cont ++;
                q1();
            } else if(fita[cont] == 'b'){
                fita[cont] = 'B';
                cont --;
                q2();
            } else{
                qErro();
            }
        }
    }
    public void q2() throws IOException{
        if(cont < fita.length){
            if(fita[cont] == 'a'){
                fita[cont] = 'a';
                cont --;
                q2();
            } else if(fita[cont] == 'B'){
                fita[cont] = 'B';
                cont --;
                q2();
            } else if(fita[cont] == 'A'){
                fita[cont] = 'A';
                cont ++;
                q0();
            } else{
                qErro();
            }
        }
    }
    public void q3 () throws IOException{
        System.out.print("\nPalavra Resultante:\t");
        String string = new String(fita);
        System.out.println(string);
        BufferedWriter escrita = new BufferedWriter(new FileWriter("finalFile.txt"));
        escrita.append(string);
		escrita.close();
        System.out.println("\nPalavra Aceita!");
    }
    public void qErro() throws IOException{
        System.out.print("\nPalavra Resultante:\t");
        String string = new String(fita);
        System.out.println(string);
        BufferedWriter escrita = new BufferedWriter(new FileWriter("finalFile.txt"));
        escrita.append(string);
		escrita.close();
        System.out.println("\nPalavra não aceita!\n");
    }
}
