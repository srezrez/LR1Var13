package application.service;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import javafx.application.Application;
import javafx.stage.Stage;

public class MainTest extends Application{
	
	private boolean expected = true;
	private StringBuilder res;
	
	public MainTest() {
		super();
	}

	@Before
	public void init() {
		res = new StringBuilder();
	}
	
	@Test
	public void resNotNull() {
		boolean real = true;
		if(res== null)
			real = false;
		assertEquals("Successful", expected, real);
		
	}
	@Test
	public void resToStringNotNull() {
		boolean real = true;
		if(res.toString()== null)
			real = false;
		assertEquals("Successful", expected, real);
	}
	
	@Test
	public void TestExpected() {
		boolean real = false;
		init();
		int num = 2;
		while(num>0) {
			res.append(num%2);
			num/=2;
		}
		res.reverse();
		if(res.toString().equals("10"))
			real = true;
		assertEquals("Successful", expected, real);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		
	}


}
