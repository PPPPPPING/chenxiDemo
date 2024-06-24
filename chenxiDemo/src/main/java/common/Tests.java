package common;

import common.ethocaAlertsUpdateResponse.AlertUpdateResponse;
import common.ethocaAlertsUpdateResponse.Ethoca360AlertsUpdateResponse;
import common.ethocaAlertsUpdateResponse.SOAPEnevlopeResp;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;
import java.net.InetAddress;
import java.net.Socket;
import java.util.List;

/**
 * @Author ping
 * @Date 2023/2/8 10:20
 */
public class Tests {
    public static void main(String[] args) {
//        System.out.println(findPeakElement(new int[]{2, 3, 5, 1, 4, 2}));
//        test();


        try (Socket socket = new Socket("baidu.com", 80)) {
            InetAddress localAddress = socket.getLocalAddress();
            System.out.println("Local IP Address: " + localAddress.getHostAddress());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int findPeakElement(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] > nums[mid + 1]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static void test() {


        String soapResponse = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
                + "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\">"
                + "<soapenv:Body>"
                + "<eth:Ethoca360AlertsUpdateResponse xmlns:eth=\"http://schemas.ethoca.com/E360v1/xml\" majorCode=\"11\">"
                + "<eth:AlertUpdateResponses>"
                + "<eth:AlertUpdateResponse ethocaID=\"8B0NN8FNGGCR8DX2GMGK3PK3X\" status=\"Success\" />"
                + "<eth:AlertUpdateResponse ethocaID=\"8B0NN8FNGGCR8DX2GMGK3PK3CX\" status=\"Success\" />"
                + "</eth:AlertUpdateResponses>"
                + "</eth:Ethoca360AlertsUpdateResponse>"
                + "</soapenv:Body>"
                + "</soapenv:Envelope>";
        String soapResponse1 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
                "    <soapenv:Header/>\n" +
                "    <soapenv:Body>\n" +
                "        <eth:Ethoca360AlertsUpdateResponse xmlns:eth=\"http://schemas.ethoca.com/E360v1/xml\" majorCode=\"3\">\n" +
                "            <eth:Errors>\n" +
                "                <eth:Error code=\"690\">The requested service is not supported.</eth:Error>\n" +
                "            </eth:Errors>\n" +
                "        </eth:Ethoca360AlertsUpdateResponse>\n" +
                "    </soapenv:Body>\n" +
                "</soapenv:Envelope>";
        try {
            SOAPEnevlopeResp envelope = parseSOAPResponse(soapResponse1);
            System.out.println("envelope: " + envelope);
            Ethoca360AlertsUpdateResponse response = envelope.getBody().getEthoca360AlertsUpdateResponse();
            System.out.println("response: " + response);
            System.out.println("Major Code: " + response.getMajorCode());

            List<AlertUpdateResponse> updateResponses = response.getAlertUpdateResponses().getAlertUpdateResponse();
            for (AlertUpdateResponse updateResponse : updateResponses) {
                System.out.println("Ethoca ID: " + updateResponse.getEthocaID());
                System.out.println("Status: " + updateResponse.getStatus());
            }
        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }

    public static SOAPEnevlopeResp parseSOAPResponse(String soapResponse) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(SOAPEnevlopeResp.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        StringReader reader = new StringReader(soapResponse);
        return (SOAPEnevlopeResp) unmarshaller.unmarshal(reader);
    }
}
