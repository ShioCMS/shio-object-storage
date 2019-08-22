package com.viglet.shiohara.objectstorage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.http.converter.xml.MappingJackson2XmlHttpMessageConverter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator;

@SpringBootApplication
public class ShObjectStorageApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShObjectStorageApplication.class, args);
	}
	
	@Bean
	public MappingJackson2XmlHttpMessageConverter mappingJackson2XmlHttpMessageConverter(
	        Jackson2ObjectMapperBuilder builder) {
	    ObjectMapper mapper = builder.createXmlMapper(true).build();
	    ((XmlMapper) mapper).enable(ToXmlGenerator.Feature.WRITE_XML_DECLARATION);
	    return new MappingJackson2XmlHttpMessageConverter(mapper);
	}
}
