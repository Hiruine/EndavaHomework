import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;

public class HolidaysSerializer {


    public static void addHoliday(LocalDate date) {
        try {
            Path path = Paths.get("stanislav-tasks//next-holiday-searcher//src/main//resources//ListOfHolidays.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(LocalDate.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbMarshaller.marshal(date, path.toFile());



        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }


}
