package repositories;

import com.app.mytix.configuration.RepositoryConfiguration;
import com.app.mytix.domain.Event;
import com.app.mytix.repositories.EventRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import org.springframework.boot.test.SpringApplicationConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
//@SpringApplicationConfiguration(classes = {RepositoryConfiguration.class})
public class EventRepositoryTest {
    @Autowired
    private EventRepository eventRepository;

    @Test
    public void testSaveEvent() {
        Event event = new Event();
        event.setEventName("Doomtree at Palace Theater");

        assertNull(event.getId());
        eventRepository.save(event);
        assertNotNull(event.getId());

        Event fetchedEvent = eventRepository.findOne(event.getId());
    }

}
