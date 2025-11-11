/**
 * Thread che gestisce l'installazione di cerniere, ruote e maniglie.
 * Questa classe estende Thread e implementa la fase di montaggio
 * di tutti i componenti accessori della valigia.
 *
 * @author Rossi Tommaso
 * @version 1.0
 * @since 2025-11-11
 */
class InstallatoreCerniere extends Thread {

    /**
     * Metodo run che esegue le operazioni di installazione dei componenti.
     * Simula il processo di montaggio di cerniere, ruote e maniglia telescopica.
     */
    @Override
    public void run() {
        try {
            System.out.println("[THREAD INSTALLATORE] Inizio installazione componenti...");
            System.out.println("[THREAD INSTALLATORE] Montaggio cerniere e chiusure di sicurezza...");
            Thread.sleep(600);

            System.out.println("[THREAD INSTALLATORE] Applicazione ruote girevoli 360°...");
            Thread.sleep(500);

            System.out.println("[THREAD INSTALLATORE] Installazione maniglia telescopica regolabile...");
            Thread.sleep(400);

            System.out.println("[THREAD INSTALLATORE] ✓ Tutti i componenti installati correttamente!");

        } catch (InterruptedException e) {
            System.err.println("Errore nel thread installatore: " + e.getMessage());
        }
    }
}