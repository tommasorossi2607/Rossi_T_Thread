# Progetto Thread - Produzione Valigie 

## 1. Descrizione del Progetto
Questo progetto Java implementa un sistema semplificato di produzione industriale di valigie utilizzando la programmazione concorrente con thread. Il processo di produzione è diviso in più fasi che vengono eseguite in parallelo per ottimizzare i tempi di realizzazione.

## 2. Obiettivi del Progetto
- Implementare la gestione di thread in Java
- Simulare processi industriali paralleli
- Utilizzare correttamente i metodi `sleep()` e `join()`
- Coordinare l'esecuzione di thread padre e thread figli
- Dimostrare la comunicazione tra thread tramite output su console

## 3. Struttura del Progetto
Il progetto è composto da tre classi principali:

- **GestoreProduzioneValigie**: Classe principale (processo padre) che coordina l'intero processo di produzione
- **AssemblatoreStruttura**: Thread che gestisce l'assemblaggio della struttura rigida della valigia
- **InstallatoreCerniere**: Thread che gestisce l'installazione di cerniere, ruote e maniglie

## 4. Funzionalità Implementate
### Processo di Produzione
1. **Assemblaggio Struttura** (Thread parallelo)
   - Taglio e assemblaggio del telaio rigido
   - Inserimento dei rinforzi interni
   - Tempo di esecuzione simulato: 2000ms

2. **Installazione Componenti** (Thread parallelo)
   - Montaggio cerniere e chiusure
   - Applicazione ruote girevoli
   - Installazione maniglia telescopica
   - Tempo di esecuzione simulato: 1500ms

3. **Controllo Qualità** (Processo padre)
   - Verifica finale dopo il completamento dei thread
   - Controllo della qualità del prodotto finito

## 5. Tecnologie e Concetti Utilizzati
- **Linguaggio**: Java
- **Concetti**: 
  - Thread e programmazione concorrente
  - Metodo `Thread.sleep()` per simulare tempistiche di produzione
  - Metodo `Thread.join()` per sincronizzare i thread
  - Ereditarietà con estensione della classe `Thread`
  - Gestione delle eccezioni (`InterruptedException`)

## 6. Istruzioni per l'Esecuzione
### Prerequisiti
- Java JDK 8 o superiore
- IDE Java (IntelliJ IDEA, Eclipse, NetBeans)

### Compilazione ed Esecuzione
```bash
# Compilazione
javac GestoreProduzioneValigie.java AssemblatoreStruttura.java InstallatoreCerniere.java

# Esecuzione
java GestoreProduzioneValigie
```

### Output Atteso
Il programma stamperà a console le varie fasi della produzione, mostrando l'esecuzione parallela dei thread e il completamento ordinato del processo di produzione.
```bash
[PROCESSO PADRE] Avvio thread di assemblaggio e installazione...

[THREAD ASSEMBLATORE] Inizio assemblaggio struttura valigia...
[THREAD ASSEMBLATORE] Taglio e sagomatura pannelli rigidi in corso...
[THREAD INSTALLATORE] Inizio installazione componenti...
[THREAD INSTALLATORE] Montaggio cerniere e chiusure di sicurezza...
[THREAD INSTALLATORE] Applicazione ruote girevoli 360°...
[THREAD ASSEMBLATORE] Assemblaggio telaio principale...
[THREAD INSTALLATORE] Installazione maniglia telescopica regolabile...
[THREAD ASSEMBLATORE] Inserimento rinforzi interni e angolari...
[THREAD INSTALLATORE] ✓ Tutti i componenti installati correttamente!
[THREAD ASSEMBLATORE] ✓ Struttura completata!

[PROCESSO PADRE] Tutti i thread hanno completato il lavoro.
[PROCESSO PADRE] Eseguo controllo qualità finale...
[PROCESSO PADRE] Controllo qualità superato! ✓
[PROCESSO PADRE] Valigia completata e pronta per la spedizione.

=== PRODUZIONE COMPLETATA CON SUCCESSO ===
```
---

**Autore**: Rossi Tommaso 
**Corso**: Tecnologie e Progettazione di Sistemi Informatici e Telecomunicazioni 
**Data**: Novembre 2025
