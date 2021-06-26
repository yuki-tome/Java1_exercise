class Person { 
    private String name;
    public Person(String name) { 
        this.name = name;
    }
    public String introduction() {
        return "My name is " + name + "."; 
    }
}
class Student extends Person {
    private String id;
    public Student(String name, String id){
        super(name);
        this.id = id;
    }
    public String getID() { return id;}
    public String introduction() {
        return "I am a student. " + super.introduction() + " My ID is "+ id + "."; 
    }
}
class EnglishPerson extends Person {
    public EngulishPerson(String name){
        super(name);
    }
    public String introduction() {
        return "How do you do?" + super.introduction();
    }
}
class EngulishStudent extends Student{
    public EnglishStudent(String name,String id){
        super(name,id);
    }
    public String getID() { return id;}
    public String introduction(){
        return "How do you do?" + super.introduction();
    }
}
class JapanesePerson extends Person{
    public JapanesePerson(String name){
        super(name);
    }
    public String introduction(){
        return "Hajime mashite." + super.introduction();    
    }
}
class JapaneseStudent extends Student{
    public JapaneseStudent(String name,String id){
        super(name,id);
    }
    public String getID() { return id;}
    public String introduction(){
        return "Hajime masite." + super.introduction();
    }
}
}
public class PolymorphismDemo1 { 
    public static void main(String[] args) {
        Student s = new Student("Saito","s115333");
        Person p = s;
         
        System.out.println(s.introduction()); 
        System.out.println(p.introduction());
    }
}
