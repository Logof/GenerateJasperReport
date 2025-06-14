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
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}bucket"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}crosstabRowHeader" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}crosstabTotalRowHeader" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="width" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" /&gt;
 *       &lt;attribute name="totalPosition" default="None"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Start"/&gt;
 *             &lt;enumeration value="End"/&gt;
 *             &lt;enumeration value="None"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="headerPosition" default="Top"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Top"/&gt;
 *             &lt;enumeration value="Middle"/&gt;
 *             &lt;enumeration value="Bottom"/&gt;
 *             &lt;enumeration value="Stretch"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="mergeHeaderCells" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bucket",
    "crosstabRowHeader",
    "crosstabTotalRowHeader"
})
@XmlRootElement(name = "rowGroup")
public class RowGroup {

    @XmlElement(required = true)
    protected Bucket bucket;
    protected CrosstabRowHeader crosstabRowHeader;
    protected CrosstabTotalRowHeader crosstabTotalRowHeader;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "width", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String width;
    @XmlAttribute(name = "totalPosition")
    protected String totalPosition;
    @XmlAttribute(name = "headerPosition")
    protected String headerPosition;
    @XmlAttribute(name = "mergeHeaderCells")
    protected Boolean mergeHeaderCells;

    /**
     * Gets the value of the bucket property.
     * 
     * @return
     *     possible object is
     *     {@link Bucket }
     *     
     */
    public Bucket getBucket() {
        return bucket;
    }

    /**
     * Sets the value of the bucket property.
     * 
     * @param value
     *     allowed object is
     *     {@link Bucket }
     *     
     */
    public void setBucket(Bucket value) {
        this.bucket = value;
    }

    /**
     * Gets the value of the crosstabRowHeader property.
     * 
     * @return
     *     possible object is
     *     {@link CrosstabRowHeader }
     *     
     */
    public CrosstabRowHeader getCrosstabRowHeader() {
        return crosstabRowHeader;
    }

    /**
     * Sets the value of the crosstabRowHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrosstabRowHeader }
     *     
     */
    public void setCrosstabRowHeader(CrosstabRowHeader value) {
        this.crosstabRowHeader = value;
    }

    /**
     * Gets the value of the crosstabTotalRowHeader property.
     * 
     * @return
     *     possible object is
     *     {@link CrosstabTotalRowHeader }
     *     
     */
    public CrosstabTotalRowHeader getCrosstabTotalRowHeader() {
        return crosstabTotalRowHeader;
    }

    /**
     * Sets the value of the crosstabTotalRowHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrosstabTotalRowHeader }
     *     
     */
    public void setCrosstabTotalRowHeader(CrosstabTotalRowHeader value) {
        this.crosstabTotalRowHeader = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWidth(String value) {
        this.width = value;
    }

    /**
     * Gets the value of the totalPosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalPosition() {
        if (totalPosition == null) {
            return "None";
        } else {
            return totalPosition;
        }
    }

    /**
     * Sets the value of the totalPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalPosition(String value) {
        this.totalPosition = value;
    }

    /**
     * Gets the value of the headerPosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeaderPosition() {
        if (headerPosition == null) {
            return "Top";
        } else {
            return headerPosition;
        }
    }

    /**
     * Sets the value of the headerPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeaderPosition(String value) {
        this.headerPosition = value;
    }

    /**
     * Gets the value of the mergeHeaderCells property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMergeHeaderCells() {
        return mergeHeaderCells;
    }

    /**
     * Sets the value of the mergeHeaderCells property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMergeHeaderCells(Boolean value) {
        this.mergeHeaderCells = value;
    }

}
