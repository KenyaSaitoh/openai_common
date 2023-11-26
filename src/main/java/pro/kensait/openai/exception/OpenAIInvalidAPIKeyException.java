package pro.kensait.openai.exception;

import pro.kensait.openai.api.ClientErrorBody;

public class OpenAIInvalidAPIKeyException extends OpenAIClientException {
    private ClientErrorBody clientErrorBody;
    
    public OpenAIInvalidAPIKeyException() {
        super();
    }

    public OpenAIInvalidAPIKeyException(String message, Throwable cause,
            boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public OpenAIInvalidAPIKeyException(String message, Throwable cause) {
        super(message, cause);
    }

    public OpenAIInvalidAPIKeyException(String message) {
        super(message);
    }

    public OpenAIInvalidAPIKeyException(Throwable cause) {
        super(cause);
    }

    public OpenAIInvalidAPIKeyException(ClientErrorBody clientErrorBody) {
        this.clientErrorBody = clientErrorBody;
    }

    public ClientErrorBody getClientErrorBody() {
        return clientErrorBody;
    }
}