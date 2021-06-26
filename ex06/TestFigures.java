class Shape {
    private String name;
    public Shape(String name) {
      this.name = name;
    }
    public Shape() {
      name = "no name";
    }
    public String getName() {
      return name;
    }
    public String toString() {
      return getClass().getName() + " " + name;
    }
}
class  Circle extends Shape{
    float radius;
    Circle(String name,float radius){
        super(name);
        this.radius = radius;
    }
    public String toString() {
        return getClass().getName() + " " + super.getName()+ " radius:" + radius + " perimeter:" + perimeter() + " area:" + area();
    }
    public float perimeter(){
        return (float)(2*radius*Math.PI); 
    }
    public float area(){
        return (float)(radius*radius*Math.PI);
    }
    public boolean equals(final Object obj) { return obj == this;
    }
}
class  Rectangle extends Shape{
    float side1;
    float side2;
    Rectangle(String name,float side1,float side2){
        super(name);
        this.side1 = side1;
        this.side2 = side2;
    }
    public String toString() {
        return getClass().getName() + " " + super.getName() + " length:" + side1 + " width:" + side2 +" perimeter:" + perimeter() + " area:" + area();
    }
    public float perimeter(){
        return 2*(side1+side2); 
    }
    public float area(){
        return side1*side2;
    }
    public boolean equals(final Object obj) { return obj == this;
    }
}
class Square extends Rectangle{
    Square(String name,float side){
        super(name,side,side);
    }
    public String toString() {
        return getClass().getName() + " "  + super.getName()+ " side:" + side1 +" perimeter:" + perimeter() + " area:" + area();
    }
    public boolean equals(final Object obj) { return obj == this;
    }
}
class Parallelogram extends Rectangle{
    float diagonal;
    float cos;
    Parallelogram(String name,float side1,float side2,float diagonal){
        super(name,side1,side2);
        this.diagonal =diagonal;
    }
    public float area(){
        cos = (side1*side1+side2*side2-diagonal*diagonal)/(2*side1*side2);
        return (float)(side1*side2*Math.sqrt(1-cos*cos));
    }
    public String toString() {
        return getClass().getName() + " "  + super.getName()+ " length:" + side1 + " width:" + side2 +" diagonal:" + diagonal + " perimeter:" + perimeter() + " area:" + area();
    }
    public boolean equals(final Object obj) { return obj == this;
    }
}
class Rhombus extends Square{
    float diagonal;
    Rhombus(String name,float side,float diagonal){
        super(name,side);
        this.diagonal = diagonal;
    }
    public float area(){
        return (float)(Math.pow(side1,2)*Math.sqrt(1-Math.pow(((2*(side1*side1)-diagonal*diagonal)/(2*side1*side1)),2)));
    }
    public String toString() {
        return getClass().getName() + " "  + super.getName()+ " side:" + side1 + " diagonal:" + diagonal +" perimeter:" + perimeter() + " area:" + area();
    }
    public boolean equals(final Object obj) { return obj == this;
    }
}
public class TestFigures {
    public static void main(String [] args){
        Circle circle = new Circle("circle",3);
        Rectangle rectangle = new Rectangle("rectangle",2,4);
        Square square = new Square("square",4);
        Parallelogram para = new Parallelogram("para",3,4,5);
        Rhombus rhombus = new Rhombus("rhombus",5,6); 
        System.out.println(circle.toString());
        System.out.println(rectangle.toString());
        System.out.println(square.toString());
        System.out.println(para.toString());
        System.out.println(rhombus.toString());
    }
}