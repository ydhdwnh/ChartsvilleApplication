//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.21 at 06:53:33 PM EDT 
//


package generated;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ChartHeader">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ChartName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ChartKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ChartTempo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ChartTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ChartComments" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ChartDetail">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="BarNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="BarText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="CommentIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "MusicChart")
public class MusicChart {

    @XmlElementRefs({
        @XmlElementRef(name = "ChartHeader", type = JAXBElement.class),
        @XmlElementRef(name = "ChartDetail", type = JAXBElement.class)
    })
    @XmlMixed
    protected List<Serializable> content;

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * {@link JAXBElement }{@code <}{@link MusicChart.ChartDetail }{@code >}
     * {@link JAXBElement }{@code <}{@link MusicChart.ChartHeader }{@code >}
     * 
     * 
     */
    public List<Serializable> getContent() {
        if (content == null) {
            content = new ArrayList<Serializable>();
        }
        return this.content;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="BarNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="BarText" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="CommentIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "content"
    })
    public static class ChartDetail {

        @XmlElementRefs({
            @XmlElementRef(name = "CommentIndicator", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "BarNumber", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "BarText", type = JAXBElement.class, required = false)
        })
        @XmlMixed
        protected List<Serializable> content;

        /**
         * Gets the value of the content property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the content property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
         * {@link JAXBElement }{@code <}{@link Integer }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * 
         * 
         */
        public List<Serializable> getContent() {
            if (content == null) {
                content = new ArrayList<Serializable>();
            }
            return this.content;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ChartName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ChartKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ChartTempo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ChartTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ChartComments" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "chartName",
        "chartKey",
        "chartTempo",
        "chartTime",
        "chartComments"
    })
    public static class ChartHeader {

        @XmlElement(name = "ChartName", required = true)
        protected String chartName;
        @XmlElement(name = "ChartKey", required = true)
        protected String chartKey;
        @XmlElement(name = "ChartTempo", required = true)
        protected String chartTempo;
        @XmlElement(name = "ChartTime", required = true)
        protected String chartTime;
        @XmlElement(name = "ChartComments", required = true)
        protected String chartComments;

        /**
         * Gets the value of the chartName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChartName() {
            return chartName;
        }

        /**
         * Sets the value of the chartName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChartName(String value) {
            this.chartName = value;
        }

        /**
         * Gets the value of the chartKey property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChartKey() {
            return chartKey;
        }

        /**
         * Sets the value of the chartKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChartKey(String value) {
            this.chartKey = value;
        }

        /**
         * Gets the value of the chartTempo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChartTempo() {
            return chartTempo;
        }

        /**
         * Sets the value of the chartTempo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChartTempo(String value) {
            this.chartTempo = value;
        }

        /**
         * Gets the value of the chartTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChartTime() {
            return chartTime;
        }

        /**
         * Sets the value of the chartTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChartTime(String value) {
            this.chartTime = value;
        }

        /**
         * Gets the value of the chartComments property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChartComments() {
            return chartComments;
        }

        /**
         * Sets the value of the chartComments property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChartComments(String value) {
            this.chartComments = value;
        }

    }

}