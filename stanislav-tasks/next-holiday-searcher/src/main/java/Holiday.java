import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.TreeSet;

public class Holiday {


    private TreeSet<LocalDate> holidays;


    public Holiday() {
    }


    public void addHoliday(LocalDate holiday) {
        holidays.add(holiday);
    }

    public Optional<LocalDate> nextHoliday(LocalDate date) {

        return holidays.stream()
                .filter(t -> t.getMonthValue() >= date.getMonthValue()
                        & t.getDayOfMonth() >= date.getDayOfMonth())
                .findFirst();

    }



}
