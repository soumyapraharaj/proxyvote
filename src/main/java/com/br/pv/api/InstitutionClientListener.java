package com.br.pv.api;

import java.util.List;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.br.pv.model.InstitutionClient;

@Component
public class InstitutionClientListener{
	
    @KafkaListener(id = "foo", topics = "instclientid-feed-topic")
    public void listen(List<InstitutionClient> data) {
        System.out.println(" recived from topic" +data);
    }


}
