public class TestRelatable {
     public static void main(String[] args) {
         MyRectangle r[] = {new MyRectangle(15, 24),new MyRectangle(30, 60)};
         MyRectangle max = r[0];
         for(int i = 1; i < r.length; i++){
             switch (r[i].isLargerThan(max)) {
             case 1:
             max = r[i];
             break;
             default:
             break;
         }
         System.out.println("The largest perimeter is "+ max.getPerimeter());
     }
 }
}