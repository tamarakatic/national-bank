
package com.example.service.mt102;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="paymentId">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="16"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="paymentPurpose" type="{http://service.example.com/mt102}T_string255"/>
 *         &lt;element name="creditor" type="{http://service.example.com/mt102}T_companyData"/>
 *         &lt;element name="debtor" type="{http://service.example.com/mt102}T_companyData"/>
 *         &lt;element name="dateOfOrder" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="total">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="15"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="currency">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
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
    "paymentId",
    "paymentPurpose",
    "creditor",
    "debtor",
    "dateOfOrder",
    "total",
    "currency"
})
@XmlRootElement(name = "singlePayment", namespace = "http://service.example.com/mt102")
public class SinglePayment {

    @XmlElement(namespace = "http://service.example.com/mt102", required = true)
    protected String paymentId;
    @XmlElement(namespace = "http://service.example.com/mt102", required = true)
    protected String paymentPurpose;
    @XmlElement(namespace = "http://service.example.com/mt102", required = true)
    protected TCompanyData creditor;
    @XmlElement(namespace = "http://service.example.com/mt102", required = true)
    protected TCompanyData debtor;
    @XmlElement(namespace = "http://service.example.com/mt102", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfOrder;
    @XmlElement(namespace = "http://service.example.com/mt102", required = true)
    protected BigDecimal total;
    @XmlElement(namespace = "http://service.example.com/mt102", required = true)
    protected String currency;

    /**
     * Gets the value of the paymentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentId() {
        return paymentId;
    }

    /**
     * Sets the value of the paymentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentId(String value) {
        this.paymentId = value;
    }

    /**
     * Gets the value of the paymentPurpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentPurpose() {
        return paymentPurpose;
    }

    /**
     * Sets the value of the paymentPurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentPurpose(String value) {
        this.paymentPurpose = value;
    }

    /**
     * Gets the value of the creditor property.
     * 
     * @return
     *     possible object is
     *     {@link TCompanyData }
     *     
     */
    public TCompanyData getCreditor() {
        return creditor;
    }

    /**
     * Sets the value of the creditor property.
     * 
     * @param value
     *     allowed object is
     *     {@link TCompanyData }
     *     
     */
    public void setCreditor(TCompanyData value) {
        this.creditor = value;
    }

    /**
     * Gets the value of the debtor property.
     * 
     * @return
     *     possible object is
     *     {@link TCompanyData }
     *     
     */
    public TCompanyData getDebtor() {
        return debtor;
    }

    /**
     * Sets the value of the debtor property.
     * 
     * @param value
     *     allowed object is
     *     {@link TCompanyData }
     *     
     */
    public void setDebtor(TCompanyData value) {
        this.debtor = value;
    }

    /**
     * Gets the value of the dateOfOrder property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfOrder() {
        return dateOfOrder;
    }

    /**
     * Sets the value of the dateOfOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfOrder(XMLGregorianCalendar value) {
        this.dateOfOrder = value;
    }

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotal(BigDecimal value) {
        this.total = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

}
