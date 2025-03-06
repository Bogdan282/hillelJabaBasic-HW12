public class Employee {
    private String name;
    private String email;
    private String phone;
    private String position;
    private int age;

    public Employee(String email, String name, String phone, String position, int age) {
        this.email = email;
        this.name = name;
        this.phone = phone;
        this.position = position;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Співробітник {" +
                "Ім'я= '" + name + '\'' +
                ", пошта='" + email + '\'' +
                ", телефон='" + phone + '\'' +
                ", посада='" + position + '\'' +
                ", вік=" + age +
                '}';
    }
}
