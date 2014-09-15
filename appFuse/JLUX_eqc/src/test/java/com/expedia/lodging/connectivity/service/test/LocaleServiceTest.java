package com.expedia.lodging.connectivity.service.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.expedia.lodging.connectivity.entity.EQCLocale;
import com.expedia.lodging.connectivity.repository.IEQCLocale;
import com.expedia.lodging.connectivity.service.interf.ILocaleService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:app-test.xml"})
public class LocaleServiceTest {

	@Autowired
    private IEQCLocale eqclocale;
    
	@Autowired
    private ILocaleService service;

    @Test
    public void testSaveForm() {
        when(eqclocale.findByLocaleCode("en")).thenAnswer(new Answer<EQCLocale>() {
                    public EQCLocale answer(InvocationOnMock invocation) throws Throwable {
                    	EQCLocale eqc = new EQCLocale();     
                    	eqc.setId(1);
                    	eqc.setLang_id(1);
                    	eqc.setName("");
                        return eqc;
                    }
                });
        
        EQCLocale l = service.getLocalebyCode("en");
        assertNotNull(l.getId());
        assertEquals(l.getName(),"");
    }

}
