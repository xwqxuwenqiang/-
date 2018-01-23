package solft.edu.javaweb.luanma;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

/**
 * @package: solft.edu.javaweb.luanma 
 * @Title: RequestGetcode  
 * @author  
 * @date 2017年12月5日 下午2:12:27 
 * @Description: TODO(用一句话描述该文件做什么)
 * @version V1.0   
 */
public class RequestGetcode extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Logger logger = Logger.getLogger(RequestGetcode.class);

	/**
	 * 
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		logger.debug("xxxxx>doGet start...");
		response.setContentType("text/html;charset=gbk");
		request.setCharacterEncoding("gbk");
		//先根据标签获取输入框里面的内容
		String parameter = request.getParameter("inform");
		//先转成iso字节码
		byte[] bytes = parameter.getBytes("iso-8859-1");
		//再转成字符串
		 String str = new  String(bytes,"gbk");
		 logger.debug(str);
		  
		
	     
		logger.debug("xxxxx>doGet end...");
	}

	
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		logger.debug("xxxxx>doPost start...");
		response.setContentType("text/html;charset=gbk");
		/*//post处理乱码两种方式第一种和get相同
		String parameter = request.getParameter("inform02");
		byte[] bytes = parameter.getBytes("iso-8859-1");
		     String str02 = new String(bytes,"gbk");
		     logger.debug(str02);*/
		     //第二种方式只针对post方式
		request.setCharacterEncoding("gbk");
		String parameter = request.getParameter("inform02");
		logger.debug(parameter);
		
		logger.debug("xxxxx>doPost end...");
	}

}