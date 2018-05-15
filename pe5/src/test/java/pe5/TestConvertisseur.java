package pe5;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;




//@Test et @Before NECESSITE DEPENDECY DANS POM XML
public class TestConvertisseur {
	private Convertisseur convertisseur ; //à tester 
	
	@Before
	public void init(){
		System.out.println("init appelé");
		convertisseur= new Convertisseur();
	}
	

	@Test
	public void testEuroToFranc() {
		double sommeEnFranc= convertisseur.euroToFranc(15);//montantEnEuro *6.55957;
		Assert.assertEquals(sommeEnFranc, 98.0 , 2.0);
	}
	@Test
	public void testFrancToEuro() {
		double sommeEnEuro= convertisseur.francToEuro(99);//montantEnFranc /6.55957;
		Assert.assertEquals(sommeEnEuro, 15.0 ,0.5);
	}

}
