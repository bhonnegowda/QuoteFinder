package com.quote.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.springframework.stereotype.Controller;

@Path("/quote")
@Controller
public class QuoteController {
	
	@GET
	public void testQuote() {
		
	}
}
