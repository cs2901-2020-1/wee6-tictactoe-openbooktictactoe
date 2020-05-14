import TicTacToe.TicTacToe;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    System.out.println("Ingrese el tamaño del tablero");
    String tam = input.next();

    TicTacToe juego = new TicTacToe(Integer.parseInt(tam));

    int i = 0;
    while( true){
      juego.mostrar();
      juego.getUserData(i%2 +1);
      i++;
    }

    


  }
}