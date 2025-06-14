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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}ganttDataset"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}barPlot"/&gt;
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
    "ganttDataset",
    "barPlot"
})
@XmlRootElement(name = "ganttChart")
public class GanttChart {

    @XmlElement(required = true)
    protected Chart chart;
    @XmlElement(required = true)
    protected GanttDataset ganttDataset;
    @XmlElement(required = true)
    protected BarPlot barPlot;

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
     * Gets the value of the ganttDataset property.
     * 
     * @return
     *     possible object is
     *     {@link GanttDataset }
     *     
     */
    public GanttDataset getGanttDataset() {
        return ganttDataset;
    }

    /**
     * Sets the value of the ganttDataset property.
     * 
     * @param value
     *     allowed object is
     *     {@link GanttDataset }
     *     
     */
    public void setGanttDataset(GanttDataset value) {
        this.ganttDataset = value;
    }

    /**
     * Gets the value of the barPlot property.
     * 
     * @return
     *     possible object is
     *     {@link BarPlot }
     *     
     */
    public BarPlot getBarPlot() {
        return barPlot;
    }

    /**
     * Sets the value of the barPlot property.
     * 
     * @param value
     *     allowed object is
     *     {@link BarPlot }
     *     
     */
    public void setBarPlot(BarPlot value) {
        this.barPlot = value;
    }

}
