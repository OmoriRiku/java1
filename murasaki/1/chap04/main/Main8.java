public class Main8 {
  public static void main(String[] args) {
    for(int i = 0; ; i++) {
      if(i == 3) {
        break;
      }
      System.out.println("i = " + i);
    }
    System.out.println("for文の後ろの処理");
  }
}