package Prototypes;

public class StudentFactory implements  PupilFactory {
    @Override
    public Pupil createInstance(String FirstName, int size) {
        return new Student(FirstName, size);
    }
}
