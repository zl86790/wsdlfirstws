package name.lizhe.service;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(endpointInterface="name.lizhe.service.HelloWorld",
serviceName="HelloWorldImplService",
portName="HelloWorldImplPort",
targetNamespace="http://service.lizhe.name/")
public class HelloWorldImpl implements HelloWorld {
	
	public String speak(@WebParam(name="stu") Student stu) {
		System.out.println("speak called");
		
		
		return "Hello " + stu.getName() +"/"+ stu.getAge() +"/"+ stu.getNumber();
	}
	
}