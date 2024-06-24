package common.ethocaAlertsUpdateResponse;

import lombok.Data;

import javax.xml.bind.annotation.*;

/**
 * @Author xi.chen
 * @Date 2024/6/12 19:27
 * @Description
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Error", namespace = "http://schemas.ethoca.com/E360v1/xml")
@XmlType(propOrder = {"code"})
public class ErrorResp {

    @XmlAttribute(name = "code")
    private int code;
}
