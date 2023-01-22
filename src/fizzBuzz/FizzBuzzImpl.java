package fizzBuzz;

import java.util.stream.IntStream;

/**
 * Implémentation de FizzBuzz
 */
public class FizzBuzzImpl implements FizzBuzz{

    /**
     * "Fizz"
     */
    private String fizz;

    /**
     * "Buzz"
     */
    private String buzz;

    /**
     * Multiple de 3
     */
    private final Integer fizzMultiple = 3;

    /**
     * Multiple de 5
     */
    private final Integer buzzMultiple = 5;

    /**
     * Constructeur de FizzBuzz
     */
    public FizzBuzzImpl(){
        this.fizz = "Fizz";
        this.buzz = "Buzz";

    }

    /**
     * Retourner Fizz
     * @return String fizz
     */
    @Override
    public String getFizz() {
        return fizz;
    }

    /**
     * Retourner Buzz
     * @return String buzz
     */
    @Override
    public String getBuzz() {
        return buzz;
    }


    /**
     * Retourner FizzBuzz
     * @param nombre
     * @return String
     */
    @Override
    public String print(Integer nombre){

        // Si multiple de 3 et de 5;
        if (estMultiple(nombre,fizzMultiple) && estMultiple(nombre, buzzMultiple)){
            return getFizz() + getBuzz();
        }

        // Si multiple de 3;
        if (estMultiple(nombre, fizzMultiple)){
            return getFizz();
        }

        // Si multiple de 5;
        if (estMultiple(nombre, buzzMultiple)){
            return getBuzz();
        }

        return nombre.toString();
    }

    /**
     * Vérifier si nombre est un multiple de multiple
     * @param nombre
     * @param multiple
     * @return boolean
     */
    private boolean estMultiple(Integer nombre, Integer multiple){
        return nombre % multiple == 0;
    }

    /**
     * Afficher les nombres de 1 à 100
     */
    @Override
    public void printAll(){
        IntStream.rangeClosed(1, 100).forEach(i -> System.out.println(print(i)));
    }
}
