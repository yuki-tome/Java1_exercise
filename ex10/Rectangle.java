public class Rectangle extends Point implements Shape{
    private int w;
    private int h;

    public Rectangle(int w, int h) {
       super(w,h);
       this.w = w;
       this.h = h;
   }

   public double getArea() {
       return w * h;
   }
}