package com.example.demo;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;


@SpringBootTest
@AutoConfigureMockMvc
public class CirculoRestControllerTest {
	
	@Autowired
	private MockMvc mvc;
	
	@Test
	void test() throws Exception {
		mvc.perform(MockMvcRequestBuilders
				.get("/")
				.param("raio", "1"))
				.andExpect(status().isOk())
				.andExpect(content().string("{\"raio\":1.0,\"area\":3.14159}"));
	}
}
