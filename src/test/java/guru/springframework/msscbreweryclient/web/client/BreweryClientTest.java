package guru.springframework.msscbreweryclient.web.client;

import guru.springframework.msscbreweryclient.web.model.BeerDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.net.URI;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BreweryClientTest {

    @Autowired
    BreweryClient breweryClient;

    @Test
    void getBeerById() {
        BeerDto dto = breweryClient.getBeerById(UUID.randomUUID());

        assertNotNull(dto);
    }

    @Test
    void testSaveNewBeer() {
        //given
        BeerDto beerDto = BeerDto.builder().beerName("New Beer").build();

        URI uri = breweryClient.saveNewBeer(beerDto);

        assertNotNull(uri);

        System.out.println(uri.toString());
    }
}