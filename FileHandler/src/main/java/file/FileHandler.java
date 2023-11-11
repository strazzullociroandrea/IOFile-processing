package main.java.file; /**
 *
 * @author Strazzullo Ciro Andrea
 * @version 2.0
 * @date 01/11/2023
 *
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
public class FileHandler {

    /**
     * Metodo  per leggere il contenuto di un main.java.file
     *
     * @param url path del main.java.file da leggere
     * @return main.java.file letto
     * @throws ReadException eccezione lanciata in caso di errore nella lettura del main.java.file
     */
    public static String leggiDaFile(String url) throws ReadException {
        String total = "";
        try( FileReader f = new FileReader(url);BufferedReader fIN = new BufferedReader(f);){
            String s = "";
            while(( s = fIN.readLine()) != null){
                total += s +"\n";
            }
            return total;
        }catch(Exception e){
            throw new ReadException();
        }
    }

    /**
     * Metodo per generare il main.java.file in una posizione con un contenuto
     *
     * @param path path per raggiungere il main.java.file o per sovrascrivere il main.java.file con lo stesso nome nella stessa posizione specificata nella url
     * @param testo testo da inserire nel main.java.file
     * @throws DownloadException eccezione lanciata nel caso in cui la scrittura non avviene
     */
    public static void generaFile(String path,String testo) throws DownloadException {
        try( FileWriter f = new FileWriter(path);PrintWriter fOUT = new PrintWriter(f);) {
            fOUT.println(testo);
            fOUT.flush();
        }catch(Exception e){
            throw new DownloadException();
        }
    }
}