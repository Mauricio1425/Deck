import java.util.*; //Importamos la clase java.util.* de la libreria de java.util

public class Deck {// Definimos la clase Deck
    public static void main(String[] args){
        // Crear una instancia de Card para obtener los valores posibles
        Card card = new Card();
        int PALOS = card.palo.length;
        int VALORES = card.valor.length;
        int COLORES = card.color.length;
        int N = PALOS * VALORES * COLORES; // Cantidad total de cartas

// Crear el mazo de cartas
        ArrayList<String> deck = new ArrayList<String>();
        for (int i = 0; i < VALORES; i++) {
            for (int j = 0; j < PALOS; j++) {
                // Agregar la carta de color rojo
                deck.add(card.palo[j]+ ", Rojo , " + card.valor[i]);
                // Agregar la carta de color negro
                deck.add(card.palo[j]+ ", Negro , " + card.valor[i]);
            }
        }
        // Imprimir todas las cartas del mazo
        Iterator<String> nombreIterator = deck.iterator();
        while(nombreIterator.hasNext()){
            String elemento = nombreIterator.next();
            System.out.print(elemento + " ");
        }
        // Mezclar las cartas del mazo y mostrar el nuevo orden
        suflle(deck);

        // Mostrar la primera carta del mazo y eliminarla
        head(deck);

        // Seleccionar una carta al azar, mostrarla y eliminarla del mazo
        pick(deck);

        // Obtener una mano de cinco cartas del mazo, mostrarlas y eliminarlas del mazo
        hand(deck);
    }

    public static void suflle(ArrayList deck){
        // Crear una copia del mazo original para mezclar
        ArrayList<String> values = deck;
        // Mezclar las cartas aleatoriamente
        Collections.shuffle(values);
        System.out.println("\n Se mezcló el Deck.");
        // Imprimir todas las cartas del mazo mezclado
        Iterator<String> nombreIterator2 = deck.iterator();
        while(nombreIterator2.hasNext()){
            String elemento = nombreIterator2.next();
            System.out.print(elemento + " ");
        }
    }

    public static void head(ArrayList deck){
        // Mostrar la primera carta del mazo
        System.out.println(deck.get(0));
        // Eliminar la primera carta del mazo
        deck.remove(0);
        // Mostrar cuántas cartas quedan en el mazo
        System.out.println("Quedan " + deck.size() + " cartas");
    }

    public static void pick(ArrayList  deck){
        // Crear un objeto Random para seleccionar una carta al azar
        Random aleatorio = new Random();
        // Mostrar la carta seleccionada al azar
        System.out.println(deck.get(aleatorio.nextInt(deck.size())));
        // Eliminar la carta seleccionada del mazo
        deck.remove(aleatorio.nextInt(deck.size()));
        // Mostrar cuántas cartas quedan en el mazo
        System.out.println("Quedan " + deck.size() + " cartas");
    }

    public static void hand(ArrayList deck){
        //Mostrar una mano de cinco cartas del mazo
        for(int i=0; i<=4; i++){
            System.out.println(deck.get(i));
        }
        //Eliminar las cartas del mazo
        for(int i=0; i<=4; i++){
            deck.remove(i);
        }
        //Mostrar cuantas cartas quedan en el mazo
        System.out.println("Quedan " + deck.size()+ " cartas");
    }


}