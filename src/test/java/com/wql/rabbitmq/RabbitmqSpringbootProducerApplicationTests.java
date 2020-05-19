package com.wql.rabbitmq;

import com.wql.rabbitmq.producer.MyProducer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class RabbitmqSpringbootProducerApplicationTests {

	@Autowired
	MyProducer myProducer;
	@Test
	public void contextLoads() {
		myProducer.send();
	}

}
