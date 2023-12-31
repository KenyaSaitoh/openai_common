package pro.kensait.openai.api.exception;

import pro.kensait.openai.api.entity.ClientErrorBody;

public class OpenAIRateLimitExceededException extends OpenAIClientException {
    private ClientErrorBody clientErrorBody;
    
    public OpenAIRateLimitExceededException() {
        super();
    }

    public OpenAIRateLimitExceededException(String message, Throwable cause,
            boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public OpenAIRateLimitExceededException(String message, Throwable cause) {
        super(message, cause);
    }

    public OpenAIRateLimitExceededException(String message) {
        super(message);
    }

    public OpenAIRateLimitExceededException(Throwable cause) {
        super(cause);
    }

    public OpenAIRateLimitExceededException(ClientErrorBody clientErrorBody) {
        this.clientErrorBody = clientErrorBody;
    }

    public ClientErrorBody getClientErrorBody() {
        return clientErrorBody;
    }
}