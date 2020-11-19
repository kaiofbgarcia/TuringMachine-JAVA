import java.util.Scanner;

public class Turing {
    
    int cont;
    char fita [];
    
    public static void main(String[] args) {
        Turing maquina = new Turing();
        Scanner entrada = new Scanner(System.in); 
        String palavra;
        System.out.println("Insira a palavra:");
        palavra = entrada.nextLine();
        maquina.Iniciar(palavra);
    }

    
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
                q4();
            } else{
                qErro();
            }
        }
    }
    public void q1(){
        if(cont < fita.length){
            if(fita[cont] == 'b'){
                fita[cont] = 'B';
                cont ++;
                q2();
            } else if(fita[cont] == 'a'){
                fita[cont] = 'a';
                cont ++;
                q1();
            } else if(fita[cont] == 'B'){
                fita[cont] = 'B';
                cont ++;
                q1();
            } else{
                qErro();
            }
        }
    }
    public void q2(){
        if(cont < fita.length){
            if(fita[cont] == 'c'){
                fita[cont] = 'C';
                cont --;
                q3();
            } else if(fita[cont] == 'b'){
                fita[cont] = 'b';
                cont ++;
                q2();
            } else if(fita[cont] == 'C'){
                fita[cont] = 'C';
                cont ++;
                q2();
            } else{
                qErro();
            }
        }
    }
    public void q3(){
        if(cont < fita.length){
            if(fita[cont] == 'A'){
                fita[cont] = 'A';
                cont ++;
                q0();
            } else if(fita[cont] == 'a'){
                fita[cont] = 'a';
                cont --;
                q3();
            } else if(fita[cont] == 'b'){
                fita[cont] = 'b';
                cont --;
                q3();
            } else if(fita[cont] == 'A'){
                fita[cont] = 'A';
                cont --;
                q3();
            } else if(fita[cont] == 'B'){
                fita[cont] = 'B';
                cont --;
                q3();
            } else {
                qErro();
            }
        }
    }
    public void q4(){
        if(cont < fita.length){
            if(fita[cont] == 'B'){
                fita[cont] = 'B';
                cont ++;
                q4();
            } else if(fita[cont] == 'C'){
                fita[cont] = 'C';
                cont ++;
                q5();
            } else{
                qErro();
            }  
        }
    }
    public void q5(){
        if(cont < fita.length){
            if(fita[cont] == 'C'){
                fita[cont] = 'C';
                cont ++;
                q5();
            } 
            else if(fita[cont] == ' ' ){
                fita[cont] = ' ';
                cont ++;
                q6();
            } else {
                qErro();
            }
            
        }
    }
    public void q6(){
        System.out.println("Palavra aceita!");
    }
    public void qErro(){
        System.out.println("Erro!");
    }
}
