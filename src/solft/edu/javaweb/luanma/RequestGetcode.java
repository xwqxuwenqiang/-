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
 * @date 2017��12��5�� ����2:12:27 
 * @Description: TODO(��һ�仰�������ļ���ʲô)
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
		//�ȸ��ݱ�ǩ��ȡ��������������
		String parameter = request.getParameter("inform");
		//��ת��iso�ֽ���
		byte[] bytes = parameter.getBytes("iso-8859-1");
		//��ת���ַ���
		 String str = new  String(bytes,"gbk");
		 logger.debug(str);
		  
		
	     
		logger.debug("xxxxx>doGet end...");
	}

	
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		logger.debug("xxxxx>doPost start...");
		response.setContentType("text/html;charset=gbk");
		/*//post�����������ַ�ʽ��һ�ֺ�get��ͬ
		String parameter = request.getParameter("inform02");
		byte[] bytes = parameter.getBytes("iso-8859-1");
		     String str02 = new String(bytes,"gbk");
		     logger.debug(str02);*/
		     //�ڶ��ַ�ʽֻ���post��ʽ
		request.setCharacterEncoding("gbk");
		String parameter = request.getParameter("inform02");
		logger.debug(parameter);
		
		logger.debug("xxxxx>doPost end...");
	}

}