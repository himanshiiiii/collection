import java.util.*;
class Employee {
    Double age;
    Double salary;
    String name;

    Employee(Double age, Double salary,String name) {

        this.age=age;
        this.salary=salary;
        this.name=name;
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
    public Double getSalary() {
        return salary;
    }
    public void setSalary(Double salary) {
        this.salary = salary;
    }
    public String toString(){
        return "Name: "+this.name+"-- Salary: "+this.salary+"--age: "+this.age;
    }
}
    public class Question4 {
        public static void main(String[] args) {
            List<Employee> l = new ArrayList<Employee>();
            l.add(new Employee(20.0, 50000.0, "himanshi"));
            l.add(new Employee(30.0, 2000.0, "abc"));
            l.add(new Employee(45.0, 2200.0, "him"));


            Collections.sort(l,new Comp());
            System.out.println("Sorted list entries: ");
            for(Employee e:l){
                System.out.println(e);
            }
        }
    }

            class Comp implements Comparator<Employee>{

                @Override
                public int compare(Employee e1, Employee e2) {
                    if(e1.getSalary() < e2.getSalary()){
                        return 1;
                    } else
                        return -1;
                    }
                }

