public class ExampleException {

  public static int rectangleArea(int a, int b) {
    // TODO put your code here
    int area;
    if (a >= 0 && b >= 0) {
      area = a * b;
    } else {
      throw new IllegalArgumentException("input value is below zero!");
    }
    return area;
  }
}


