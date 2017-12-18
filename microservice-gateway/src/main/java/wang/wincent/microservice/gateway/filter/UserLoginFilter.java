package wang.wincent.microservice.gateway.filter;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

@Component
public class UserLoginFilter extends ZuulFilter {

	public Object run() {
		RequestContext requestContext = RequestContext.getCurrentContext();
		HttpServletRequest request = requestContext.getRequest();
		String token = request.getParameter("token");
		if(StringUtils.isEmpty(token)){
			requestContext.setSendZuulResponse(false); // 过滤该请求，不对其进行路由
			requestContext.setResponseStatusCode(401); // 设置响应状态码
			return null;
		}
		return null;
	}

	public boolean shouldFilter() {
		return true; // 该过滤器需要执行
	}

	@Override
	public int filterOrder() {
		return 0;//set the prority
	}

	@Override
	public String filterType() {
		return "pre"; // 设置过滤器类型为：pre
	}

	
}
