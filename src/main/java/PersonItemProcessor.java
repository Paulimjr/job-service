import br.com.jobservice.model.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

public class PersonItemProcessor implements ItemProcessor<Person, Person> {

    final static Logger LOGGER = LoggerFactory.getLogger(PersonItemProcessor.class);

    @Override
    public Person process(Person person) throws Exception {
        final Integer id = person.getId();
        final String name = person.getName();

        final Person transformedPerson = new Person(id, name);

        LOGGER.info("Converting ("+person+") into ("+transformedPerson+") ");

        return transformedPerson;
    }
}
