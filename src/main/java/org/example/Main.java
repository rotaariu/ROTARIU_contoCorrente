import org.example.ContoBancario;
import org.example.SaldoInsufficienteException;
import org.example.ImportoNonValidoException;

void main() throws SaldoInsufficienteException {
    ContoBancario conto = new ContoBancario(1000);

    IO.println("scenario 1:");
    try {
        IO.println("saldo: €1000, importo richiesto: €1500");
        conto.preleva(1500);
    }
    catch(SaldoInsufficienteException e) {
        IO.println("ERRORE: " + e.getMessage());
        IO.println("Mancano €%.2f per effettuare il prelievo" + e.getDeficit());
    }
    finally {
        IO.println("Check finito, saldo attuale: €%.2f" + conto.getSaldo());
    }

    IO.println("\nscenario 2:");
    try {
        IO.println("importo richiesto: €-500");
        conto.preleva(-500);
    } catch (ImportoNonValidoException e) {
        IO.println("ERRORE: " + e.getMessage());
    }

    IO.println("\nscenario 3:");
    try {
        IO.println("saldo: €1000, importo richiesto: €500");
        conto.preleva(500.0);
    } catch (SaldoInsufficienteException e) {
        IO.println("ERRORE: " + e.getMessage());
    }
}

