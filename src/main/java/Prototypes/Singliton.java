package Prototypes;

public class Singliton {
    private static  Singliton singliton;

    private   Singliton(){
        System.out.println("SinglitonS");
    }
    public static  Singliton getSingliton(){
        if(singliton==null){
             singliton=new Singliton();
        }
        return  singliton;
    }
}
