/**
 * Classe principale che gestisce il processo di produzione delle valigie.
 * Questa classe rappresenta il processo padre che coordina i thread figli
 * responsabili delle diverse fasi di produzione.
 *
 * @author Rossi Tommaso
 * @version 1.0
 * @since 2025-11-11
 */
public class GestoreProduzioneValigie {

    /**
     * Metodo principale che avvia il processo di produzione.
     * Crea e avvia i thread per le diverse fasi di lavorazione,
     * attende il loro completamento e esegue il controllo finale.
     *
     * @param args Argomenti da linea di comando (non utilizzati)
     */
    public static void main(String[] args) {
        System.out.println("=== INIZIO PRODUZIONE VALIGIA ===");
        System.out.println("Avvio linea di produzione...\n");

        // Creazione dei thread per le diverse fasi di produzione
        AssemblatoreStruttura assemblatore = new AssemblatoreStruttura();
        InstallatoreCerniere installatore = new InstallatoreCerniere();

        // Avvio dei thread in parallelo
        System.out.println("[PROCESSO PADRE] Avvio thread di assemblaggio e installazione...\n");
        assemblatore.start();
        installatore.start();