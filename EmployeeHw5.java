/**
*Java1.Hw5
*
*@author Maryana Lapina
*@version 19/11/21
*/
class EmployeeHw5 {

    public static void main(String[] args) {
        Employee[] employees = {
        new Employee("Ivanov Ivan Georgievich", "Engineer", "iviv@0m.com", 888877, 647000, 34),
        new Employee("Demina Darya Dmitrievna", "HR", "DDD@m.com", 777077, 85000, 30),
        new Employee("Mexxer Brian ---", "Writer", "mexbri@m.com", 000000, 75000, 27),
        new Employee("Geller Herman ---", "Artist", "gh@m.com", 833333, 989000, 67),
        new Employee("Fedkov Mihail Viktorovich", "QA Engineer", "fmivi@m.com", 545355, 667000, 21)
        };
        
        for (Employee employee : employees) {
            if (employee.getAge() > 40 ) {
                System.out.println(employee);
                }
            }
        }
    }



class Employee {
    private String surnameNamePatronymic;
    private String position;
    private String email;
    private int phoneNumber;
    private int salary;
    private int age;

    public Employee(String surnameNamePatronymic, String position, String email, int phoneNumber, int salary, int age) {
        this.surnameNamePatronymic = surnameNamePatronymic;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }
    
    @Override
    public String toString() {
        return "SNP: " + surnameNamePatronymic + ", position: " + position + ", email" + email + ", phone number: " + phoneNumber + ", salary: "+ salary + ", age: " + age;
    }

    public int getAge() {
            return age;
    }
}