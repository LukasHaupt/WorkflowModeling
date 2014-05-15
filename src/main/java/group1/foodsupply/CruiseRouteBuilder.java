package main.java.group1.foodsupply;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.spring.Main;

/**
 * A Camel Java DSL Router
 */
public class CruiseRouteBuilder extends RouteBuilder {
	
	public static void main(String[] args) throws Exception {
        new Main().run(args);
    }
	
    public void configure() {
    	System.out.println("configuration");
        from("file:src/data?noop=true").bean(new Test()).to("file:src/target");
    }
}
