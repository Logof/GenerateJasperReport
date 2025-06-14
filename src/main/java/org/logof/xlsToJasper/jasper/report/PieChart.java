//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2025.05.26 at 04:38:23 PM YEKT 
//


package org.logof.xlsToJasper.jasper.report;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}chart"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}pieDataset"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}piePlot"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "chart",
    "pieDataset",
    "piePlot"
})
@XmlRootElement(name = "pieChart")
public class PieChart {

    @XmlElement(required = true)
    protected Chart chart;
    @XmlElement(required = true)
    protected PieDataset pieDataset;
    @XmlElement(required = true)
    protected PiePlot piePlot;

    /**
     * Gets the value of the chart property.
     * 
     * @return
     *     possible object is
     *     {@link Chart }
     *     
     */
    public Chart getChart() {
        return chart;
    }

    /**
     * Sets the value of the chart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Chart }
     *     
     */
    public void setChart(Chart value) {
        this.chart = value;
    }

    /**
     * Gets the value of the pieDataset property.
     * 
     * @return
     *     possible object is
     *     {@link PieDataset }
     *     
     */
    public PieDataset getPieDataset() {
        return pieDataset;
    }

    /**
     * Sets the value of the pieDataset property.
     * 
     * @param value
     *     allowed object is
     *     {@link PieDataset }
     *     
     */
    public void setPieDataset(PieDataset value) {
        this.pieDataset = value;
    }

    /**
     * Gets the value of the piePlot property.
     * 
     * @return
     *     possible object is
     *     {@link PiePlot }
     *     
     */
    public PiePlot getPiePlot() {
        return piePlot;
    }

    /**
     * Sets the value of the piePlot property.
     * 
     * @param value
     *     allowed object is
     *     {@link PiePlot }
     *     
     */
    public void setPiePlot(PiePlot value) {
        this.piePlot = value;
    }

}
