public class DZ5 {
    public static void main(String[] args) {
        Employee[] empCorp = new Employee[5];
        empCorp[0] = new Employee("Брагин Егор", "Engineer", "Bragin@gmail.com", "89152191111",50000,41);
        empCorp[1] = new Employee("Тимофеев Альфред", "Creator", "Timofeev@gmail.com", "89152192222",50000,32);
        empCorp[2] = new Employee("Куликов Прохор", "Water pot", "Kulikov@gmail.com", "89152193333",10000,43);
        empCorp[3] = new Employee("Жданов Ибрагил", "EnvelopeLicker", "Zhdanov@gmail.com", "89152194444",5000,18);
        empCorp[4] = new Employee("Антонов Афанасий", "GrinderPencil", "Antonov@gmail.com", "89152195555",3000,21);
        for (Employee employee : empCorp)
            if (employee.getAge()>40)
                System.out.println(employee);

    }
}
class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return (name + "\n-"
                + position + "\n-"
                + email + "\n-"
                + phone + "\n-"
                + salary + "\n-"
                + age);
    }
}
