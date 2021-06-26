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
    //public String getID() { return id;}
    public String introduction() {
        return "I am a student. " + super.introduction() + " My ID is "+ id + "."; 
    }
}
class EnglishPerson extends Person {
    public EnglishPerson(String name){
        super(name);
    }
    public String introduction() {
        return "How do you do?" + super.introduction();
    }
}
class EnglishStudent extends Student{
    public EnglishStudent(String name,String id){
        super(name,id);
    }
    public String introduction(){
        return "How do you do? " + super.introduction();
    }
}
class JapanesePerson extends Person{
    public JapanesePerson(String name){
        super(name);
    }
    public String introduction(){
        return "Hajime mashite. " + super.introduction();    
    }
}
class JapaneseStudent extends Student{
    public JapaneseStudent(String name,String id){
        super(name,id);
    }
    public String introduction(){
        return "Hajime mashite. " + super.introduction();
    }
}
public class PeopleIntroduction { 
    public static void main(String[] args) {
        int i;
        Person[] p = new Person[6];
        p[0] = new Person("Hiro");
        p[1] = new Student("Saito","s115333");
        p[2] = new EnglishPerson("Peter");
        p[3] = new EnglishStudent("James","s1270000");
        p[4] = new JapanesePerson("Takeru");
        p[5] = new JapaneseStudent("Kaito","s1220000");
        for(i = 0; i < p.length; i++){
            System.out.println(p[i].introduction());
        }
    }
}
