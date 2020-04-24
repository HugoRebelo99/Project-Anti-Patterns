public class PessoaNotValidatedException extends Exception {
    public PessoaNotValidatedException() {
    }

    public PessoaNotValidatedException(String message) {
        super(message);
    }

    public PessoaNotValidatedException(String message, Throwable cause) {
        super(message, cause);
    }

    public PessoaNotValidatedException(Throwable cause) {
        super(cause);
    }

    public PessoaNotValidatedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
