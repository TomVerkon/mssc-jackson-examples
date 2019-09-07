package guru.springframework.msscjacksonexamples.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

public class BaseTest {

    BeerDto getDto() {
	return BeerDto.builder().beerName("Tom's Pale Ale").beerStyle("PALE_ALE").id(UUID.randomUUID())
		.price(new BigDecimal("2.99")).createdDate(OffsetDateTime.now()).lastUpdatedDate(OffsetDateTime.now())
		.upc(Long.MAX_VALUE).build();
    }

}
