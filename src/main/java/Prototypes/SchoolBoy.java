package Prototypes;

import java.util.Arrays;

public class SchoolBoy implements  Pupil, Cloneable  {
    private String family;
    private int size;
    private   Register registers[];

    public SchoolBoy(String family, int size) {
        this.registers=new Register[size];
        this.family = family;
        this.size = size;
    }
    class Register{
        int mark;
        String subjict;
        Register(){
        }

        public Register(int mark, String subjict){
            this.mark=mark;
            this.subjict=subjict;
        }
        public int getMark(){
            return mark;
        }
        public  void setMark(int mark){
            this.mark=mark;
        }


        public String getSubject() {
            return subjict;
        }


        public void setSubjict(String subjict) {
            this.subjict=subjict;
        }

        @Override
        public String toString() {
            return "Register{" +
                    "mark=" + mark +
                    ", subjict=" + subjict + '\"' +
        '}';
        }
    }

    public  Register[] getRegister(){
        return  registers;
    }

    public void setRegisters(Register[] register) {
        this.registers = register;
    }

    @Override
    public String getFirstName() {
        return this.family;
    }

    @Override
    public void setFirstName(String firstName) {
        this.family=family;

    }

    @Override
    public int getMark(int i) {
        if(registers[i]!=null){
            return  registers[i].getMark();
        }
        return 0;
    }

    @Override
    public void setMark(int i, int value) {
    if(registers[i]!=null){
        this.registers[i].setMark(value);
    }
    else {
        Register register=new Register();
        register.setMark(value);
        this.registers[i]=register;
    }
    }

    @Override
    public String getSubject(int i) {
        if(registers[i]!=null){
            return  this.registers[i].subjict;
        }
        return null;
    }

    @Override
    public void setSubject(int i, String value) {
   if(registers[i]!=null){
       this.registers[i].setSubjict(value);
   }
   else{
       Register register=new Register();
       register. setSubjict(value);
       this.registers[i]=register;
   }
   }

    @Override
    public void addMarkAndSubject(int mark1, String subject1) {
     registers=Arrays.copyOf(registers, registers.length+1);
     Register register=new Register(mark1, subject1);
     registers[registers.length-1]=register;
     size=registers.length;
    }

    @Override
    public int getSize() {
        return size;
    }



    @Override
    public String toString() {
        return "FactoryMethod.SchoolBoy{"+
                "family=' " + family + '\'' +
                ", registers=" +Arrays.toString(registers)+
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        SchoolBoy clone=(SchoolBoy) super.clone();

        return clone;
    }
}