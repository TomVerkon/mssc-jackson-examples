package guru.springframework.msscjacksonexamples.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

import com.fasterxml.jackson.databind.ObjectMapper;

@JsonTest
//@ActiveProfiles("kebab")
class BeerDtoTest extends BaseTest {

    @Autowired
    ObjectMapper mapper;

    @Test
    void testJson() throws IOException {
	BeerDto inputDto = getDto();
	System.out.println(inputDto);
	String serializedInputDto = mapper.writeValueAsString(inputDto);
	System.out.println(serializedInputDto);
	BeerDto outputDto = mapper.readValue(serializedInputDto, BeerDto.class);
	System.out.println(outputDto);
	assertEquals(inputDto, outputDto);
    }
    
}
