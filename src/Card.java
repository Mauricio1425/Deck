import java.util.ArrayList;//Importamos la clase ArrayList de la libreria de java.util

public class Card {// Definimos la clase Card
    // Declaramos un ArrayList llamado "deck" para almacenar las cartas de poker
    ArrayList<String> deck = new ArrayList<String>();
    // Definimos un arreglo de String llamado "palo" para almacenar los palos de la baraja de poker
    String[] palo = {
            "Treboles", "Corazones", "Picas", "Diamantes"
    };
    // Definimos un arreglo de String llamado "color" para almacenar los colores de las cartas de poker
    String[] color = {
            "Negro", "Rojo"
    };
    // Definimos un arreglo de String llamado "valor" para almacenar los valores de las cartas de poker
    String[] valor = {
            "2", "3", "4", "5", "6", "7", "8", "9", "10", "A", "J", "Q", "K"
    };
}