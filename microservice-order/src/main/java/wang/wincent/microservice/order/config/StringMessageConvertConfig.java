package wang.wincent.microservice.order.config;

import java.nio.charset.Charset;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.StringHttpMessageConverter;

/**
 * SpringMVC 消息转化器
 * @author wincent.wang
 */
@Configuration
public class StringMessageConvertConfig {

	@Bean
	public StringHttpMessageConverter StringMessageConvert(){
		StringHttpMessageConverter converter=new StringHttpMessageConverter(Charset.forName("UTF-8"));
		return converter;
	}
	
}
