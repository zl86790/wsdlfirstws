package name.lizhe.service;

import javax.xml.namespace.QName;

import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

public class MyCXFServer {
	public static void main(String[] args) {
		JaxWsServerFactoryBean svrFactory = new JaxWsServerFactoryBean();
		
		svrFactory.setAddress("http://localhost:8888/cxf/ws");
		svrFactory.setServiceClass(HelloWorld.class);
		svrFactory.setServiceBean(new HelloWorldImpl());
		
		//必须显示定义WsdlLocation和ServiceName才能基于契约优先来发布webservice
		svrFactory.setWsdlLocation("C:/DEV/workspace_angularjs/wsdlfirstws/src/main/resources/wsdl/HelloWorld.wsdl");
		svrFactory.setServiceName(new QName("http://service.lizhe.name/", "HelloWorldImplService"));
		
		//开启服务
		svrFactory.create();
	}
}