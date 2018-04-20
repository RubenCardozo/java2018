package cours;

public class Soleil {

    public static void main(String[] args) {
        Util.v = 10;
        Util u = new Util();
        u.v = 100;

        System.out.println(Util.v);
        System.out.println(Util.getV());
        System.out.println(u.getV());//Legal mais pas recommendable
        u.w = 45;
        System.out.println(u.getW());
        System.out.println("**********************");
        SousUtil su = new  SousUtil();
        System.out.println(su.getV());//Legal mais pas recommendable
        System.out.println(SousUtil.getV());
        
        System.out.println("**********************");
        Util su2 = new  SousUtil();
        System.out.println(su2.getV());//Legal mais pas recommendable
        System.out.println(((SousUtil)su2).getV());
        System.out.println(SousUtil.getV());
        
        System.out.println("*********SousUtil*************");
        SousUtil sut = new SousUtil();
        sut.w=50;
        System.out.println(sut.getV());
        
        System.out.println("**********Util************");
        Util suu = new  SousUtil();
        suu.w=60;
        System.out.println(suu.getV());
        System.out.println(((SousUtil)suu).getV());
        
        System.out.println("**********Inicialisation************");
        System.out.println("Main "+SousInit.j);//satis init de init unicament
        SousInit s=null;//aucun block
        Init si = new SousInit();//bloc static restants + blocs + ctors
        SousInit si2 = new SousInit();//blocs + ctors
        System.out.println(si.i);
        System.out.println(si.j);
        
    }
}
