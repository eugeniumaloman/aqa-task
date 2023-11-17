package calculation;

import java.time.LocalDate;
import java.time.Period;

public class TaskOneDateCheck {
    public String checkIfUserIsEighteen(LocalDate inputDate) {
        LocalDate currentDate = LocalDate.now();
        Period age = Period.between(inputDate, currentDate);
        if (age.getYears() == 18) {
            return "User is 18 years old";
        } else {
            return "User is not 18 years old";
        }
    }
}