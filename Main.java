public class Main {
  public static void main(String[] args) {
    String name = "Jay";
    char a = 'a';
    boolean maybe = false;
    byte small = 123;
    double big = 1.283123123123123;
    int numb = 123123123;
    float wave = 1.2312312312312f;
    short tall = 32000;
    long meh = 7284818283823L;

    System.out.println("Your name is "+ name);
    System.out.println("This is a single character "+a);
    System.out.println("This is a boolean "+ maybe);
    System.out.println("Small number that is byte "+small);
    System.out.println("This is a double "+big);
    System.out.println("This is a integer "+numb);
    System.out.println("This is a float "+wave);
    System.out.println("This is a short "+tall);
    System.out.println("This is a long "+meh);

    long multiplyThat = small *= wave;
    System.out.println("Multiplied = "+multiplyThat);

  }
}
