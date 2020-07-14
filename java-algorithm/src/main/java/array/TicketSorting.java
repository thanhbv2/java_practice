package array;

public class TicketSorting {

  public static void print(int[] input, int n) {
    for (int i = 0; i < n; i++) {
      System.out.println(input[i]);
    }
  }

  public static int[] sort(int[] input1, int[] input2) {
    int m = input1.length;
    int n = input2.length;
    int i;
    int index1 = 0;
    int index2 = 0;
    int[] result = new int[m + n];

    for (i = 0; i < m + n; i++) {
      if (m < n) {
        if (index1 < m) {
          if (input1[index1] < input2[index2]) {
            result[i] = input1[index1];
            index1++;
          } else {
            result[i] = input2[index2];
            index2++;
          }
        } else {
          if(index2 < n){
            result[i] = input2[index2];
            index2++;
          }
        }

      }
    }

    return result;
  }

  public static void main(String[] args) {
    int[] input1 = {1, 2, 3, 6, 8, 12};
    int[] input2 = {1, 4, 5, 6, 9, 15, 19};
    int[] result = sort(input1, input2);
    print(result, 13);
  }


}
