package com.expedia.lodging.controller.test;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.util.NestedServletException;

import com.expedia.lodging.connectivity.controller.HomeController;
import com.expedia.lodging.connectivity.entity.LocaleContent;
import com.expedia.lodging.connectivity.entity.Pages;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


public class HomeControllerTest extends BaseControllerMocks{

	
    @InjectMocks
    protected HomeController homeController;
    
    protected MockMvc mockMvc;
    
    
    public void setUpCondition(){
    	when(pages.findPagesByPermalink(any(String.class))).thenAnswer( new Answer<Pages>(){
			public Pages answer(InvocationOnMock invocation) throws Throwable {
				Pages p = new Pages();
				p.setId(1);
				return p;
			}
		});
    	
    	when(contentService.findByLocaleIdAndPageId(any(Integer.class), any(Integer.class)))
        .thenAnswer(new Answer<LocaleContent>(){
			public LocaleContent answer(InvocationOnMock invocation)
					throws Throwable {
				LocaleContent lc = new LocaleContent();
				lc.setTitle("test title");
				return lc;
			}
        });
    }
    
    @Before
    public void setup() {
    	BaseControllerMocks bm = new BaseControllerMocks();
    	MockitoAnnotations.initMocks(bm);
        MockitoAnnotations.initMocks(this);     
        this.mockMvc = MockMvcBuilders.standaloneSetup(homeController).build();
    }

	@Test
	public void testHome() throws Exception {	
		
		when(pages.findPagesByPermalink(any(String.class))).thenAnswer( new Answer<Pages>(){
			public Pages answer(InvocationOnMock invocation) throws Throwable {
				Pages p = new Pages();
				p.setNav_link_text("link text");
				p.setId(1);
				return p;
			}
		});
		

		when(contentService.findByLocaleIdAndPageId(any(Integer.class), any(Integer.class)))
        .thenAnswer(new Answer<LocaleContent>(){
			public LocaleContent answer(InvocationOnMock invocation)
					throws Throwable {
				LocaleContent lc = new LocaleContent();
				lc.setTitle("test title");
				lc.setContent("Test content");
				return lc;
			}
        });

		
		this.mockMvc.perform(get("/content/home")
	            .param("localeCode", "en"))
	            .andExpect(status().isOk())
	            .andExpect(model().attributeExists("content"))
	            .andExpect(model().attributeExists("locales"))
	            .andExpect(model().attributeExists("title"));
	}

    @Test
    public void testHomeDefaultParam() throws Exception {
    	setUpCondition();
        this.mockMvc.perform(get("/content/home"))
                .andExpect(status().isOk())
                .andExpect(model().attributeExists("title")).andExpect(model().attributeExists("locales"));
    }

    @Test(expected = NestedServletException.class)
    public void testHomeRuntimeException() throws Exception {

        when(cache.getlocaleId("test")).thenThrow(new RuntimeException("For Testing"));

        this.mockMvc.perform(get("/content/home").param("localeCode", "test")).andExpect(status().is5xxServerError());
    }
	
}
