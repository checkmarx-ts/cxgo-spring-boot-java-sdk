//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-646
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2017.11.17 at 10:51:56 PM EST
//


package checkmarx.wsdl.portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSRequestScanLogFailedScan complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CxWSRequestScanLogFailedScan">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}CxWSRequestScanLog">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSRequestScanLogFailedScan", propOrder = {
    "id"
})
public class CxWSRequestScanLogFailedScan
    extends CxWSRequestScanLog
{

    @XmlElement(name = "ID")
    protected long id;

    /**
     * Gets the value of the id property.
     *
     */
    public long getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     */
    public void setID(long value) {
        this.id = value;
    }

}
