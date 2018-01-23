package solft.edu.javaweb.luanma;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

/**
 * @package: solft.edu.javaweb.luanma 
 * @Title: NoGetLianJie  
 * @author  
 * @date 2017年12月5日 下午2:12:27 
 * @Description: TODO(用一句话描述该文件做什么)
 * @version V1.0   
 */
public class NoGetLianJie extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Logger logger = Logger.getLogger(NoGetLianJie.class);

	/**
	 * 
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		logger.debug("xxxxx>doGet start...");
		
		String header = request.getHeader("referer");
		
		if (header!=null&&header.contains("NoGetLianJ.html")) {
			response.setContentType("image/jpeg");
			ServletContext servletContext = this.getServletContext();
			String realPath = servletContext.getRealPath("/WEB-INF/img/Image1 (6).jpg");
			    FileInputStream fileInputStream = new FileInputStream(realPath);
			    ServletOutputStream outputStream = response.getOutputStream();
			    byte[] array=new byte[1024];
			    int length=-1;
			    while ((length=fileInputStream.read(array))!=-1) {
			    	outputStream.write(array);
					
				}
		} else {
			response.setContentType("text/html;charset=gbk");
			PrintWriter writer = response.getWriter();
			writer.write("如果想查看图片请点击<a href='/day48/NoGetLianJ.html'>这里</a>");
			
		}
		request.setCharacterEncoding("gbk");
		PrintWriter writer = response.getWriter();
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