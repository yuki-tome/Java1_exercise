public class TestShape{
    public static void main(String[] args) {
      double sum = 0;
  
      Shape shape[] = { 
        new Point(1,4),new Point(1,1),new Point(2,6),
        new Circle(3),new Circle(1),new Circle(5),new Circle(7),
        new Rectangle(3,3),new Rectangle(3,5),new Rectangle(1,1),new Rectangle(5,7),new Rectangle(8,7)
      };
  
      for (int i = 0; i < shape.length; i++) {
        sum += shape[i].getArea();
    }
    System.out.println("the sum of area values of the figure objects: "+ sum);
    }
  }