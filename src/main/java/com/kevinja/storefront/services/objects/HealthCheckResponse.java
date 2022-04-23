package com.kevinja.storefront.services.objects;

import java.util.ArrayList;
import java.util.List;

public class HealthCheckResponse {

    private List<HealthCheckMessage> messages;

    public HealthCheckResponse() {

    }

    public List<HealthCheckMessage> getMessages() {
        return messages;
    }

    public boolean isSuccess() {
        if (messages != null) {
            for (HealthCheckMessage message : messages) {
                if (message.severity().getValue() >= Severity.ERROR.getValue()) {
                    return false;
                }
            }
        }
        return true;
    }

    public HealthCheckResponse addMessage(HealthCheckMessage message) {
        if (this.messages == null) {
            this.messages = new ArrayList<>();
        }
        this.messages.add(message);

        return this;
    }

    public HealthCheckResponse addMessages(List<HealthCheckMessage> messages) {
        if (this.messages == null) {
            this.messages = new ArrayList<>();
        }
        this.messages.addAll(messages);

        return this;
    }
}