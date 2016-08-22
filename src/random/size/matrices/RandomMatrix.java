package random.size.matrices;

public class RandomMatrix {

  public int[][] create(int row, int column, int max) {
    int[][] matrix = new int[row][column];
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < column; j++) {
        double rd = Math.random() * (max + 1);
        matrix[i][j] = (int) rd;
      }
    }
    return matrix;
  }

  public void display(int[][] matrix) {
    int row = matrix.length;
    int column = matrix[0].length;

    for (int i = 0; i < row; i++) {
      System.out.print(String.format("%-15s", "row " + (i + 1) + ": "));
      for (int j = 0; j < column; j++) {
        System.out.print(String.format("%d\t", matrix[i][j]) + " ");
      }
      System.out.println();
    }
  }

  public void count(int[][] matrix) {
    int row = matrix.length;
    int column = matrix[0].length;

    System.out.print(String.format("%-15s", "sum "));

    for (int i = 0; i < column; i++) {
      int rowSum = 0;
      for (int j = 0; j < row; j++) {
        rowSum += matrix[j][i];
      }
      System.out.print(String.format("%d\t", rowSum) + " ");
    }
    System.out.println();
    for (int i = 0; i < row; i++) {
      int colSum = 0;
      for (int j = 0; j < column; j++) {
        colSum += matrix[i][j];
      }
      System.out.print(String.format("%-15d", colSum) + " ");
      for (int j = 0; j < column; j++) {
        System.out.print(String.format("%d\t", matrix[i][j]) + " ");
      }
      System.out.println();
    }

  }

  public static void main(String[] args) {
    RandomMatrix matrix = new RandomMatrix();
    matrix.display(matrix.create(10, 5, 5));
    System.out.println("\n\n");
    matrix.count(matrix.create(10, 5, 5));
  }

}
