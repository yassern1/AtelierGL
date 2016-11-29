package test.java.edu.ensa.fly.tests;



import static org.junit.Assert.*;

import org.junit.Test;

import main.java.edu.ensa.fly.beans.Client;


public class TestClient {

	/*@Test
	public void test() {
		fail("Not yet implemented");
	}*/
	public TestClient(){
		
	}
	public void testGetIdClient(){
		Client clt=new Client("clt1", "nom", "prenom");
		assertNotNull(clt.getId_clt());
	}
}
