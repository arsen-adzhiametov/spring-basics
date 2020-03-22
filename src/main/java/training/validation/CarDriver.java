package training.validation;


import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class CarDriver {

    @NotNull
    private String name;

    @Min(18)
    private int age;

    @AssertTrue
    private boolean isAlconavt;

    public CarDriver(String name, int age, boolean alconavt) {
        this.name = name;
        this.age = age;
        isAlconavt = alconavt;
    }

}
