package edu.towson.cis.cosc442.project4.coffeemaker;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>RecipeTest</code> contains tests for the class <code>{@link Recipe}</code>.
 *
 * @generatedBy CodePro at 3/19/18 5:21 PM
 * @author am
 * @version $Revision: 1.0 $
 */
public class RecipeTest {
	/**
	 * Run the boolean equals(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/19/18 5:21 PM
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		Recipe r = RecipeFactory.createRecipe();

		boolean result = fixture.equals(r);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/19/18 5:21 PM
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		Recipe r = RecipeFactory.createRecipe();

		boolean result = fixture.equals(r);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/19/18 5:21 PM
	 */
	@Test
	public void testEquals_3()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		Recipe r = RecipeFactory.createRecipe();

		boolean result = fixture.equals(r);

		// add additional test code here
		assertEquals(false, result);
	}
	
	@Test
	public void testEquals_4()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		Recipe r = RecipeFactory.createRecipe();

		boolean result = fixture.equals(r);

		// add additional test code here
		assertEquals(false, result);
	}

	@Test
	public void testEquals_5()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		Recipe r = RecipeFactory.createRecipe();
		r.setName("Coffee");
		boolean result = fixture.equals(r);

		// add additional test code here
		assertEquals(false, result);
	}
	
	@Test
	public void testEquals_6()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		Recipe r = RecipeFactory.createRecipe();
		r.setName(null);
		boolean result = fixture.equals(r);

		// add additional test code here
		assertEquals(false, result);
	}
	
	@Test
	public void testEquals_7()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		Recipe r = RecipeFactory.createRecipe();
		r.setName("C");
		fixture.setName("Co");
		boolean result = fixture.equals(r);

		// add additional test code here
		assertEquals(false, result);
	}
	/**
	 * Run the int getAmtChocolate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/19/18 5:21 PM
	 */
	@Test
	public void testGetAmtChocolate_1()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		fixture.setAmtChocolate(1);
		int result = fixture.getAmtChocolate();

		// add additional test code here
		assertEquals(1, result);
	}

	
	@Test
	public void testGetAmtChocolate_2()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		fixture.setAmtChocolate(0);
		int result = fixture.getAmtChocolate();

		// add additional test code here
		assertEquals(0, result);
	}
	
	@Test
	public void testGetAmtChocolate_3()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		fixture.setAmtChocolate(-1);
		int result = fixture.getAmtChocolate();

		// add additional test code here
		assertEquals(-1, result);
	}
	/**
	 * Run the int getAmtCoffee() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/19/18 5:21 PM
	 */
	@Test
	public void testGetAmtCoffee_1()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		fixture.setAmtCoffee(1);
		int result = fixture.getAmtCoffee();

		// add additional test code here
		assertEquals(1, result);
	}

	@Test
	public void testGetAmtCoffee_2()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		fixture.setAmtCoffee(0);
		int result = fixture.getAmtCoffee();

		// add additional test code here
		assertEquals(0, result);
	}

	@Test
	public void testGetAmtCoffee_3()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		fixture.setAmtCoffee(-1);
		int result = fixture.getAmtCoffee();

		// add additional test code here
		assertEquals(-1, result);
	}
	/**
	 * Run the int getAmtMilk() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/19/18 5:21 PM
	 */
	@Test
	public void testGetAmtMilk_1()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		fixture.setAmtMilk(1);
		int result = fixture.getAmtMilk();

		// add additional test code here
		assertEquals(1, result);
	}

	@Test
	public void testGetAmtMilk_2()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		fixture.setAmtMilk(0);
		int result = fixture.getAmtMilk();

		// add additional test code here
		assertEquals(0, result);
	}
	
	@Test
	public void testGetAmtMilk_3()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		fixture.setAmtMilk(-1);
		int result = fixture.getAmtMilk();

		// add additional test code here
		assertEquals(-1, result);
	}
	/**
	 * Run the int getAmtSugar() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/19/18 5:21 PM
	 */
	@Test
	public void testGetAmtSugar_1()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		fixture.setAmtSugar(1);
		int result = fixture.getAmtSugar();

		// add additional test code here
		assertEquals(1, result);
	}
	@Test
	public void testGetAmtSugar_2()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		fixture.setAmtSugar(0);
		int result = fixture.getAmtSugar();

		// add additional test code here
		assertEquals(0, result);
	}
	
	@Test
	public void testGetAmtSugar_3()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		fixture.setAmtSugar(-1);
		int result = fixture.getAmtSugar();

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/19/18 5:21 PM
	 */
	@Test
	public void testGetName_1()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();

		String result = fixture.getName();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the int getPrice() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/19/18 5:21 PM
	 */
	@Test
	public void testGetPrice_1()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		fixture.setPrice(0);
		int result = fixture.getPrice();

		// add additional test code here
		assertEquals(0, result);
	}
	
	@Test
	public void testGetPrice_2()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		fixture.setPrice(1);
		int result = fixture.getPrice();

		// add additional test code here
		assertEquals(1, result);
	}
	
	@Test
	public void testGetPrice_3()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		fixture.setPrice(-1);
		int result = fixture.getPrice();

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the void setAmtChocolate(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/19/18 5:21 PM
	 */
	@Test
	public void testSetAmtChocolate_1()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		int amtChocolate = 0;

		fixture.setAmtChocolate(amtChocolate);

		
		// add additional test code here
		assertEquals(0,fixture.getAmtChocolate());
	}

	/**
	 * Run the void setAmtChocolate(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/19/18 5:21 PM
	 */
	@Test
	public void testSetAmtChocolate_2()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		int amtChocolate = 1;

		fixture.setAmtChocolate(amtChocolate);
		

		// add additional test code here
		
		assertEquals(1,fixture.getAmtChocolate());
		
	}
	
	@Test
	public void testSetAmtChocolate_3()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		int amtChocolate = -1;

		fixture.setAmtChocolate(amtChocolate);
		

		// add additional test code here
		
		assertEquals(-1,fixture.getAmtChocolate());
		
	}
	
