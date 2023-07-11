public class Sample {
  public static void main(String[] args) {
    String[][] ary = { { "a","b", "c" }, { "d", "e", "f" }};
    for (int x = 0; x < ary.length; x++) {
      for(int y = 0; y < ary[x].length; y++) {
        System.out.print(ary[x][y] + " ");
      }
    }
  }
}