package calculation;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class TaskOneDateCheckTest {

    @Test
    void checkEighteen() {
        LocalDate date1 = LocalDate.now().minusYears(18);
        TaskOneDateCheck taskOneDateCheck = new TaskOneDateCheck();

        assertEquals("User is 18 years old", taskOneDateCheck.checkIfUserIsEighteen(date1));
    }

    @Test
    void checkSeventeen() {
        LocalDate date1 = LocalDate.now().minusYears(17);
        TaskOneDateCheck taskOneDateCheck = new TaskOneDateCheck();

        assertEquals("User is not 18 years old", taskOneDateCheck.checkIfUserIsEighteen(date1));
    }

    @Test
    void checkNineteen() {
        LocalDate date1 = LocalDate.now().minusYears(19);
        TaskOneDateCheck taskOneDateCheck = new TaskOneDateCheck();

        assertEquals("User is not 18 years old", taskOneDateCheck.checkIfUserIsEighteen(date1));
    }

    @Test
    void checkEighteenMinusOneDay() {
        LocalDate date1 = LocalDate.now().minusYears(18).minusDays(1);
        TaskOneDateCheck taskOneDateCheck = new TaskOneDateCheck();

        assertEquals("User is 18 years old", taskOneDateCheck.checkIfUserIsEighteen(date1));
    }

    @Test
    void checkEighteenPlusOneDay() {
        LocalDate date1 = LocalDate.now().minusYears(18).plusDays(1);
        TaskOneDateCheck taskOneDateCheck = new TaskOneDateCheck();

        assertEquals("User is not 18 years old", taskOneDateCheck.checkIfUserIsEighteen(date1));
    }
}