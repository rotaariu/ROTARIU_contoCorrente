package org.example;

public class ContoBancario {
    private double saldo;

    public ContoBancario(double saldoIniziale) {
        this.saldo = saldoIniziale;
    }

    public double getSaldo() {
        return saldo;
    }


    public void preleva(double importo) throws SaldoInsufficienteException {
        if (importo <= 0) {
            throw new ImportoNonValidoException("L'importo del prelievo deve essere maggiore di zero.");
        }

        if (importo > saldo) {
            throw new SaldoInsufficienteException(saldo, importo);
        }

        saldo -= importo;
        IO.println("Prelievo di €%.2f effettuato con successo" + importo);
        IO.println("Saldo attuale: €" + saldo);
    }
}
