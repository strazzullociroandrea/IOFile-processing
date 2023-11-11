/**
 *
 * @author Strazzullo Ciro Andrea
 * @version 1.0
 * @date 01/11/2023
 *
 */

package main.java.file;

public class DownloadException extends Exception{
    /**
     * Costruttore, richiama il costruttore della classe madre Exception
     */
    public DownloadException(){
        super();
    }

    /**
     * Metodo per ottenere il messaggio di errore
     * @return messaggio di errore
     */
    public String getMessage(){
        return "ERRORE: Non è stato possibile creare il main.java.file.";
    }
}
