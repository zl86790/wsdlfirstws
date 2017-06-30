package name.lizhe.service;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

public class Client {
	public static void main(String args[]){
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setAddress("http://localhost:8888/cxf/ws?wsdl");
		factory.setServiceClass(HelloWorld.class);
		HelloWorld service = (HelloWorld)factory.create();
		
		Student stu = new Student();
        stu.setName("name.lizhe");
        stu.setAge(20);
        stu.setNumber("200412094");
		
		String result = service.speak(stu);
		System.out.println(result);
	}
}
