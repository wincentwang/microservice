package wang.wincent.microservice.node1.config;

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
	public static class A{
		private String username;
		private String password;
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
	}
	
	public static void main(String[] args){
		int a = "a".hashCode();
		int b = "bbbbbbbbb".hashCode();
		A aa=new A();
		int hashCode = aa.hashCode();
		System.out.println(a%3);
		System.out.println(b%3);
		System.out.println(hashCode%3);
	}
	
	
	
}
