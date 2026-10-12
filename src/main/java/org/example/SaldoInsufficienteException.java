package org.example;

public class SaldoInsufficienteException extends Exception {
    double saldoAttuale;
    double importoRichiesto;

    public SaldoInsufficienteException(double saldoAttuale, double importoRichiesto) {
        super("Saldo insufficiente, l'importo richiesto è di €" + importoRichiesto + ", ma il saldo è solo di€" + saldoAttuale);
        this.saldoAttuale = saldoAttuale;
        this.importoRichiesto = importoRichiesto;
    }

    public double getSaldoAttuale() {
        return saldoAttuale;
    }

    public double getImportoRichiesto() {
        return importoRichiesto;
    }

    public double getDeficit() {
        return importoRichiesto - saldoAttuale;
    }
}
