package br.exercico2_poo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AmigoTest {
	Amigo amigo;
	private static String NOME_AMIGO = "Maria";
	private static String EMAIL_AMIGO ="maria@gmail.com";

	@BeforeEach
	void setUp() throws Exception {
		amigo = new Amigo(NOME_AMIGO,EMAIL_AMIGO);
	}

	@Test
	void testAmigo() {
		assertTrue(amigo.getNome().equals(NOME_AMIGO));
		assertEquals(EMAIL_AMIGO, amigo.getEmail());
	}

	@Test
	void testGetNome() {
		assertTrue(amigo.getNome().equals(NOME_AMIGO));
	}

	@Test
	void testSetNome() {
		amigo.setNome("Manoel");
		assertEquals("Manoel",amigo.getNome());
	}

	@Test
	void testGetEmail() {
		assertEquals(EMAIL_AMIGO, amigo.getEmail());
	}

	@Test
	void testSetEmail() {
		amigo.setEmail("manoel@gmail.com");
		assertEquals("manoel@gmail.com", amigo.getEmail());
	}

	@Test
	void testGetEmailAmigoSorteado() {
		assertNull(amigo.getEmailAmigoSorteado());
		amigo.setEmailAmigoSorteado("maria@gmail.com");
		assertEquals("maria@gmail.com", amigo.getEmailAmigoSorteado());
	}

	@Test
	void testSetEmailAmigoSorteado() {
		amigo.setEmailAmigoSorteado("manoel@gmail.com");
		assertEquals("manoel@gmail.com", amigo.getEmailAmigoSorteado());
	}

}
