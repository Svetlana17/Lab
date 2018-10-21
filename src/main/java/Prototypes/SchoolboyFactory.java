package Prototypes;

public class SchoolboyFactory implements  PupilFactory {
    @Override
    public Pupil createInstance(String FirstName, int size) {
        return new SchoolBoy(FirstName, size);
    }
}
