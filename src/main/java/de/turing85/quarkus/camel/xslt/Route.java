package de.turing85.quarkus.camel.xslt;

import static org.apache.camel.builder.endpoint.StaticEndpointBuilders.platformHttp;
import static org.apache.camel.builder.endpoint.StaticEndpointBuilders.xsltSaxon;

import javax.ws.rs.core.MediaType;

import org.apache.camel.builder.RouteBuilder;

@SuppressWarnings("unused")
public class Route extends RouteBuilder {
  @Override
  public void configure() {
    from(platformHttp("/hello").consumes(MediaType.APPLICATION_XML))
        .to(xsltSaxon("Transformer.xsl"));
  }
}
