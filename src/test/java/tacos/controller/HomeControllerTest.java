package tacos.controller;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import tacos.HomeController;

@RunWith(SpringRunner.class)
//@WebMvcTest(HomeController.class)						//Web test for HomeController
public class HomeControllerTest {
	
	/*
	 * @Autowired private MockMvc mockMvc; //Injects MockMvc
	 * 
	 * @Test public void testHomePage() throws Exception{ mockMvc.perform(get("/"))
	 * //Perform a GET to '/' .andExpect(status().isOk()) //Expects HTTP 200
	 * .andExpect(view().name("home")) //Expects home view
	 * .andExpect(content().string( //Expects 'Welcome to...'
	 * containsString("Welcome to..."))); }
	 */
}
