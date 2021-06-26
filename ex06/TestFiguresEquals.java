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
    float area;
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
        return area = (float)(radius*radius*Math.PI);
    }
    public boolean equals(Object obj) {
		if (obj == null)
			return false;
		else if (super.equals(obj)) {
			return true;
		} 
		else if (getClass() == obj.getClass()){
			Circle oa = (Circle)obj;
			return Math.abs(oa.area()-area)<=0.000001f ;
		} 
		else return false;
	}
}
class  Rectangle extends Shape{
    float side1;
    float side2;
    float area;
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
        return area = side1*side2;
    }
    public boolean equals(Object obj) {
		if (obj == null)
			return false;
		else if (super.equals(obj)) {
			return true;
		} 
		else if (getClass() == obj.getClass()){
			Rectangle oa = (Rectangle)obj;
			return Math.abs(oa.area()-area)<=0.000001f ;
		} 
		else return false;
	}
}
class Square extends Rectangle{
    float area;
    Square(String name,float side){
        super(name,side,side);
    }
    public String toString() {
        return getClass().getName() + " "  + super.getName()+ " side:" + side1 +" perimeter:" + perimeter() + " area:" + area();
    }
    public boolean equals(Object obj) {
		if (obj == null)
			return false;
		else if (super.equals(obj)) {
			return true;
		} 
		else if (getClass() == obj.getClass()){
			Square oa = (Square)obj;
			return Math.abs(oa.area()-area)<=0.000001f ;
		} 
		else return false;
	}
}
class Parallelogram extends Rectangle{
    float diagonal;
    float cos;
    float area;
    Parallelogram(String name,float side1,float side2,float diagonal){
        super(name,side1,side2);
        this.diagonal =diagonal;
    }
    public float area(){
        cos = (side1*side1+side2*side2-diagonal*diagonal)/(2*side1*side2);
        return area = (float)(side1*side2*Math.sqrt(1-cos*cos));
    }
    public String toString() {
        return getClass().getName() + " "  + super.getName()+ " length:" + side1 + " width:" + side2 +" diagonal:" + diagonal + " perimeter:" + perimeter() + " area:" + area();
    }
    public boolean equals(Object obj) {
		if (obj == null)
			return false;
		else if (super.equals(obj)) {
			return true;
		} 
		else if (getClass() == obj.getClass()){
			Parallelogram oa = (Parallelogram)obj;
			return Math.abs(oa.area()-area)<=0.000001f ;
		} 
		else return false;
	}
}
class Rhombus extends Square{
    float diagonal;
    float area;
    Rhombus(String name,float side,float diagonal){
        super(name,side);
        this.diagonal = diagonal;
    }
    public float area(){
        return area = (float)(Math.pow(side1,2)*Math.sqrt(1-Math.pow(((2*(side1*side1)-diagonal*diagonal)/(2*side1*side1)),2)));
    }
    public String toString() {
        return getClass().getName() + " "  + super.getName()+ " side:" + side1 + " diagonal:" + diagonal +" perimeter:" + perimeter() + " area:" + area();
    }
    public boolean equals(Object obj) {
		if (obj == null)
			return false;
		else if (super.equals(obj)) {
			return true;
		} 
		else if (getClass() == obj.getClass()){
			Rhombus oa = (Rhombus)obj;
			return Math.abs(oa.area()-area)<=0.000001f ;
		} 
		else return false;
	}
}
public class TestFiguresEquals {
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
        if(circle.equals(rectangle))System.out.println("equal to each other");
		else System.out.println("not equal to each other");
		if(rectangle.equals(square))System.out.println("equal to each other");
        else System.out.println("not equal to each other");
        if(square.equals(para))System.out.println("equal to each other");
        else System.out.println("not equal to each other");
        if(para.equals(rhombus))System.out.println("equal to each other");
        else System.out.println("not equal to each other");
        if(rhombus.equals(circle))System.out.println("equal to each other");
        else System.out.println("not equal to each other");
        
		
    }
}