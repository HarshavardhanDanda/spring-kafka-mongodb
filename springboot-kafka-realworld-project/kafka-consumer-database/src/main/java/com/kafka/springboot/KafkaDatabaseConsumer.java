package com.kafka.springboot;

import com.kafka.springboot.entity.Wikimedia;
import com.kafka.springboot.repository.WikimediaDataRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaDatabaseConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaDatabaseConsumer.class);

    private WikimediaDataRepository wikimediaDataRepository;

    public KafkaDatabaseConsumer(WikimediaDataRepository wikimediaDataRepository) {
        this.wikimediaDataRepository = wikimediaDataRepository;
    }

    @KafkaListener(topics= "wikimedia_recentchange", groupId = "myGroup")
    public void consume(String eventMessage){
        Wikimedia wikimedia = new Wikimedia();
        wikimedia.setWikiEventData(eventMessage);
        wikimediaDataRepository.save(wikimedia);
        LOGGER.info(String.format("Message received -> %s", eventMessage));
    }
}
