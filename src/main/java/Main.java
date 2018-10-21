import Prototypes.*;

import java.util.Properties;
///Это первая лабораторная по Патттерам
public class Main {
    public static void main(String[] args){
    Singliton singliton=Singliton.getSingliton();
    System.out.println(singliton);
    Properties properties = SinglitonProperties.getProperties();
    System.out.println("Чтение настроек файла "+properties.getProperty( "Function"));
//
//    /// Проверка работы фабричного метода
    Student student=new Student("Kuzmina", 3);
    student.setSubject(0,"Нistory");
    student.setMark(0,3);
    student.addMarkAndSubject(0,"Fisic");

    System.out.println(student.toString());
//
    SchoolBoy schoolBoy=new SchoolBoy("Mikhalkov", 5);
    schoolBoy.setSubject(0, "History");
    System.out.println(schoolBoy.getSubject(0));
    schoolBoy.setSubject(0, "Fisic");
    schoolBoy.setMark(0,4);
    schoolBoy.addMarkAndSubject(1,"Geo");
    System.out.println(schoolBoy.toString());
    System.out.println(schoolBoy.getSubject(0));
//
//    //проверка фабричного метода
    Puplis pupils1=new Puplis(new Student("Zimina", 4));
    System.out.println(Puplis.getFirstName());// выводит фамилию
    pupils1.setSubjict(1, "Fisic");
    System.out.println(Puplis.getSubjict(1));//выводит предмет
    pupils1.setMark(1, 5);
    System.out.println(pupils1.getMark(1));//выводит оценку
//
//
    Puplis pupliss=new Puplis(new SchoolBoy("Kirillin", 3));
    pupliss.setSubjict(2, "Math");
    System.out.println(pupliss);
    StudentFactory studentFactory=new StudentFactory();
    Pupil pupilS=studentFactory.createInstance("Saxconova", 3);
    System.out.println(pupilS.getFirstName());

    SchoolboyFactory schoolboyFactory=new SchoolboyFactory();
    SchoolBoy schoolBoyS=(SchoolBoy) schoolboyFactory.createInstance("Tarasov", 3);
    System.out.println(schoolBoyS);

    Student s=(Student) Puplis.createInstance("Vokin", 3);
    try {
        Student cloneStudent= (Student) s.clone();
    } catch (CloneNotSupportedException e) {
        e.printStackTrace();
    }

    System.out.println("clone "+s.getFirstName()+" " + s);
    System.out.println("original " + s.getFirstName()+" " +s);


    Puplis.setPupilFactory(new SchoolboyFactory());
    SchoolBoy c=(SchoolBoy) Puplis.createInstance("Sumilov", 3);

    SchoolBoy schoolBoy1=(SchoolBoy) Puplis.createInstance("Malinin",3 ) ;
    try {
        SchoolBoy cloneSchollboy=(SchoolBoy) schoolBoy1.clone();
        System.out.println( "cloneSchoolboy  "  +  cloneSchollboy.getFirstName() + " " +cloneSchollboy );
    } catch (CloneNotSupportedException e) {
        System.out.println("--------------"+e.getMessage());
    }

    System.out.println("original "  +  schoolBoy1.getFirstName() + " " + schoolBoy);

    System.out.println(c.getFirstName());
    Puplis.setMark(2, 4);
    System.out.println(Puplis.getMark(2));
    Puplis.setSubjict(1, "English");
    System.out.println(Puplis.getSubjict(1));


    Puplis.setPupilFactory(new SchoolboyFactory());
    SchoolBoy schoolBoyA=(SchoolBoy) Puplis.createInstance("Osipova", 3);
    //задали оценки
    schoolBoyA.setMark(0, 5);
    schoolBoyA.setMark(1, 4);
    schoolBoyA.setMark(2, 4);
    schoolBoyA.setSubject(0, "English");
    schoolBoyA.setSubject(1, "Fisic");
    schoolBoyA.setSubject(2, "Geo");



    System.out.println("+"+Puplis.getMark(0));// для schoolBoy1 оценка
    schoolBoy1.setSubject(0, "English");

    schoolBoy1.setSubject(1, "English");
    // System.out.println(Puplis.getMark(0)); //вывели оценки ученика под номером 1
    // System.out.println(Puplis.getSubjict(0));// вывели предметы ученика под номером 1
    System.out.println(Puplis.getSubjict(0)+ " " + Puplis.getMark(0));// вывели сразу оценки и предметы
    System.out.println(Puplis.getSubjict(1)+ " " + Puplis.getMark(1));// вывели сразу

   System.out.println("!!!!"+Puplis.AtithmeticMeans());

    Employ employ=new Employ();
    employ.load();
    Employ employ1 =null;
    Employ employ2=null;
    try {
        employ1= (Employ) employ.clone();
        employ2=(Employ) employ.clone();
    } catch (CloneNotSupportedException e) {
        e.printStackTrace();
 }
    System.out.println(employ1.getList());
    System.out.println(employ2.getList());
    System.out.println(employ.getList());

}}


