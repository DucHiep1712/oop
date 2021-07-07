//Polymorphism (Tính đa hình)

class Animal {
    public void sound() {
        System.out.println("The sound that ");
    }
    //Overloading
    public void intro() {
        System.out.println("This is an animal!");
    }
    public void intro(int n) {
        System.out.println("There are " + n + " dogs!");
    }
    public void intro(String s) {
        System.out.println("There are " + s + " cats!");
    }
}

abstract class Human {//Abstraction
    public abstract void work();
    public void sleep() {
        System.out.println("ZzZ");
    }
}

class Teacher extends Human {
    public void work() {
        System.out.println("Teaching");
    }
}

class Children extends Human {
    public void work() {
        for (int i = 0; i <= 4; i++) {
            System.out.println("The child is counting " + i + "\n");
        }
    }
}

class Student {//Encapsulation
    private String name;
    private String idNum;
    private int age;
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public String getIdNum() {
        return idNum;
    }
    public void setAge(int newAge) {
        age = newAge;
    }
    public void setName(String newName) {
        name = newName;
    }
    public void setIdNum( String newId) {
        idNum = newId;
    }
}

class Dog extends Animal {//Inheritance(Tính thừa kế)
    public void sound() {
        System.out.println("dogs make is Woof Woof");
    }
    //Overriding
    public void intro() {
        System.out.println("This is a dog!");
    }
}

class Cat extends Animal {
    public void sound() {
        System.out.println("cats make is Meow Meow");
    }
}

public class StudyOop {
    public static void main(String[] args) {
        Animal newAnimal = new Animal();
        Dog newDog = new Dog();
        Cat newCat = new Cat();
//        newAnimal.sound();
//        newDog.sound();
//        newAnimal.sound();
//        newCat.sound();
//        newAnimal.intro();
//        newDog.intro();
//        newAnimal.intro();
//        newAnimal.intro(5);
//        newAnimal.intro("three");
//        Student sv = new Student();
//        sv.setAge(18);
//        sv.setName("Nguyễn Đức Hiệp");
//        sv.setIdNum("20020275");
//        System.out.println(sv.getName() + "; " + sv.getIdNum() + "; " + sv.getAge());
        Teacher newTeacher = new Teacher();
        newTeacher.work();
        newTeacher.sleep();
        Children newChild = new Children();
        newChild.work();
        newChild.sleep();
    }
}
