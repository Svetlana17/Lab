package Prototypes;

import java.util.Arrays;

public class Student  implements  Pupil, Cloneable{

    private String firstName;
    private int size;
    private int mark[];
    private String subject[];

   //конструктор классса
    public Student(String firstName, int size){
        this.firstName=firstName;
        this.mark=new int[size];
        this.subject=new String[size];
        this.size=size;
    }
   public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getMark(int i) {
        return mark[i];
    }

    public void setMark(int i, int value) {
        this.mark [i]= value;
    }

    public String getSubject(int i) {
        return subject[i];
    }

    public void setSubject(int i, String value) {
        this.subject[i] = value;
    }

    public void addMarkAndSubject(int mark1, String subject1){
        subject=Arrays.copyOf(subject, subject.length+1);
        subject[subject.length-1]=subject1;

        mark=Arrays.copyOf(mark, mark.length+1);
        mark[mark.length-1]=mark1;
        size=mark.length;
    }

    @Override
    public int getSize() {
        return size;
    }


    @Override
    public String toString() {

        return "FactoryMathod.Student{"+
                "firstName=" +firstName + '\''+
                ", mark=" + Arrays.toString(mark) +
                ", subject=" + Arrays.toString(subject)+
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Student clone= (Student) super.clone();
        return clone;

    }
}
