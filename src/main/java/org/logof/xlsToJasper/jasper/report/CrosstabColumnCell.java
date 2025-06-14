//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2025.05.26 at 04:38:23 PM YEKT 
//


package org.logof.xlsToJasper.jasper.report;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for CrosstabColumnCell complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CrosstabColumnCell"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}cellContents"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="height" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" /&gt;
 *       &lt;attribute name="contentsPosition" default="Left"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Left"/&gt;
 *             &lt;enumeration value="Center"/&gt;
 *             &lt;enumeration value="Right"/&gt;
 *             &lt;enumeration value="Stretch"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CrosstabColumnCell", propOrder = {
    "cellContents"
})
public class CrosstabColumnCell {

    @XmlElement(required = true)
    protected CellContents cellContents;
    @XmlAttribute(name = "height", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String height;
    @XmlAttribute(name = "contentsPosition")
    protected String contentsPosition;

    /**
     * Gets the value of the cellContents property.
     * 
     * @return
     *     possible object is
     *     {@link CellContents }
     *     
     */
    public CellContents getCellContents() {
        return cellContents;
    }

    /**
     * Sets the value of the cellContents property.
     * 
     * @param value
     *     allowed object is
     *     {@link CellContents }
     *     
     */
    public void setCellContents(CellContents value) {
        this.cellContents = value;
    }

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeight(String value) {
        this.height = value;
    }

    /**
     * Gets the value of the contentsPosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentsPosition() {
        if (contentsPosition == null) {
            return "Left";
        } else {
            return contentsPosition;
        }
    }

    /**
     * Sets the value of the contentsPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentsPosition(String value) {
        this.contentsPosition = value;
    }

}
