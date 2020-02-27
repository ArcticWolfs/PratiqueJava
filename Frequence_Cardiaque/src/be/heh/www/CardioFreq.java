package be.heh.www;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CardioFreq
{
    private String name;
    private String Surname;
    private String day;
    private String month;
    private String year;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void CardioFreq()
    {
        
    }

    public int CalculeAge(String dateDeNaissance)
    {
        int userDay = Integer.parseInt(getDay());
        int userMonth = Integer.parseInt(getMonth());
        int userYear = Integer.parseInt(getYear());
        Calendar cal = new GregorianCalendar(userYear,userMonth,userDay);
        Calendar maintenant = new GregorianCalendar();
        int ageUser = maintenant.get(Calendar.YEAR) - cal.get(Calendar.YEAR);
        if (cal.get(Calendar.MONTH) > maintenant.get(Calendar.MONTH))
        {
            ageUser--;
        }
        if ((cal.get(Calendar.MONTH) == maintenant.get(Calendar.MONTH)) && (cal.get(Calendar.DAY_OF_MONTH) > maintenant.get(Calendar.DAY_OF_MONTH)))
        {
            ageUser--;
        }
        return ageUser;
    }

    public int CalculeFrequenceCardiaqueMax(String dateDeNaissance)
    {
        int userAge = CalculeAge(dateDeNaissance);
        int fcm = 220 - userAge;
        return fcm;
    }

    public void CalculeFrequenceCible(String dateDeNaissance)
    {
        double fcm = CalculeFrequenceCardiaqueMax(dateDeNaissance);
        double fcmMin = fcm * 0.6;
        double fcMax  = fcm * 0.8;
        System.out.println("Fréquence cible : "+fcmMin+" - "+fcMax);
    }

    public void afficher(String dateDeNaissance)
    {
        System.out.println("Nom : "+getName()+" Prénom : "+getSurname()+" Date : "+dateDeNaissance);
        System.out.println("FCM : "+CalculeFrequenceCardiaqueMax(dateDeNaissance));
        CalculeFrequenceCible(dateDeNaissance);
    }
}
