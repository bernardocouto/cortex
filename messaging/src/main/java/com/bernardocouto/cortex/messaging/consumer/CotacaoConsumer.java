package com.bernardocouto.cortex.messaging.consumer;

import org.springframework.cloud.aws.messaging.listener.SqsMessageDeletionPolicy;
import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class CotacaoConsumer {

     @SqsListener(deletionPolicy = SqsMessageDeletionPolicy.ON_SUCCESS, value = "${aws.sqs.queue.name}")
    public void receiveMessage(@Payload final String message) { }

}
