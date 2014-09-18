package com.expedia.lodging.connectivity.service.test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.expedia.lodging.connectivity.entity.Pages;
import com.expedia.lodging.connectivity.repository.IPages;
import com.expedia.lodging.connectivity.service.IPagesService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:app-test.xml" })
public class PagesServiceTest {

	@Autowired
	private IPages pages;

	@Autowired
	private IPagesService service;

	@Test
	public void testFindPagesByPermalink() {
		Pages p = null;
		when(pages.findPagesByPermalink("/content/home")).thenAnswer(new Answer<Pages>() {
			public Pages answer(InvocationOnMock invocation) throws Throwable {
				Pages p = new Pages();
				p.setId(1);
				return p;
			}
		});

		p = service.findPagesByPermalink("test");
		assertNull(p);
		assertTrue(p == null);
	}
}
