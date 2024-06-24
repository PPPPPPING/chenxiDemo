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
@XmlRootElement(name = "Envelope", namespace = "http://schemas.xmlsoap.org/soap/envelope/")
@XmlType(propOrder = {"Body"})
public class SOAPEnevlopeResp {

    @XmlElement(name = "Body", namespace = "http://schemas.xmlsoap.org/soap/envelope/")
    private SOAPBodyResp Body;
}

