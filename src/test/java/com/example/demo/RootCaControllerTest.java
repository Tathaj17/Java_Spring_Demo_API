package com.example.demo;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

class RootCaControllerTest {

	@InjectMocks
	RootCaController rootCaController;
	@Autowired
	MockMvc mvc;

	@BeforeEach
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		this.mvc = MockMvcBuilders.standaloneSetup(rootCaController).build();
	}

	@Test
	void test() throws Exception {
		Employee employee = new Employee();
		employee.setAge(2);
		employee.setName("Amar");
		mvc.perform(get("/home")).andExpect(status().isOk()).andReturn();
	}

}
