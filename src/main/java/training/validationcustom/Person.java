package training.validationcustom;

public class Person {

    @ManagerName
//    @CheckCase(value = CaseType.UPPER_CASE, message = "should have upper case name")
    private String name;

    public Person(String name) {
        this.name = name;
    }
}
