//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2025.05.26 at 04:38:23 PM YEKT 
//


package org.logof.xlsToJasper.jasper.report;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}property" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}box" minOccurs="0"/&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}line"/&gt;
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}rectangle"/&gt;
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}ellipse"/&gt;
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}image"/&gt;
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}staticText"/&gt;
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}textField"/&gt;
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}subreport"/&gt;
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}elementGroup"/&gt;
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}frame"/&gt;
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}componentElement"/&gt;
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}genericElement"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="backcolor" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="mode"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Opaque"/&gt;
 *             &lt;enumeration value="Transparent"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="style" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "property",
    "box",
    "lineOrRectangleOrEllipse"
})
@XmlRootElement(name = "cellContents")
public class CellContents {

    protected List<Property> property;
    protected Box box;
    @XmlElements({
        @XmlElement(name = "line", type = Line.class),
        @XmlElement(name = "rectangle", type = Rectangle.class),
        @XmlElement(name = "ellipse", type = Ellipse.class),
        @XmlElement(name = "image", type = Image.class),
        @XmlElement(name = "staticText", type = StaticText.class),
        @XmlElement(name = "textField", type = TextField.class),
        @XmlElement(name = "subreport", type = Subreport.class),
        @XmlElement(name = "elementGroup", type = ElementGroup.class),
        @XmlElement(name = "frame", type = Frame.class),
        @XmlElement(name = "componentElement", type = ComponentElement.class),
        @XmlElement(name = "genericElement", type = GenericElement.class)
    })
    protected List<Object> lineOrRectangleOrEllipse;
    @XmlAttribute(name = "backcolor")
    protected String backcolor;
    @XmlAttribute(name = "mode")
    protected String mode;
    @XmlAttribute(name = "style")
    protected String style;

    /**
     * Gets the value of the property property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the property property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Property }
     * 
     * 
     */
    public List<Property> getProperty() {
        if (property == null) {
            property = new ArrayList<Property>();
        }
        return this.property;
    }

    /**
     * Gets the value of the box property.
     * 
     * @return
     *     possible object is
     *     {@link Box }
     *     
     */
    public Box getBox() {
        return box;
    }

    /**
     * Sets the value of the box property.
     * 
     * @param value
     *     allowed object is
     *     {@link Box }
     *     
     */
    public void setBox(Box value) {
        this.box = value;
    }

    /**
     * Gets the value of the lineOrRectangleOrEllipse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineOrRectangleOrEllipse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineOrRectangleOrEllipse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComponentElement }
     * {@link ElementGroup }
     * {@link Ellipse }
     * {@link Frame }
     * {@link GenericElement }
     * {@link Image }
     * {@link Line }
     * {@link Rectangle }
     * {@link StaticText }
     * {@link Subreport }
     * {@link TextField }
     * 
     * 
     */
    public List<Object> getLineOrRectangleOrEllipse() {
        if (lineOrRectangleOrEllipse == null) {
            lineOrRectangleOrEllipse = new ArrayList<Object>();
        }
        return this.lineOrRectangleOrEllipse;
    }

    /**
     * Gets the value of the backcolor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackcolor() {
        return backcolor;
    }

    /**
     * Sets the value of the backcolor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackcolor(String value) {
        this.backcolor = value;
    }

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMode(String value) {
        this.mode = value;
    }

    /**
     * Gets the value of the style property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStyle() {
        return style;
    }

    /**
     * Sets the value of the style property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStyle(String value) {
        this.style = value;
    }

}
