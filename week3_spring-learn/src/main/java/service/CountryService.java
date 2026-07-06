package com.cognizant.springlearn.service;

import com.cognizant.springlearn.model.Country;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CountryService {

    private List<Country> countries = new ArrayList<>();

    public CountryService() {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("country.xml");

        countries.add(context.getBean("country", Country.class));

        Country us = new Country();
        us.setCode("US");
        us.setName("United States");

        Country jp = new Country();
        jp.setCode("JP");
        jp.setName("Japan");

        Country de = new Country();
        de.setCode("DE");
        de.setName("Germany");

        countries.add(us);
        countries.add(jp);
        countries.add(de);
    }

    public Country getCountry(String code) {

        for (Country country : countries) {

            if (country.getCode().equalsIgnoreCase(code)) {
                return country;
            }
        }

        return null;
    }
}