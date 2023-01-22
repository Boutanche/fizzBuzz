package test;

import fizzBuzz.FizzBuzzImpl;
import fizzBuzz.FizzBuzz;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.*;

/**
 * Classe de test de FizzBuzz
 */
public class FizzBuzzTest {

    /**
     * Test du constructeur de FizzBuzz
     */
    @Test
    public void doitRetournerUnObjetFizzBuzzALaConstruction(){
        FizzBuzz fizzBuzz = new FizzBuzzImpl();
        assertNotNull(fizzBuzz);
        assertEquals(fizzBuzz.getFizz(),"Fizz");
        assertEquals(fizzBuzz.getBuzz(),"Buzz");
    }

    /**
     * Test quand nombre n'est ni un multiple de trois ni de cinq
     */
    @Test
    public void doitRetournerLeNombreQuandIlEstPasMultipleTroisNiCinq(){
        //Arrange
        FizzBuzz fizzBuzz = new FizzBuzzImpl();
        Integer nombre = 1;

        //Act
        String resultat = fizzBuzz.print(nombre);

        //Assert
        assertEquals("1", resultat);
    }

    @Test
    public void doitRetournerFizzQuandNombreMultipleDeTrois(){
        //Arrange
        FizzBuzz fizzBuzz = new FizzBuzzImpl();
        Integer nombre = 3;

        //Act
        String resultat = fizzBuzz.print(nombre);

        //Assert
        assertEquals("Fizz", resultat);
    }

    /**
     * Test quand nombre est un multiple de cinq
     */
    @Test
    public void doitRetournerBuzzQuandNombreMultipleDeCinq(){
        //Arrange
        FizzBuzz fizzBuzz = new FizzBuzzImpl();
        Integer nombre = 5;

        //Act
        String resultat = fizzBuzz.print(nombre);

        //Assert
        assertEquals("Buzz", resultat);
    }

    /**
     * Test quand nombre est un multiple de trois et de cinq
     */
    @Test
    public void doitRetournerFizzBuzzQuandNombreMultipleDeTroisEtCinq(){
        //Arrange
        FizzBuzz fizzBuzz = new FizzBuzzImpl();
        Integer nombre = 15;

        //Act
        String resultat = fizzBuzz.print(nombre);

        //Assert
        assertEquals("FizzBuzz", resultat);
    }

    @Test
    public void printAll(){
        FizzBuzz fizzBuzz = new FizzBuzzImpl();
        fizzBuzz.printAll();
    }
}