package Test;

// citizens ------------------------

class citizens {
    String name;
    int age;

    citizens(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println(name);
        System.out.println(age);
    }
}

// Employee -------------------------

class Employee extends citizens {
    int eid;
    double sal;
    double tax;

    Employee(String name, int age, int eid, double sal, double tax) {
        super(name, age);
        this.eid = eid;
        this.sal = sal;
        this.tax = tax;
    }

    void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(eid);
        System.out.println(sal);
        System.out.println(tax);
    }
}

// Student ------------------------------------

class Student extends citizens {
    int sid;
    double perc;

    Student(String name, int age, int sid, double perc) {
        super(name, age);
        this.sid = sid;
        this.perc = perc;
    }

    void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(sid);
        System.out.println(perc);
    }
}

// Gov of india --------------------------------

class GovOfIndia {
    void adhar(citizens args) {
        args.display();
    }

    void scolarship(Student args) {
        if (args.perc >= 80) {
            System.out.println("Applicable for scolarship");
            args.display();
        } else {
            System.out.println("Not eligable for scolarship");
        }
    }

    void taxPayment(Employee args) {
        if (args.sal >= 800000) {
            if (args.tax >= 20) {
                System.out.println("Applicable for tax service");
                args.display();
            } else {
                System.out.println("Not applicalble for tax");
            }
        }
    }
}

class Eligblity {
    void services(citizens args) {
        if (args instanceof Employee) {
            Employee e1 = (Employee) args;
            e1.display();
        }

        else if (args instanceof Student) {
            Student s1 = (Student) args;
            s1.display();
        }

        else if (args instanceof citizens) {
            citizens c1 = (citizens) args;
            c1.display();
        }
    }
}

public class MainClass {
    public static void main(String[] args) {
        GovOfIndia g = new GovOfIndia();
        citizens c1 = new citizens("Aman", 22);
        Student s1 = new Student("Rahul", 19, 101, 81);
        Employee e1 = new Employee("Pankag", 19, 1001, 900000, 21);
        g.adhar(c1);
        g.adhar(s1);
        g.adhar(e1);
        g.scolarship(s1);
        g.taxPayment(e1);
        Eligblity er = new Eligblity();
        er.services(e1);
    }
}
