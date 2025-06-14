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
 *         &lt;choice&gt;
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}timePeriodDataset"/&gt;
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}timeSeriesDataset"/&gt;
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}xyDataset"/&gt;
 *         &lt;/choice&gt;
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
    "timePeriodDataset",
    "timeSeriesDataset",
    "xyDataset",
    "barPlot"
})
@XmlRootElement(name = "xyBarChart")
public class XyBarChart {

    @XmlElement(required = true)
    protected Chart chart;
    protected TimePeriodDataset timePeriodDataset;
    protected TimeSeriesDataset timeSeriesDataset;
    protected XyDataset xyDataset;
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
     * Gets the value of the timePeriodDataset property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodDataset }
     *     
     */
    public TimePeriodDataset getTimePeriodDataset() {
        return timePeriodDataset;
    }

    /**
     * Sets the value of the timePeriodDataset property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodDataset }
     *     
     */
    public void setTimePeriodDataset(TimePeriodDataset value) {
        this.timePeriodDataset = value;
    }

    /**
     * Gets the value of the timeSeriesDataset property.
     * 
     * @return
     *     possible object is
     *     {@link TimeSeriesDataset }
     *     
     */
    public TimeSeriesDataset getTimeSeriesDataset() {
        return timeSeriesDataset;
    }

    /**
     * Sets the value of the timeSeriesDataset property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeSeriesDataset }
     *     
     */
    public void setTimeSeriesDataset(TimeSeriesDataset value) {
        this.timeSeriesDataset = value;
    }

    /**
     * Gets the value of the xyDataset property.
     * 
     * @return
     *     possible object is
     *     {@link XyDataset }
     *     
     */
    public XyDataset getXyDataset() {
        return xyDataset;
    }

    /**
     * Sets the value of the xyDataset property.
     * 
     * @param value
     *     allowed object is
     *     {@link XyDataset }
     *     
     */
    public void setXyDataset(XyDataset value) {
        this.xyDataset = value;
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
