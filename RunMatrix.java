import java.util.Scanner;

public class RunMatrix {
  public static void main(String[] args) {
    //this part of the code only handles taking in the input from the user, As well as printing out everything user needs to see
    Matrix matrixes = new Matrix();
    Scanner scan = new Scanner(System.in);
    int size;
    System.out.print("Please enter the size of your matrix: ");
    size = scan.nextInt();
    int Xsize=size;
    int Ysize=size;
    System.out.println();
    System.out.print("Your matrix is "+ size);
    System.out.println(" x "+size);
    System.out.println("");
    System.out.print("Printing matrix with default values:");
    System.out.println("");
    matrixes.emptyMatrix(Xsize,Ysize);
    System.out.println("");
    System.out.print("Populating matrix. . .matrix populated");
    System.out.println("");
    System.out.println("");
    System.out.print("printing matrix: ");
    System.out.println("");
    matrixes.filledMatrix(Xsize, Ysize);
    System.out.println("");
    System.out.println("Flipping matrix. . .matrix flipped");
    System.out.println("");
    System.out.print("Printing flipping matrix: ");
    System.out.println("");
    matrixes.flippedMatrix(Xsize, Ysize);
    scan.close();
  }
}
