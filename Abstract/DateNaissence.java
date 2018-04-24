
package cours.Abstract;

import java.time.LocalDate;

interface DateNaissence {
    
    public final static LocalDate MAXDATE = LocalDate.now();
    
    LocalDate getNaissance();
    
}
