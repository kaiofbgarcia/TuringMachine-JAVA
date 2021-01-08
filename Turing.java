import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;



public class Turing {
    
    int cont;
    char fita [];
    String resultante = "";

    public void Iniciar(String m){
        cont = 0;
        fita = m.toCharArray();
        q0();
    }
    public void q0(){
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
    public void q1(){
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
    public void q2(){
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
    public void q3(){
        System.out.print("\nPalavra Resultante:\t");
        for(int i=0; i<fita.length; i++){
            System.out.print(fita[i]); 
        }
        System.out.println("\nPalavra Aceita!");
    }
    public void qErro(){
        System.out.print("\nPalavra Resultante:\t");
        for(int i=0; i<fita.length; i++){
            System.out.print(fita[i]);    
        }
        System.out.println("\nPalavra não aceita!\n");
    }
}
