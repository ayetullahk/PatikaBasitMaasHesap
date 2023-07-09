package org.example;

public class Employees {
    String name;
    double salary;
    int workHours;
    int hireYear;
    Employees(String name,double salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }
    public double tax(){
        if (salary <= 1000) {
            return 0;
        } else {
            return salary * 0.03;
        }
    }
    public double bonus() {
        if (workHours > 40) {
            int extraHours = workHours - 40;
            return extraHours * 30;
        } else {
            return 0;
        }
    }
    public void raiseSalary() {
        int currentYear = 2021;
        int yearsOfWork = currentYear - hireYear;

        if (yearsOfWork < 10) {
            salary += salary * 0.05;
        } else if (yearsOfWork >= 10 && yearsOfWork < 20) {
            salary += salary * 0.1;
        } else {
            salary += salary * 0.15;
        }
    }

    public String toString() {
        return "{" +
                "Adı='" + name + '\'' +
                ", Maaşı=" + salary +
                ", Çalışma saati=" + workHours +
                ", Başlangıç Tarihi=" + hireYear +
                ", Vergi=" + tax()+
                ", Prim=" + bonus()+
                ", Toplam Tutar :" +(salary-tax()+bonus());

    }


}
