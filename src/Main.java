

class Person {
     private String name;
     private String lastName;
     private int age;
     private String sex;


     public Person(String name, String lastName, int age, String sex) {
         this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.sex= sex;



    }
   public void introduce() {
        System.out.println("Mam na ime" + name + lastName + "mam" + age + "jestem" + sex);
    }
    public void changeAge(int newAge) {
         this.age = newAge;

    }
    public String getName() {
         return name;
    }
    public String getLastName() {
         return lastName;
    }
    public int getAge() {
         return age;
    }
    public String getSex(){
         return sex;
    }
    public void setName(String newName) {
         this.name = newName;
    }
    public void setLastName(String newLastName) {
         this.lastName = newLastName;
    }
    public void setAge(int newAge) {
         this.age = newAge;
    }
    public void setSex(String newSex){
        this.sex= newSex;
    }

 }
class Employee extends Person{
    String position;
    String award;
    boolean status;
    int id;
    public Employee(String name , String lastName, int age , String sex, String position, String award, int id) {
        super(name, lastName, age, sex);
        this.position = position;
        this.award = award;
        this.status = true;
        this.id = id;

    }
        public String getPosition() {
            return position;
        }
        public String getAward() {
        return award;
        }
        public boolean getStatus() {
        return status;
        }
        public int getId() {
        return id;
        }
    }

public class Main {
    public static void main(String[] args) {
      Employee employee = new Employee("Szymon","kaplon",25,"meska", "pracownik", "duze", 65);
       employee.introduce();
        }
    }
