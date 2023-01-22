package fizzBuzz;

/**
 * Interface FizzBuzz :
 */
public interface FizzBuzz {

    /**
     *
     * @return String "Fizz"
     */
    String getFizz();

    /**
     *
     * @return String "Buzz"
     */
    String getBuzz();

    /**
     *
     * @param nombre Integer
     * @return String resultat
     */
    String print(Integer nombre);


    void printAll();
}
