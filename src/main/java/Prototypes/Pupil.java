package Prototypes;

public interface Pupil {
    public String getFirstName();
    public void setFirstName(String firstName);
    public int getMark(int i);
    public void setMark(int i, int value);
    public String getSubject(int i);
    public void setSubject(int i, String value);
    public void addMarkAndSubject(int mark1, String subject1);
    public  int getSize();



}
