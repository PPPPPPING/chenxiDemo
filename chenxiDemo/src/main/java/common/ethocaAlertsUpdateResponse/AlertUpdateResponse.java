package common.ethocaAlertsUpdateResponse;

import lombok.Data;

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * @Author xi.chen
 * @Date 2024/6/12 19:08
 * @Description
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "AlertUpdateResponse", namespace = "http://schemas.ethoca.com/E360v1/xml")
@XmlType(propOrder = {"ethocaID", "status", "errors"})
public class AlertUpdateResponse {

    @XmlAttribute(name = "ethocaID")
    private String ethocaID;

    @XmlAttribute(name = "status")
    private String status;

    @XmlElement(name = "errors", namespace = "http://schemas.ethoca.com/E360v1/xml")
    private List<Error> errors;
}
