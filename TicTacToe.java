package TicTacToe;

import java.util.Scanner;

public class TicTacToe{
  
  public char matriz[][];
  public int n; // tamaño de la matriz 

  public TicTacToe(int n){
    matriz = new  char[n][n];
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
    System.out.println("Player " + id);
    System.out.println("Ingrese coordenada X");
    Scanner input = new Scanner(System.in);
    String x = input.next();
    System.out.println("Ingrese coordenada Y");
    String y = input.next();
    
    
    
    //recoje las coordenadas que ingresa el usuario
    marcar(Integer.parseInt(x),Integer.parseInt(y),id);
    

    
  }
  
  public void marcar(int x, int y, int id_player){
    if (id_player == 1){
      if (x <= n && x > 0 && y <= n && x > 0 ){
        matriz[x-1][y-1] = 'X';
      } else {
        System.out.println("Please. Verify your values");
        getUserData(1); //get data again 
      }
    } else if (id_player == 2){
      if (x <= n && x > 0 && y <= n && x > 0 ){
        matriz[x-1][y-1] = 'O';
      } else {
        System.out.println("Please. Verify your values");
        getUserData(2); // get data again
      }
    }
    
  }


  public void mostrar(){
    for(int i = 0;i<=2*n-2;i++){
      for(int j = 0;j<=2*n-2;j++){
        if(i%2!=0 && j%2==0){
          System.out.print("-");
        }
        if(j%2!=0){
          System.out.print("|");  
        }
        if(i%2==0 && j%2==0){
          System.out.print(matriz[i/2][j/2]);
        }
      }
      System.out.println();
    }
  }

  /*public boolean WIN(){
    if(matriz[0] == )
    return true;
  }*/
}













  
  



  