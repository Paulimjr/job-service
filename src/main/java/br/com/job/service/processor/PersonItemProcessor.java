package br.com.job.service.processor;

import br.com.job.service.entities.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;


public class PersonItemProcessor implements ItemProcessor<Person, Person> {

    private static final Logger LOGGER = LoggerFactory.getLogger(PersonItemProcessor.class);

    @Override
    public Person process(Person person) throws Exception {
        final String name = person.getName();
        final String age = person.getAge();
        final Person personConverted = new Person(name, age);
        LOGGER.info("Converterd: "+personConverted);
        return personConverted;
    }
}
