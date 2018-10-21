package Prototypes;

public class Puplis {

    private  static PupilFactory pupilFactory=new StudentFactory();
    private  static Pupil pupil;

    public Puplis(Pupil pupil){
        this.pupil=pupil;
    }

    public static  String getFirstName(){
        if(pupil.getFirstName()!=null){
            return  pupil.getFirstName();
        }
        return  null;

    }
    public  static  void setFirstName(String firstName){
        if(pupil.getFirstName()!=null){
            pupil.setFirstName(firstName);
        }
    }
    public  static  void setPupilFactory(PupilFactory pupilFactory) {
        Puplis.pupilFactory=pupilFactory;
    }

    public  static  int getMark(int i) {
        if (pupil.getMark(i) != 0) {
            return pupil.getMark(i);
        }
        return 0;
    }
        public static  void setMark(int i, int value){
        if(pupil!=null){
            pupil.setMark(i, value);
        }
    }
    public  static  String  getSubjict(int i){
        if(pupil.getSubject(1)!=null){
            return pupil.getSubject(i);
        }
        return  null;
    }
    public  static  void setSubjict(int i, String  value){
        if(pupil!=null){
            pupil.setSubject(i, value);
        }
    }
    public static Pupil createInstance(String name, int size){
        pupil= pupilFactory.createInstance(name, size);
        return  pupil;
    }
    public static int AtithmeticMeans(){
        if(pupil.getSize()>0&&pupil!=null)

        {
            int arifmeticMeans=0;
            for(int i=0; i<pupil.getSize(); i++){
                System.out.println(pupil.getFirstName()+ " " + pupil.getMark(i)+ " " +pupil.getSubject(i));
          //      System.out.println(pupil.getFirstName()+ " " + (((pupil.getMark(i)+ " " +pupil.getSubject(i)));
                if(pupil.getMark(i)!=0){
                    arifmeticMeans+=pupil.getMark(i);
                }else {
                    arifmeticMeans=arifmeticMeans;}
            }
            return  arifmeticMeans/pupil.getSize();
        }

        return  0;}

}
////
