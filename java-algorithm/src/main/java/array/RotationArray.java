package array;

public class RotationArray {

  public static void print(int[] input){
    for (int i = 0; i < input.length; i++) {
      System.out.println(input[i]);
    }
  }

  /**
   * \
   * @param input
   * @param d number element rotate
   * @param n size array
   * @return
   */

  public static int[] rotate(int[] input, int d, int n) {
    for (int i = 0; i < d; i++) {
      letfRotate(input, n);
    }
    return input;
  }

  private static void letfRotate(int[] input, int n) {
    int temp = input[0];
    int i;
    for (i = 0; i < n - 1; i++) {
      input[i] = input[i + 1];
    }
    input[i] = temp;
  }

  public static void main(String[] args) {
    int[] test = {1, 3, 4, 5, 6, 9, 11};
    int[] input = rotate(test, 2, 7);
    print(input);
  }

}
