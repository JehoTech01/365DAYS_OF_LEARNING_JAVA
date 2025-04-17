//Hello World!
public class HelloWorld {
  public static void main(String[] args) {
    String text = "Hello World!";

    for (int i = 0; i < text.length(); i++) {
      System.out.print(text.charAt(i));

      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }

    System.out.println();
  }
}