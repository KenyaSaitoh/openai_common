package pro.kensait.openai.api.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Choice {
    @JsonProperty(value = "index")
    private Integer index;

    @JsonProperty(value = "message")
    private Message message;

    @JsonProperty(value = "finish_reason")
    private String finishReason;

    @JsonProperty(value = "logprobs")
    private String logprobs;

    public Choice() {
    }

    public Choice(Integer index, Message message, String finishReason, String logprobs) {
        this.index = index;
        this.message = message;
        this.finishReason = finishReason;
        this.logprobs = logprobs;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public String getFinishReason() {
        return finishReason;
    }

    public void setFinishReason(String finishReason) {
        this.finishReason = finishReason;
    }

    public String getLogprobs() {
        return logprobs;
    }

    public void setLogprobs(String logprobs) {
        this.logprobs = logprobs;
    }

    @Override
    public String toString() {
        return "Choice [index=" + index + ", message=" + message + ", finishReason=" + finishReason
                + ", logprobs=" + logprobs + "]";
    }
}