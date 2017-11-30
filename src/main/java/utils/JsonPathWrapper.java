package utils;

import org.apache.camel.CamelContext;
import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;

public class JsonPathWrapper {
	
	
	@Produce
	private ProducerTemplate defaultProducerTemplate;
	
	@Produce(uri="dataformat:json-jackson:marshal")
	private ProducerTemplate renderJsonContent;


	public Object jsonpath(String expression,Object jsonData) {
		Object result = defaultProducerTemplate.requestBody("language:jsonpath:" + expression,jsonData);
		return renderJsonContent.requestBody(result,String.class);
	}
	
}
