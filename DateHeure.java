
package cours;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.*;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author Administrator
 */
public class DateHeure {
    public static void main(String[] args) {
        Date t = new Date();
        System.out.println(t.getTime()/1000/60/60/24/365.2);
        
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.get(Calendar.MONTH));
        cal.add(1, Calendar.YEAR );
        System.out.println(cal);

        System.out.println(cal.getTime().getTime()- cal.getTimeInMillis());
        
        System.out.println(cal.getTimeZone().getDisplayName());
        
        LocalDate d = LocalDate.now();
        LocalDate d2= LocalDate.of(2010, 3, 12);
        LocalDate d3= LocalDate.parse("2015-03-12");
        LocalDate d4= LocalDate.ofEpochDay(t.getTime()/1000/60/60/24);
        
        System.out.println(d);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
        
        d=d.plusWeeks(5).minusDays(2);
        
        System.out.println(d.getMonth()+" ("+d.getMonth().getValue()+")");
        System.out.println(d.getEra());
        System.out.println(d.getLong(ChronoField.DAY_OF_YEAR)); 
        System.out.println(d);
        
        DateTimeFormatter f1=DateTimeFormatter.ofPattern("EEEE d/M/yyyy");
        System.out.println(d.format(f1));
        TemporalAccessor dd = f1.parse("mardi 17/4/2018");
        
        d = LocalDate.from(dd);
        System.out.println(d);
    }
}
