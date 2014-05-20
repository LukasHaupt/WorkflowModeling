package main.java.group1.foodsupply;

import javax.activation.MailcapCommandMap;

import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jms.JmsComponent;
import org.apache.camel.impl.DefaultCamelContext;


public final class FoodSupply {

	public FoodSupply() {

	}

	public static void main(String[] args) throws Exception  {

		CamelContext context = new DefaultCamelContext();
		
		CruiseRouteBuilder crb = new CruiseRouteBuilder();
		context.addRoutes(crb);
		
		//ProducerTemplate template = context.createProducerTemplate();
		
		context.start();
		
		Thread.sleep(1000);
		context.stop();

	}

}
