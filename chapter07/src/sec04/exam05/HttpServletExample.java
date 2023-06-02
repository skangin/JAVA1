package sec04.exam05;

public class HttpServletExample {

	public static void main(String[] args) {
		method(new LoginServlet());
		method(new FileDownloadServlet());

	}
	
	public static void method(Httpservlet servlet) {
		servlet.service();
	}

}
