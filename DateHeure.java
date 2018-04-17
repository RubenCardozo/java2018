
package cours;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
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
        System.out.println(d.format(f1));//dimanche 20 5 2018
        TemporalAccessor ta = f1.parse("mardi 17/4/2018");
        
        d = LocalDate.from(ta);
        System.out.println(d);
        
        LocalTime lt = LocalTime.now();
        LocalTime lt1 = LocalTime.of(13,15,9);
        LocalTime lt2 = LocalTime.parse("16:24:10");
        DateTimeFormatter f2 =DateTimeFormatter.ofPattern("HH'h'mm");
        LocalTime lt3 =LocalTime.parse("20h15", f2);
        
        System.out.println(lt);
        System.out.println(lt1);
        System.out.println(lt2);
        System.out.println(lt3);
        
        System.out.println(lt.getHour());
        System.out.println(lt.getLong(ChronoField.SECOND_OF_DAY));
        
        TemporalAccessor ta2 = f2.parse("18h55");
        lt = LocalTime.from(ta2);
        System.out.println(lt);
        
        LocalDateTime ldt = LocalDateTime.now();
        LocalDateTime ldt1 = LocalDateTime.of(d,lt3);
        System.out.println(ldt1);
        
        ZonedDateTime zdt = ldt.atZone(ZoneId.of("Europe/Berlin"));
        
        System.out.println(zdt);
        
        zdt=zdt.plusHours(10);
        
        ZonedDateTime zdtLA = zdt.withZoneSameInstant(ZoneId.of("America/Los_Angeles"));
        System.out.println(zdtLA);
        
        ldt = d.atTime(11,52);
        
        Period p = Period.ofWeeks(10);
        System.out.println(p);
        Period p1 = Period.between(d3, d4);
        System.out.println(p1);
        
        System.out.println(p1.getDays());//la partie jour de ce periode
        
        p1=p1.minusYears(3);
        System.out.println(p1);
        LocalDate ld5 =(LocalDate) p1.addTo(LocalDate.now());
        
        System.out.println(ld5);
        
        System.out.println(p1.subtractFrom(ld5));
        
    }
}
