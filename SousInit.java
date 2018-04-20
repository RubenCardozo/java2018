
package cours;


class SousInit extends Init{
    
    static int sj;
    static{
        j/=3;
        System.out.println("static init SousInit j= "+j);
    }
    
    int si;
    {
        i/=3;
        System.out.println("init sousinit i= " +i);
    }
    
    SousInit() {
        i/=2;
        System.out.println("ctor sousinit i= " +i);
        System.out.println("ctor sousinit j= " +j);
    }
    
    
    
    
    
}
