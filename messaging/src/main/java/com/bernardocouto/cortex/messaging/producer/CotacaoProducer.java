package com.bernardocouto.cortex.messaging.producer;

import com.bernardocouto.cortex.messaging.configuration.SqsConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

@Component
public class CotacaoProducer {

    @Value("${aws.sqs.queue.name}")
    private String queueName;

    @Autowired
    private SqsConfiguration sqsConfiguration;

    public void sendMessage(final String message) {
        sqsConfiguration.queueMessagingTemplate().send(queueName, MessageBuilder.withPayload(message).build());
    }

}
