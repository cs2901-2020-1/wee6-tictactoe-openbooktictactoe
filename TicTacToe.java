//import java.util.Scanner;

public class TicTacToe{
  
  public char matriz;
  public int n; // tamaño de la matriz 

  public TicTacToe(int n){
    matriz = new char[n][n];
    this.n = n;


    // " " means empty
    // "X" means X
    // "O" menas O
    
    
    for (int i = 0;i < n; i++){
      for (int j = 0; j < n ; j++){
          matriz[i][j] = ' ';
      }
    }



  }

  public void getUserData(int id){
    // 1 -> jugador 1 
    // 2 -> jugador 2
    
    
    //recoje las coordenadas que ingresa el usuario
    Sys
    Scanner input = new Scanner(System.in);
    
    

    
  }
  
  public void marcar(int x, int y, int id_player){
    if (id_player == 1){
      if (x <= n && x > 0 && y <= n && x > 0 ){
        matriz[x][y] = 'X';
      } else {
        System.out.println("Please. Verify your values");
        getUserData(1); //get data again 
      }
    } else if (id_player == 2){
      if (x <= n && x > 0 && y <= n && x > 0 ){
        matriz[x][y] = 'O';
      } else {
        System.out.println("Please. Verify your values");
        getUserData(2); // get data again
      }
    }
    
  }


  public void mostrar(){
    for(int i = 0;i<=4;i++){
      for(int j = 0;j<=4;j++){
        if(i%2!=0||i%2!=0){
          System.out.printl("-");
        }
        if(j%2!=0||j!=0){
          System.out.printl("|");  
        }
        else{
          System.out.printl(matriz[i/2][j/2]);
        }
      }
      System.out.println();
    }
  }

  public bool endgame(){
    return true;
  }


}













  
  



  