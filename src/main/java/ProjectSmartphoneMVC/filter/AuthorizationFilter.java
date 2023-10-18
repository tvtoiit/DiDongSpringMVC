package ProjectSmartphoneMVC.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;




public class AuthorizationFilter implements Filter{
	private ServletContext context;
	
	@Override
	public void init(FilterConfig filterConfig)throws ServletException {
		this.context = filterConfig.getServletContext();
	}
	
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest httpServletRequest = (HttpServletRequest) request;
		HttpServletResponse httpServletResponse = (HttpServletResponse) response;
		String url = httpServletRequest.getRequestURI();
		if(url.startsWith("/ProjectSmartphoneMVC/admin/")) {
			HttpSession session = httpServletRequest.getSession(false);
			if(session.getAttribute("roleID") != null) {
				if(session.getAttribute("roleID").equals(1)) {
					chain.doFilter(request, response);
				}else {
					String urlString = "redirect:/trang-chu/";
					httpServletResponse.sendRedirect(urlString);
				}
			}else {
				String urlString = "redirect:/trang-chu/";
				httpServletResponse.sendRedirect(urlString);
			}
		}else {
			chain.doFilter(request, response);
		}
	}
	
	@Override
	public void destroy() {
		
	}

}
