package pro.kensait.openai.api.exception;

import pro.kensait.openai.api.entity.ClientErrorBody;

public class OpenAITokenLimitOverException extends OpenAIClientException {
    private ClientErrorBody clientErrorBody;
    
    public OpenAITokenLimitOverException() {
        super();
    }

    public OpenAITokenLimitOverException(String message, Throwable cause,
            boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public OpenAITokenLimitOverException(String message, Throwable cause) {
        super(message, cause);
    }

    public OpenAITokenLimitOverException(String message) {
        super(message);
    }

    public OpenAITokenLimitOverException(Throwable cause) {
        super(cause);
    }

    public OpenAITokenLimitOverException(ClientErrorBody clientErrorBody) {
        this.clientErrorBody = clientErrorBody;
    }

    public ClientErrorBody getClientErrorBody() {
        return clientErrorBody;
    }
}