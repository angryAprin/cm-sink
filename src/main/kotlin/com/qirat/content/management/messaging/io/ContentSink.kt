package com.qirat.content.management.messaging.io

import com.qirat.content.management.utils.models.ContentStoreObject
import org.springframework.cloud.stream.annotation.EnableBinding
import org.springframework.cloud.stream.annotation.StreamListener
import org.springframework.cloud.stream.messaging.Sink
import org.springframework.integration.annotation.MessageEndpoint

/**
 *
 * @author Tauriq Behardien
 */
@MessageEndpoint
@EnableBinding(Sink::class)
class ContentSink {
    @StreamListener(Sink.INPUT)
    fun saveContent(contentObject: ContentStoreObject) {
        // save content object
        println(String.format("Saving object: %s", contentObject.toString()))
    }
}