class Sphere { // Class declaration
    private float radius; // Fields
    public Sphere(float startRadius) {
    // Constructor
    radius = startRadius;
    }
    public float getRadius() { // Methods
        return radius;
    }
    public float volume(){
        return (float)((float)4/3 * Math.pow(radius,3) * Math.PI);
    }
    public float heightContactPoint(Sphere secoundSphere){
        return 2*radius*secoundSphere.radius/(radius+secoundSphere.radius);
    }
    
} // End of class declaration

public class TestSphere{
    
    public static void main (String[] args){
        Sphere sphere1 = new Sphere(3f);
        Sphere sphere2 = new Sphere(3f);
        Sphere sphere3 = new Sphere(5f);
        System.out.println("the height of the contacting point for of sphere1 and sphere2: " + sphere1.heightContactPoint(sphere2));
        System.out.println("the height of the contacting point for of sphere1 and sphere3: " + sphere1.heightContactPoint(sphere3));
        System.out.println("the height of the contacting point for of sphere2 and sphere3: " + sphere2.heightContactPoint(sphere3));
        System.out.println("the volume of sphere1: " + sphere1.volume());
        System.out.println("the volume of sphere2: " + sphere2.volume());
        System.out.println("the volume of sphere3: " + sphere3.volume());
    }
}