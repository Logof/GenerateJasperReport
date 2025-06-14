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
import jakarta.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}plot"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}xAxisLabelExpression" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}xAxisFormat" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}yAxisLabelExpression" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}yAxisFormat" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}domainAxisMinValueExpression" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}domainAxisMaxValueExpression" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}rangeAxisMinValueExpression" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}rangeAxisMaxValueExpression" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="scaleType"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="BothAxes"/&gt;
 *             &lt;enumeration value="DomainAxis"/&gt;
 *             &lt;enumeration value="RangeAxis"/&gt;
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
@XmlType(name = "", propOrder = {
    "plot",
    "xAxisLabelExpression",
    "xAxisFormat",
    "yAxisLabelExpression",
    "yAxisFormat",
    "domainAxisMinValueExpression",
    "domainAxisMaxValueExpression",
    "rangeAxisMinValueExpression",
    "rangeAxisMaxValueExpression"
})
@XmlRootElement(name = "bubblePlot")
public class BubblePlot {

    @XmlElement(required = true)
    protected Plot plot;
    protected XAxisLabelExpression xAxisLabelExpression;
    protected XAxisFormat xAxisFormat;
    protected YAxisLabelExpression yAxisLabelExpression;
    protected YAxisFormat yAxisFormat;
    protected DomainAxisMinValueExpression domainAxisMinValueExpression;
    protected DomainAxisMaxValueExpression domainAxisMaxValueExpression;
    protected RangeAxisMinValueExpression rangeAxisMinValueExpression;
    protected RangeAxisMaxValueExpression rangeAxisMaxValueExpression;
    @XmlAttribute(name = "scaleType")
    protected String scaleType;

    /**
     * Gets the value of the plot property.
     * 
     * @return
     *     possible object is
     *     {@link Plot }
     *     
     */
    public Plot getPlot() {
        return plot;
    }

    /**
     * Sets the value of the plot property.
     * 
     * @param value
     *     allowed object is
     *     {@link Plot }
     *     
     */
    public void setPlot(Plot value) {
        this.plot = value;
    }

    /**
     * Gets the value of the xAxisLabelExpression property.
     * 
     * @return
     *     possible object is
     *     {@link XAxisLabelExpression }
     *     
     */
    public XAxisLabelExpression getXAxisLabelExpression() {
        return xAxisLabelExpression;
    }

    /**
     * Sets the value of the xAxisLabelExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link XAxisLabelExpression }
     *     
     */
    public void setXAxisLabelExpression(XAxisLabelExpression value) {
        this.xAxisLabelExpression = value;
    }

    /**
     * Gets the value of the xAxisFormat property.
     * 
     * @return
     *     possible object is
     *     {@link XAxisFormat }
     *     
     */
    public XAxisFormat getXAxisFormat() {
        return xAxisFormat;
    }

    /**
     * Sets the value of the xAxisFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link XAxisFormat }
     *     
     */
    public void setXAxisFormat(XAxisFormat value) {
        this.xAxisFormat = value;
    }

    /**
     * Gets the value of the yAxisLabelExpression property.
     * 
     * @return
     *     possible object is
     *     {@link YAxisLabelExpression }
     *     
     */
    public YAxisLabelExpression getYAxisLabelExpression() {
        return yAxisLabelExpression;
    }

    /**
     * Sets the value of the yAxisLabelExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link YAxisLabelExpression }
     *     
     */
    public void setYAxisLabelExpression(YAxisLabelExpression value) {
        this.yAxisLabelExpression = value;
    }

    /**
     * Gets the value of the yAxisFormat property.
     * 
     * @return
     *     possible object is
     *     {@link YAxisFormat }
     *     
     */
    public YAxisFormat getYAxisFormat() {
        return yAxisFormat;
    }

    /**
     * Sets the value of the yAxisFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link YAxisFormat }
     *     
     */
    public void setYAxisFormat(YAxisFormat value) {
        this.yAxisFormat = value;
    }

    /**
     * Gets the value of the domainAxisMinValueExpression property.
     * 
     * @return
     *     possible object is
     *     {@link DomainAxisMinValueExpression }
     *     
     */
    public DomainAxisMinValueExpression getDomainAxisMinValueExpression() {
        return domainAxisMinValueExpression;
    }

    /**
     * Sets the value of the domainAxisMinValueExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link DomainAxisMinValueExpression }
     *     
     */
    public void setDomainAxisMinValueExpression(DomainAxisMinValueExpression value) {
        this.domainAxisMinValueExpression = value;
    }

    /**
     * Gets the value of the domainAxisMaxValueExpression property.
     * 
     * @return
     *     possible object is
     *     {@link DomainAxisMaxValueExpression }
     *     
     */
    public DomainAxisMaxValueExpression getDomainAxisMaxValueExpression() {
        return domainAxisMaxValueExpression;
    }

    /**
     * Sets the value of the domainAxisMaxValueExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link DomainAxisMaxValueExpression }
     *     
     */
    public void setDomainAxisMaxValueExpression(DomainAxisMaxValueExpression value) {
        this.domainAxisMaxValueExpression = value;
    }

    /**
     * Gets the value of the rangeAxisMinValueExpression property.
     * 
     * @return
     *     possible object is
     *     {@link RangeAxisMinValueExpression }
     *     
     */
    public RangeAxisMinValueExpression getRangeAxisMinValueExpression() {
        return rangeAxisMinValueExpression;
    }

    /**
     * Sets the value of the rangeAxisMinValueExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link RangeAxisMinValueExpression }
     *     
     */
    public void setRangeAxisMinValueExpression(RangeAxisMinValueExpression value) {
        this.rangeAxisMinValueExpression = value;
    }

    /**
     * Gets the value of the rangeAxisMaxValueExpression property.
     * 
     * @return
     *     possible object is
     *     {@link RangeAxisMaxValueExpression }
     *     
     */
    public RangeAxisMaxValueExpression getRangeAxisMaxValueExpression() {
        return rangeAxisMaxValueExpression;
    }

    /**
     * Sets the value of the rangeAxisMaxValueExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link RangeAxisMaxValueExpression }
     *     
     */
    public void setRangeAxisMaxValueExpression(RangeAxisMaxValueExpression value) {
        this.rangeAxisMaxValueExpression = value;
    }

    /**
     * Gets the value of the scaleType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScaleType() {
        return scaleType;
    }

    /**
     * Sets the value of the scaleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScaleType(String value) {
        this.scaleType = value;
    }

}
