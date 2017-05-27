import org.apache.axis.client.Service;

import javax.xml.namespace.QName;
import javax.xml.rpc.ParameterMode;

import org.apache.axis.client.Call;
import org.apache.axis.encoding.XMLType;


import java.net.URL;


/**
 * Created by caiwen on 2017/5/22.
 */
public class TestClient {


    public static void main(String[] args) throws Exception {
        String namespaceUri = "http://localhost:8080/services/qbwcServer";

//        String namespaceUri = "http://www.webxml.com.cn/WebServices/WeatherWebService.asmx";
        String wsdlUrl = namespaceUri + "?wsdl";

        // 创建调用对象
        Service service = new Service();
        Call call = (Call) service.createCall();


        // 调用 远程方法
//        call.setSOAPVersion(SOAPConstants.SOAP12_CONSTANTS);

        // 设置URL
        call.setTargetEndpointAddress(new URL(wsdlUrl));
//        call.setOperationName(new QName("http://WebXml.com.cn/","getSupportProvince"));
        call.setOperationName(new QName("http://localhost:8080/services/qbwcServer","authenticate"));

        call.addParameter( "strUserName" ,XMLType.XSD_STRING, ParameterMode.IN     );
        call.addParameter( "strPassword" ,XMLType.XSD_STRING, ParameterMode.IN     );
        call.addParameter( "authenticateReturn" ,XMLType.SOAP_ARRAY, ParameterMode.OUT     );

        call.setReturnType(XMLType.SOAP_ARRAY);

//        System.out.println(call.getMessageContext().getMessage().getSOAPHeader());
//        System.out.println(call.getMessageContext().getMessage().getSOAPBody());
//        System.out.println(call.getMessageContext().getMessage().getSOAPPart());
//        call.setUseSOAPAction(true);
//        call.setSOAPActionURI("http://WebXml.com.cn/getSupportProvince");


        // 执行远程调用，同时获得返回值
        String[] cities = (String[]) call.invoke(new Object[]{"caiwen","ggg"});

        for (int i = 0; i < cities.length; i++) {
            System.out.print(cities[i]);

        }

        // 打印信息
//        System.err.println(cities);
    }
}
