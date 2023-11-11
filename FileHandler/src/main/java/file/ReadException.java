/**
 *
 * @author Strazzullo Ciro Andrea
 * @version 1.0
 * @date 01/11/2023
 *
 */
package main.java.file;


public class ReadException extends Exception{

    /**
     * Costruttore, richiama il costruttore della classe madre Exception
     */
    public ReadException(){
        super();
    }

    /**
     * Metodo per ottenere il messaggio di errore
     * @return messaggio di errore
     */
    public String getMessage(){
        return "ERRORE: Impossibile leggere il main.java.file nel path specificato";
    }
}
