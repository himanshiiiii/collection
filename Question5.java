import java.util.*;
class Student{
    String name;
    Double score;
    Double age;

    Student(  Double age,Double score, String name){
        this.name=name;
        this.age=age;
        this.score=score;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getAge() {
        return age;
    }
    public void setAge(Double age) {
        this.age = age;
    }
    public Double getScore() {
        return score;
    }
    public void setScore(Double score) {
        this.score = score;
    }
    public String toString(){
        return "Name: "+this.name+"-- Score: "+this.score+"--age: "+this.age;
    }
}



public class Question5{

    public static void main(String[] args) {
        List<Student> l = new ArrayList<Student>();
        l.add(new Student(20.0, 50000.0, "himanshi"));
        l.add(new Student(30.0, 50000.0, "abc"));
        l.add(new Student(45.0, 2200.0, "him"));


        Collections.sort(l, new Compare());
        System.out.println("Sorted list entries: ");

        for (Student s : l) {
            System.out.println(s);
        }
    }
}


class Compare implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {


        if (o1.getScore() == o2.getScore()) {
            return o1.name.compareToIgnoreCase(o2.name);
        } else if (o1.getScore() < o2.getScore()) {
            return 1;
        } else
            return -1;
    }
}