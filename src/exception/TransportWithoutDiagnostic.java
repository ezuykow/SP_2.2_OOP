package exception;

public class TransportWithoutDiagnostic extends RuntimeException{

    public TransportWithoutDiagnostic() {
        super();
    }

    public TransportWithoutDiagnostic(String message) {
        super(message);
    }
}
