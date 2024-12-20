package de.schulung.spring.accounts;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest
@AutoConfigureMockMvc
class LandingPageTests {

  @Autowired
  MockMvc mockMvc;

  @Test
  void shouldHaveIndexHtml() throws Exception {
    mockMvc
      .perform(
        get("/index.html")
          .accept(MediaType.ALL)
      )
      .andExpect(status().isOk());
  }

}
