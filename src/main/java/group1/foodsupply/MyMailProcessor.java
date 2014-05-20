package main.java.group1.foodsupply;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class MyMailProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		System.out.println(exchange.getIn().toString());
	}

}
