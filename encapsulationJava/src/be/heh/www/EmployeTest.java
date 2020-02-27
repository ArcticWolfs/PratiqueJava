package be.heh.www;

import java.util.Date;

public class EmployeTest
{

    public static void main(String[] args)
    {
        Employe employee = new Employe(" toto ", 23,7,1990);
        Date dateNaissance = employee.getDateNaissance();
        System.out.println(dateNaissance);
        dateNaissance.setYear(100);
        dateNaissance = employee.getDateNaissance();
        System.out.println(dateNaissance);

    }
}
