import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        List<String> listaIntegrantes = new ArrayList<>();

        //cuantos participantes
        System.out.println("Cuantos participantes hay en este juego del amigo invisible?");
        int num = entrada.nextInt();

        entrada.nextLine();

        //agregamos los participantes en al amigo invisible, con anterioridad se debe
        //saber la cantidad de participantes, algo que se pregunto con anterioridad.
        int i = 0;
        while (i < num){
            //introduce nombre.
            System.out.print("Ingrese nombre:");
            String nombre = entrada.nextLine();

            //agregamos a la lista
            listaIntegrantes.add(nombre);
            i++;
        }
        //System.out.println(listaIntegrantes);

        List<String[]> resultado = seleccionarAmigoInvisible(listaIntegrantes);

        for (String[] parejas: resultado){
            System.out.println(parejas[0]+" Regala a "+parejas[1]);
        }


    }

    private static List<String[]> seleccionarAmigoInvisible(List<String> amigosInvisibles){
        Scanner entrada = new Scanner(System.in);
        Random ran = new Random();
        List<String[]> regalarAAmigo = new ArrayList<>();


        while (!amigosInvisibles.isEmpty()){
            System.out.print("Indica tu nombre: ");
            String nombre = entrada.nextLine();

            //elegimos el amigo invisible al azar.
            int indiceAmigo = ran.nextInt(amigosInvisibles.size());

            String amigoInvisible = amigosInvisibles.get(indiceAmigo);
            regalarAAmigo.add(new String[]{nombre, amigoInvisible});

            amigosInvisibles.remove(indiceAmigo);
        }

        return regalarAAmigo;
    }
}