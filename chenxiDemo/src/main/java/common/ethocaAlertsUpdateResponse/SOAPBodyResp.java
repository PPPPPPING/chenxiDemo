package common.ethocaAlertsUpdateResponse;

import lombok.Data;

import javax.xml.bind.annotation.*;

/**
 * @Author xi.chen
 * @Date 2024/6/12 19:06
 * @Description
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Body", namespace = "http://schemas.xmlsoap.org/soap/envelope/")
@XmlType(propOrder = {"Ethoca360AlertsUpdateResponse"})
public class SOAPBodyResp {

    @XmlElement(name = "Ethoca360AlertsUpdateResponse", namespace = "http://schemas.ethoca.com/E360v1/xml")
    private Ethoca360AlertsUpdateResponse Ethoca360AlertsUpdateResponse;
}
