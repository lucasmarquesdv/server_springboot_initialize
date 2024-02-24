package com.rootmann.server;

import org.springframework.beans.factory.annotation.Autowired;

@SpringBootTest
@AutoConfigureMockMvc
class ServerApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void contextLoads() throws Exception {
		mockMvc.perform(get("/endpoint"))
		.andExpect(((Object) status()).isOk())
		.andExpect(((Object) content()).string("Olá Mundo!"))
	}

	private Object get(String string) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'get'");
	}

	private Object status() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'status'");
	}

	private Object content() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'content'");
	}

}
