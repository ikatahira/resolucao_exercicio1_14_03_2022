import java.util.Scanner;
public class Resolucao1{

    public static void main(String[] args) {
        
        Scanner leitura=new Scanner(System.in);
        double x;

        System.out.println("Digite um número");
        x=leitura.nextDouble();

        while(x!=1){
        if(x%2==0){
            x=x/2.0;
        }
        else{
            x = 3 * x + 1;
        }

        System.out.print(x + "-> ");
    }}
}