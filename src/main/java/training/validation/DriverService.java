package training.validation;

import javax.validation.Valid;

public class DriverService {

    @Valid
    private CarDriver driver;

    public DriverService(CarDriver driver) {
        this.driver = driver;
    }
}
