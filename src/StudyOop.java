//Polymorphism (Tính đa hình)

class Animal {
    public void sound() {
        System.out.println("The sound that ");
    }
    public void intro() {
        System.out.println("This is an animal!");
    }
    //Overloading
    //Cùng 1 tên hàm nhưng truyền các kiểu biến khác nhau cho ra các kết quả khác nhau
    public void intro(int n) {
        System.out.println("There are " + n + " dogs!");
    }
    public void intro(String s) {
        System.out.println("There are " + s + " cats!");
    }
}

//Tạo class con
class Dog extends Animal {//Inheritance(Tính thừa kế)
    //Cho phép chia sẻ dữ liệu và phương thức cho các class con
    public void sound() {
        System.out.println("dogs make is Woof Woof");
    }
    //Overriding (Ghi đè phương thức)
    //Việc kế thừa class cha giúp ta có thể thay đổi kết quả trả về của hàm của class con
    public void intro() {
        System.out.println("This is a dog!");
    }
}

class Cat extends Animal {
    public void sound() {
        System.out.println("cats make is Meow Meow");
    }
}

//Tạo class abstract
abstract class Human {//Abstraction (Tính trừu tượng)
    //Hàm abstract -> Không có thân
    //Nên sử dụng abstract khi muốn chia sẻ code giữa một vài class có liên hệ thân thiết
    public abstract void work();
    //Hàm bình thường
    public void sleep() {
        System.out.println("ZzZ");
    }
}

//class kế thừa
class Teacher extends Human {
    //Thân hàm abstract chỉ được định nghĩa cụ thể trong class kế thừa
    public void work() {
        System.out.println("Teaching");
    }
}

class Children extends Human {
    //Thân hàm abstract nhận các kết quả khác nhau tùy vào cách sử dụng
    public void work() {
        for (int i = 0; i <= 4; i++) {
            System.out.println("The child is counting " + i + "\n");
        }
    }
}

class Student {//Encapsulation (Tính đóng gói)
    private String name;
    private String idNum;
    private int age;
    //Việc khai báo private khiến user không có quyền truy cập vào biến
    //Được sử dụng khi cần giấu dữ liệu
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public String getIdNum() {
        return idNum;
    }
    //Chỉ có thể truy cập dữ liệu gián tiếp qua các hàm
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
