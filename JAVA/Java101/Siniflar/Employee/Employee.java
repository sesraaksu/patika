package JAVA.Java101.Siniflar.Employee;

public class Employee {

    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax (){
        double tax = 0;
        if (salary > 1000) {
            tax += (salary * 3) / 100;
        } else {
            tax = 0;
        }
        return tax;
    }

    public double bonus(){
        int bonus = 0;
        if(workHours > 40){
            bonus += (workHours - 40) * 30;
        }
        return bonus;
    }

    public double raiseSalary (){
        int raiseSalary = 0;
        if ((2021 - hireYear) < 10 ) {
            raiseSalary += salary * 0.05;
        }
        if (((2021 - hireYear) > 9) && ((2021 - hireYear) < 20)) {
            raiseSalary += salary * 0.10;
        }
        if ((2021 - hireYear) > 19) {
            raiseSalary += salary * 0.15;
        }
        return raiseSalary;
    }

    public void printInfo() {
        System.out.println("Adı  : " + this.name);
        System.out.println("Maaşı  : " + this.salary);
        System.out.println("Çalışma Saati : " + this.workHours);
        System.out.println("Başlangıç Yılı : " + this.hireYear);
        System.out.println("Vergi : " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Maaş Artışı : " + raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + (salary + bonus() - tax()));
        System.out.println("Toplam Maaş : " + (salary +  raiseSalary()));
    }
}
