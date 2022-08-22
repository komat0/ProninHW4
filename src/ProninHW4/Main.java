package ProninHW4;

/**
 * 1. Create a class "Employee" with fields: full name, position, email, phone, salary, age.
 * 2. The class constructor must fill in these fields when creating the object.
 * 3. Inside the "Employee" class, write a method that displays information about the object to the console.
 * 4. Create an array of 5 employees.
 * 5. With the help of a loop, display information only about employees older than 40 years
 */
public class Main {

    public static void main(String[] args) {

        Employer[] persArray = new Employer[5];

        persArray[0] = new Employer("Ivanov Ivan Ivanovich", "administrator", "iii@work.com", 1111, 24, 1200);
        persArray[1] = new Employer("Petrov Petr Petrovich", "secretary", "ppp@work.com", 2222, 21, 800);
        persArray[2] = new Employer("Sidorova Anna Vasilyevna", "account", "sav@work.com", 3333, 44, 2000);
        persArray[3] = new Employer("Dori Valeria Nikolaevna", "boss", "dvn@work.com", 4444, 50, 9999);
        persArray[4] = new Employer("Goncharov Ilia Vasilii", "manager", "giv@work.com", 5555, 39, 4000);

        for (Employer employer : persArray) {
            if (employer.getEmployerAge() > 40) {
                employer.getEmployerInfoLine();
            }
        }
//        persArray[0].getEmployerInfoTable();
//        persArray[3].getEmployerInfoLine();
    }
}