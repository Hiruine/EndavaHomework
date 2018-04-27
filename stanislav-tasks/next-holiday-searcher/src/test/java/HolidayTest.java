import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;


import static org.assertj.core.api.Assertions.*;


public class HolidayTest {



    @Test
    public void theNextHolidayFromAGivenDate() {

        TreeSet<LocalDate> initial = new TreeSet<>();

        initial.add(LocalDate.of(2018, 6, 1));
        initial.add(LocalDate.of(2018, 5, 9));
        initial.add(LocalDate.of(2018, 5, 1));

        Holidays holidays = new Holidays(initial);
        Optional<LocalDate> optionalLocalDate =
                holidays.nextHoliday(LocalDate.of(2018, 5, 5));


        assertThat(optionalLocalDate)
                .contains(LocalDate.of(2018, 5, 9));

    }

    @Test
    public void thereAreNoHolidaysFromAGivenDate() {
        TreeSet<LocalDate> initial = new TreeSet<>();
        initial.add(LocalDate.of(2018, 5, 9));

        Holidays holidays = new Holidays(initial);
        Optional<LocalDate> optionalLocalDate =
                holidays.nextHoliday(LocalDate.of(2018, 5, 10));

        assertThat(optionalLocalDate)
                .isEmpty();
    }
}
