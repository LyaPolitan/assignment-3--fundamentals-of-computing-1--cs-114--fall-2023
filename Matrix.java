public class Matrix {
//this class contains all the matrix equations

  public void emptyMatrix(int Xsize,int Ysize){
    //creates a empty array
    int[][] table = new int[Ysize][Xsize];
    for (int row = 0; row < table.length; row++) {
      for (int col = 0; col < table[row].length; col++) {
      }
    }
    //prints out an array of zeros
    for (int row = 0; row < table.length; row++) {
      for (int col = 0; col < table[row].length; col++) {
        System.out.print (table[row][col] + "\t");
    }
    System.out.println();
    }
  }



  public void filledMatrix(int Xsize,int Ysize){
    //Filling the matrix starting from zero to the (input x input)-1
    int[][] table = new int[Ysize][Xsize];
    for (int row = 0; row < table.length; row++) {
      for (int col = 0; col < table[row].length; col++) {
        table[row][col] = (row * Ysize) + col;
    }
  }
    //Printing out the matrix after filling with sumber sequentially
    for (int row = 0; row < table.length; row++) {
      for (int col = 0; col < table[row].length; col++) {
        System.out.print (table[row][col] + "\t");
    }
    System.out.println();
    }
  }



  public void flippedMatrix(int Xsize, int Ysize) {
    //creating a matrix and filling it with number sequentially
    int[][] table = new int[Ysize][Xsize];
    for (int row = 0; row < table.length; row++) {
      for (int col = 0; col < table[row].length; col++) {
        table[row][col] = (row * Ysize) + col;
      }
    }
    //Flipping values across the diagonal from bottom-left to top-right
    for (int row = 0; row < table.length; row++) {
      for (int col = 0; col < table[row].length; col++) {
        if (col < Ysize - row - 1) {
          int temp = table[row][col];
          table[row][col] = table[Ysize - col - 1][Xsize - row - 1];
          table[Ysize - col - 1][Xsize - row - 1] = temp;
        }
      }
    }
    //Displaying the modified matrix
    for (int row = 0; row < table.length; row++) {
      for (int col = 0; col < table[row].length; col++) {
          System.out.print(table[row][col] + "\t");
      }
      System.out.println();
    }
  }
}
