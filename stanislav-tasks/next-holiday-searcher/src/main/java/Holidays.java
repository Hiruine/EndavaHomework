import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.TreeSet;

public class Holidays {


    private TreeSet<LocalDate> holidays;


    public Holidays(TreeSet<LocalDate> holidays) {
        this.holidays = holidays;
    }

    public void addHoliday(LocalDate holiday) {
        holidays.add(holiday);
    }

    public Optional<LocalDate> nextHoliday(LocalDate date) {

        return holidays.stream()
                .filter(t -> !(
                        t.getMonthValue() == date.getMonthValue()
                            && t.getDayOfMonth() <= date.getDayOfMonth()
                        )
                )
                .findFirst();
    }

}
