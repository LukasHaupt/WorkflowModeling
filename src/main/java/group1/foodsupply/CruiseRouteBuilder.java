package main.java.group1.foodsupply;

import org.apache.camel.builder.RouteBuilder;

/**
 * A Camel Java DSL Router
 */
public class CruiseRouteBuilder extends RouteBuilder {
 
    /**
     * Let's configure the Camel routing rules using Java code...
     */
    public void configure() {
 
        // here is a sample which processes the input files
        // (leaving them in place - see the 'noop' flag)
        // then performs content based routing on the message using XPath
        from("file:src/data?noop=true")
            .choice()
                .when(xpath("/person/city = &#39;London&#39;"))
                    .to("file:target/messages/uk")
                .otherwise()
                    .to("file:target/messages/others");
    }
}