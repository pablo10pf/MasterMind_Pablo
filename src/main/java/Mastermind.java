import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mastermind {

    final static int LONGITUD_CODIGO = 4;
    final static int MAX_INTENTOS = 10;
    final static String DIGITOS = "rbygop";
    static char[] digitos_array;
    public static void main(String[] args) {
        Mastermind master = new Mastermind();
        /* Hacer el codigo secreto aleatorio*/
        String codigo = "rgoy";
        String entrada_user = "";
        char respuesta_user=0;
        boolean jugar_otra_vez=true;
        digitos_array=DIGITOS.toCharArray();
        int cont_muerto=0,cont_herido=0;
        int intentos=1;
        String solucion;
        BufferedReader Input = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();
        while(jugar_otra_vez) {

            while(intentos<=MAX_INTENTOS && cont_muerto!=LONGITUD_CODIGO) {
                cont_herido=0;
                cont_muerto=0;
                /*	pedir strig al usuario y comprobar errores del string*/
                do {
                    System.out.println("Introduce propuesta de solucion");
                    try {
                        entrada_user=Input.readLine();
                    } catch (IOException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }while(master.comprobar_entrada_user(entrada_user)==false);

                for (int i = 0; i < LONGITUD_CODIGO; i++) {
                    if(entrada_user.contains(String.valueOf(codigo.charAt(i)))) {
                        if(entrada_user.charAt(i)==(codigo.charAt(i))){
                            cont_muerto++;
                            System.out.println("negro");
                        }else {
                            cont_herido++;
                            System.out.println("blanca");
                        }
                    }
                }
                solucion="Intento: "+intentos +". Blancas= "+cont_herido+" y Negras= "+cont_muerto+"\n";
                builder.append(solucion);
                System.out.println(builder.toString());
                intentos++;
            }
            if(cont_muerto==LONGITUD_CODIGO) {
                System.out.println("Has ganado :)");
                cont_herido=0;
                cont_muerto=0;
                intentos=1;
                builder=new StringBuilder();
            }else {
                System.out.println("Has perdido :(");
            }

            jugar_otra_vez=master.volver_jugar();
        }
        System.out.println("Gracias por jugar a MasterMind. Hasta la proxima");
    }

    public  boolean comprobar_entrada_user(String entrada) {
        if(entrada.length()!=4) {
            System.out.println("Error. Introduce solo 4 digitos");
            return false;
        }
        else  if(!comprobar_letras_validas(entrada)) {
            System.out.println("Error. Introduce letras validas: r - b - y - g - o - p");
            return false;
        }
        else if(!comprobar_letras_repetidas(entrada)) {
            System.out.println("Error. Introduce letras no repetidas");
            return false;
        }
        else return true;
    }

    public  boolean comprobar_letras_validas(String entrada) {
        for (int i = 0; i <LONGITUD_CODIGO; i++) {
            if(!DIGITOS.contains(String.valueOf(entrada.charAt(i)))) {
                return false;
            }
        }
        return true;
    }

    public  boolean comprobar_letras_repetidas(String entrada) {
        for (int i = 0; i < entrada.length(); i++) {
            for (int j = 0; j < entrada.length(); j++) {
                if( i!=j && entrada.charAt(i)==entrada.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean volver_jugar() {
        BufferedReader Input = new BufferedReader(new InputStreamReader(System.in));
        char opcion = 0;
        do {
            String s = null;
            System.out.println("Quieres jugar otra vez??. Responde s/n");
            try {
                s = Input.readLine();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            opcion=s.trim().charAt(0);
            if(opcion !='n' && opcion !='s'){
                System.out.println("Error. Elija s/n");
            }
        } while ((opcion !='n') && (opcion !='s'));
        if(opcion=='n')
            return false;
        else return true;
    }
}