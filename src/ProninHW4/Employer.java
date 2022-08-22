package ProninHW4;

public class Employer {

    private String fio;
    private String position;
    private String email;
    private int phone;
    private int age;
    private int salary;

    public Employer(String fio, String position, String email, int phone, int age, int salary) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.age = age;
        this.salary = salary;
    }

    public void getEmployerInfoTable() {
        System.out.println("Name:\n" + this.fio + "\nPosition:\n" + this.position + "\nE-mail:\n" + this.email +
                "\nPhone Number:\n" + this.phone + "\nAge:\n" + this.age + "\nSalary:\n" + this.salary);
    }

    public void getEmployerInfoLine() {
        System.out.println("Name: " + this.fio + "," + " Position: " + this.position + "," + " E-mail: " + this.email
                + "," + " Phone Number: " + this.phone + "," +" Age: " + this.age + "," + "  Salary: " + this.salary);
    }

    public int getEmployerAge() {
        return this.age;
    }
}
