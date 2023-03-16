// Java 프로그래밍 - 상속

class Person {
    String name;
    int age;
    public int a1;
    private int a2;

    Person() {}
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("Person.printInfo");
        System.out.println("name: " + name);
        System.out.println("age: " + age);
    }
}

// Student 클래스 - Person 상속, 접근제어자 확인
class Student extends Person {
    Student() {
        a1 = 1;
//        a2 = 1; 접근제어자가 private
    }
}

// Student 클래스 - Person 상속, super 사용, 오버라이딩
class Student2 extends Person {
    String name;
    int stdId;

    Student2(String name, int age, int stdId) {
        this.name = name; // 자기 클래스에 name이 있기 때문에 본인 것을 사용
//        super.name = name; // 부모 객체의 name을 사용하려면 super
//        super(name, age); // 부모 클래스의 생성자 호출
        this.age = age; // Student2 클래스에 age가 없기 때문에 상속받은 클래스의 age
        this.stdId = stdId; // 자기 클래스에 name이 있기 때문에 본인 것을 사용
    }

    public  void printInfo() {
        System.out.println("Student2.printInfo");
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("stdId = " + stdId);
    }
}


public class Main {

    public static void main(String[] args) {

//      Test code
//      1. 상속
        System.out.println("=============");
        Student s1 = new Student();
        s1.name = "a";
        s1.age = 25;
        s1.printInfo();


//      2. super, super(), 오버라이딩
        System.out.println("=============");
        Student2 s2 = new Student2("b",32, 1);
        s2.printInfo();

    }
}