//	@Test
//	public void testSetAmtChocolate_4()
//		throws Exception {
//		Recipe fixture = RecipeFactory.createRecipe();
//		int amtChocolate = -2;
//
//		fixture.setAmtChocolate(amtChocolate);
//		
//
//		// add additional test code here
//		
//		assertEquals(-2,fixture.getAmtChocolate());
//		
//	}

	/**
	 * Run the void setAmtCoffee(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/19/18 5:21 PM
	 */
	@Test
	public void testSetAmtCoffee_1()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		int amtCoffee = 0;

		fixture.setAmtCoffee(amtCoffee);

		int result = fixture.getAmtCoffee();
		// add additional test code here
		assertEquals(0,result);
	}

	/**
	 * Run the void setAmtCoffee(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/19/18 5:21 PM
	 */
	@Test
	public void testSetAmtCoffee_2()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		int amtCoffee = 1;

		fixture.setAmtCoffee(amtCoffee);
		int result = fixture.getAmtCoffee();
		// add additional test code here
		assertEquals(1,result);
		
	}
	
	@Test
	public void testSetAmtCoffee_3()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		int amtCoffee = -1;

		fixture.setAmtCoffee(amtCoffee);
		int result = fixture.getAmtCoffee();
		// add additional test code here
		assertEquals(-1,result);
		
	}
	

	/**
	 * Run the void setAmtMilk(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/19/18 5:21 PM
	 */
	@Test
	public void testSetAmtMilk_1()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		int amtMilk = 0;

		fixture.setAmtMilk(amtMilk);

		// add additional test code here
		assertEquals(0,fixture.getAmtMilk());
	}

	/**
	 * Run the void setAmtMilk(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/19/18 5:21 PM
	 */
	@Test
	public void testSetAmtMilk_2()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		int amtMilk = 1;

		fixture.setAmtMilk(amtMilk);

		// add additional test code here
		assertEquals(1,fixture.getAmtMilk());
	}
	
	@Test
	public void testSetAmtMilk_3()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		int amtMilk = -1;

		fixture.setAmtMilk(amtMilk);

		// add additional test code here
		assertEquals(-1,fixture.getAmtMilk());
	}

	/**
	 * Run the void setAmtSugar(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/19/18 5:21 PM
	 */
	@Test
	public void testSetAmtSugar_1()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		int amtSugar = 1;

		fixture.setAmtSugar(amtSugar);

		// add additional test code here
		
		assertEquals(1,fixture.getAmtSugar());
	}

	/**
	 * Run the void setAmtSugar(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/19/18 5:21 PM
	 */
	@Test
	public void testSetAmtSugar_2()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		int amtSugar = 0;

		fixture.setAmtSugar(amtSugar);

		// add additional test code here
		assertEquals(0,fixture.getAmtSugar());
	}
	
	@Test
	public void testSetAmtSugar_3()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		int amtSugar = -1;

		fixture.setAmtSugar(amtSugar);

		// add additional test code here
		assertEquals(-1,fixture.getAmtSugar());
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/19/18 5:21 PM
	 */
	@Test
	public void testSetName_1()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		String name = "";

		fixture.setName(name);

		// add additional test code here
		
		assertEquals("", fixture.getName());
	}

	@Test
	public void testSetName_2()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		String name = null;

		fixture.setName(name);

		// add additional test code here
		
		assertNull(fixture.getName());
	}
	/**
	 * Run the void setPrice(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/19/18 5:21 PM
	 */
	@Test
	public void testSetPrice_1()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		int price = 0;

		fixture.setPrice(price);

		// add additional test code here
		assertEquals(0,fixture.getPrice());
	}

	/**
	 * Run the void setPrice(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/19/18 5:21 PM
	 */
	@Test
	public void testSetPrice_2()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		int price = 1;

		fixture.setPrice(price);

		// add additional test code here
		assertEquals(1,fixture.getPrice());
	}
	
	@Test
	public void testSetPrice_3()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		int price = -1;

		fixture.setPrice(price);

		// add additional test code here
		assertEquals(-1,fixture.getPrice());
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/19/18 5:21 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();

		String result = fixture.toString();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 3/19/18 5:21 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 3/19/18 5:21 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}


}