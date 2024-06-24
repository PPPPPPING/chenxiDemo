package common.ethocaAlertsUpdateResponse;

import lombok.Data;

import javax.xml.bind.annotation.*;

/**
 * @Author xi.chen
 * @Date 2024/6/13 00:21
 * @Description
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Errors", namespace = "http://schemas.ethoca.com/E360v1/xml")
@XmlType(propOrder = {"Error"})
public class ErrorsResp {

    @XmlElement(name = "Error", namespace = "http://schemas.ethoca.com/E360v1/xml")
    private ErrorResp Error;
}
