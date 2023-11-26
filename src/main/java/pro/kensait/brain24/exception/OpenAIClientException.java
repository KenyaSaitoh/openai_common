package pro.kensait.brain24.exception;

import pro.kensait.brain24.openai.ClientErrorBody;

public class OpenAIClientException extends RuntimeException {
    private ClientErrorBody clientErrorBody;

    public OpenAIClientException() {
        super();
    }

    public OpenAIClientException(String message, Throwable cause,
            boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public OpenAIClientException(String message, Throwable cause) {
        super(message, cause);
    }

    public OpenAIClientException(String message) {
        super(message);
    }

    public OpenAIClientException(Throwable cause) {
        super(cause);
    }

    public OpenAIClientException(ClientErrorBody clientErrorBody) {
        this.clientErrorBody = clientErrorBody;
    }

    public ClientErrorBody getClientErrorBody() {
        return clientErrorBody;
    }
}