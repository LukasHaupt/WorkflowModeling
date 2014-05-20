package main.java.group1.foodsupply;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.spring.Main;

public class CruiseRouteBuilder extends RouteBuilder {
	
	public static void main(String[] args) throws Exception {
        new Main().run(args);
    }
	//test!
    public void configure() {
    	System.out.println("configuration");
        //from("file:src/data?noop=true").bean(new Test()).to("file:src/target");
    	//test:From:   test-jms:queue:test.queue
        
        from("imap://imap.gmail.com?username=brummbear1@gmail.com:993&password=t54%?Ak#").process(new MyMailProcessor());
        
        
    }
}
