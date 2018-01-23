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
 * @date 2017��12��5�� ����2:12:27 
 * @Description: TODO(��һ�仰�������ļ���ʲô)
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
		/*//��ȡ��������Ի�������һ�ַ�����ȡ��ȡ����ͷ�ķ�����
		String header = request.getHeader("Accept-Language");
		//Ȼ��if�ж�header���Ƿ�����������Ի���
		 */
	    //�ڶ��ַ��������ṩ������ȡ���Ի�������
		Enumeration<Locale> locales = request.getLocales();
		//��������������е����Ի���
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
