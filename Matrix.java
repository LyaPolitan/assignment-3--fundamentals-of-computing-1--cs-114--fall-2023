public class Matrix {
  public void emptyMatrix(int Xsize,int Ysize){
    int[][] table = new int[Ysize][Xsize];
    for (int row = 0; row < table.length; row++) {
      for (int col = 0; col < table[row].length; col++) {
      }
    }
    for (int row = 0; row < table.length; row++) {
      for (int col = 0; col < table[row].length; col++) {
        System.out.print (table[row][col] + "\t");
    }
    System.out.println();
    }
  }
  public void filledMatrix(int Xsize,int Ysize){
    int[][] table = new int[Ysize][Xsize];
    for (int row = 0; row < table.length; row++) {
      for (int col = 0; col < table[row].length; col++) {
        table[row][col] = row + col;
    }
  }
    for (int row = 0; row < table.length; row++) {
      for (int col = 0; col < table[row].length; col++) {
        System.out.print (table[row][col] + "\t");
    }
    System.out.println();
    }
  }
}
