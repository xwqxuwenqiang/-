package solft.edu.javaweb.luanma;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

/**
 * @package: solft.edu.javaweb.luanma 
 * @Title: GetkHinfomation  
 * @author  
 * @date 2017年12月5日 下午2:12:27 
 * @Description: TODO(用一句话描述该文件做什么)
 * @version V1.0   
 */
public class GetkHinfomation extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Logger logger = Logger.getLogger(GetkHinfomation.class);

	/**
	 * 
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		logger.debug("xxxxx>doGet start...");
		response.setContentType("text/html;charset=gbk");
		request.setCharacterEncoding("gbk");
		/*//获取浏览器语言环境（第一种方法获取获取请求头的方法）
		String header = request.getHeader("Accept-Language");
		//然后if判断header中是否包含各种语言环境
		 */
	    //第二种方法利用提供方法获取语言环境集合
		Enumeration<Locale> locales = request.getLocales();
		//遍历集合输出所有的语言环境
		while (locales.hasMoreElements()) {
			Locale locale = locales.nextElement();
			logger.debug(locale);
		}
		
		logger.debug("xxxxx>doGet end...");
	}

	/**
	 * 
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		logger.debug("xxxxx>doPost start...");
		response.setContentType("text/html;charset=gbk");
		request.setCharacterEncoding("gbk");
		logger.debug("xxxxx>doPost end...");
	}

}
