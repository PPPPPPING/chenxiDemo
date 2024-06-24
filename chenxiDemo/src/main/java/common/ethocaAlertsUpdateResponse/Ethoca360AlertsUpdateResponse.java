package common.ethocaAlertsUpdateResponse;

import lombok.Data;

import javax.xml.bind.annotation.*;

/**
 * @Author xi.chen
 * @Date 2024/6/12 19:07
 * @Description
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Ethoca360AlertsUpdateResponse", namespace = "http://schemas.ethoca.com/E360v1/xml")
@XmlType(propOrder = {"majorCode", "AlertUpdateResponses", "Errors"})
public class Ethoca360AlertsUpdateResponse {

    @XmlAttribute(name = "majorCode")
    private int majorCode;

    @XmlElement(name = "AlertUpdateResponses", namespace = "http://schemas.ethoca.com/E360v1/xml")
    private AlertUpdateResponses AlertUpdateResponses;

    @XmlElement(name = "Errors", namespace = "http://schemas.ethoca.com/E360v1/xml")
    private ErrorsResp Errors;
}

