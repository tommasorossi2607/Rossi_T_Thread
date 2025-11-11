/**
 * Thread che gestisce l'assemblaggio della struttura della valigia.
 * Questa classe estende Thread e implementa la fase di costruzione
 * del telaio rigido e dei rinforzi interni.
 *
 * @author Rossi Tommaso
 * @version 1.0
 * @since 2025-11-11
 */
class AssemblatoreStruttura extends Thread {

    /**
     * Metodo run che esegue le operazioni di assemblaggio della struttura.
     * Simula il processo di taglio e assemblaggio del telaio rigido
     * con inserimento dei rinforzi interni.
     */
    @Override
    public void run() {
        try {
            System.out.println("[THREAD ASSEMBLATORE] Inizio assemblaggio struttura valigia...");
            System.out.println("[THREAD ASSEMBLATORE] Taglio e sagomatura pannelli rigidi in corso...");
            Thread.sleep(800);