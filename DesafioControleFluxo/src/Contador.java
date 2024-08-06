import java.util.*;

/**
 * @author Ricardo Barbosa dos Santos
 * @version 0.1
 */
public class Contador {
    public static void main(String[] args) //throws Exception
    {
        int parametro1;
        int parametro2;
        
        Scanner scan = new Scanner(System.in).useLocale(Locale.US) ;

        System.out.println("Digite o primeiro parâmetro");
        parametro1 = scan.nextInt();

        System.out.println("Digite o segundo parâmetro");
        parametro2 = scan.nextInt();

        scan.close();
        
        try {
            contar (parametro1, parametro2);
        } catch (ParametrosInvalidosException e) {
            System.out.println("Erro de exceção: O parametro1 é maior que o parametro");
            //e.printStackTrace();
        }
    }

    static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException{
        if(parametro1 > parametro2)
            throw new ParametrosInvalidosException();
        System.out.println("Impressão sequência do primeiro parâmetro");
        for(int i=1; i <= parametro1; i++)
        {
            System.out.println("Imprimindo o número " + i);
        }
        System.out.println("Impressão sequência do segundo parâmetro");
        for(int i=1; i <= parametro2; i++)
        {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
