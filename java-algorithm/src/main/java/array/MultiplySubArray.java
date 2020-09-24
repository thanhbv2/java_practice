package array;

public class MultiplySubArray {

  public static int multiplySubArray(int[] input, int n) {
    int result = 1;

    for (int i = 0; i < n; i++) {
      int product = 1;
      for (int j = i; j < n; j++) {
        System.out.println("product :" + product + " el: "+ input[j]);
        product *= input[j];
        result *= product;
      }
    }
    return result;
  }

  public static void main(String[] args) {
    int[] test = { 2, 4};
    int result = multiplySubArray(test, test.length);
    System.out.println(result);
  }

}
