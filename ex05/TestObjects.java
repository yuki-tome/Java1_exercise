class Rectangle{
    float height;
    float length;
    public Rectangle(float startheight,float startlength){
        height = startheight;
        length = startlength;
    }
    public float Perimeter(){
        return (height+length)*2;
    }
}
class Box{
    float height;
    float length;
    float width;
    public Box(float startheight,float startlength,float startwidth){
        height = startheight;
        length = startlength;
        width = startwidth;
    }
    public float Perimeter(){
        return (height+length+width)*4;
    }
   
}
public class TestObjects{
    public static void main(String [] args){
        Rectangle rectangle = new Rectangle(3,5);
        Box box = new Box(4,5,2);
        System.out.println("Rectangle: the length: " + rectangle.length + " the height: " + rectangle.height + " the perimeter: " + rectangle.Perimeter());
        System.out.println("Box: the length : " + box.length + " the height: " + box.height + " the width: " + box.width + " the perimeter: " + box.Perimeter());
    }

}