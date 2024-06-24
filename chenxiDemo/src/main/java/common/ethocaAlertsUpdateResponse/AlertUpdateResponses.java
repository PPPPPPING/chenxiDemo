package common.ethocaAlertsUpdateResponse;

import lombok.Data;

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * @Author xi.chen
 * @Date 2024/6/12 22:37
 * @Description
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "AlertUpdateResponses", namespace = "http://schemas.ethoca.com/E360v1/xml")
@XmlType(propOrder = {"AlertUpdateResponse"})
public class AlertUpdateResponses {

    @XmlElement(name = "AlertUpdateResponse", namespace = "http://schemas.ethoca.com/E360v1/xml")
    private List<AlertUpdateResponse> AlertUpdateResponse;
}
