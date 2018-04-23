/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cours.Abstract;

import java.time.LocalDate;

/**
 *
 * @author Administrator
 */
interface DateNaissence {
    
    public final static LocalDate MAXDATE = LocalDate.now();
    
    LocalDate getNaissance();
    
}
