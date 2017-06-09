//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.09 at 02:31:25 AM CEST 
//


package com.example.service.bankstatement;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="accountNumber" type="{http://service.example.com/bankStatement}T_accountNumber"/>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="sectionNumber" type="{http://service.example.com/bankStatement}T_sectionNumber"/>
 *         &lt;element name="previousBalance" type="{http://service.example.com/bankStatement}T_decimal152"/>
 *         &lt;element name="numberOfDeposits" type="{http://service.example.com/bankStatement}T_changes"/>
 *         &lt;element name="totalDeposited" type="{http://service.example.com/bankStatement}T_decimal152"/>
 *         &lt;element name="numberOfWithdrawals" type="{http://service.example.com/bankStatement}T_changes"/>
 *         &lt;element name="totalWithdrawn" type="{http://service.example.com/bankStatement}T_decimal152"/>
 *         &lt;element name="newBalance" type="{http://service.example.com/bankStatement}T_decimal152"/>
 *         &lt;element name="bankStatementItem" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="debtor" type="{http://service.example.com/bankStatement}T_companyData"/>
 *                   &lt;element name="creditor" type="{http://service.example.com/bankStatement}T_companyData"/>
 *                   &lt;element name="paymentPurpose" type="{http://service.example.com/bankStatement}T_string255"/>
 *                   &lt;element name="dateOfPayment" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="dateOfValue" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="total" type="{http://service.example.com/bankStatement}T_decimal152"/>
 *                   &lt;element name="direction">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;length value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
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
    "accountNumber",
    "date",
    "sectionNumber",
    "previousBalance",
    "numberOfDeposits",
    "totalDeposited",
    "numberOfWithdrawals",
    "totalWithdrawn",
    "newBalance",
    "bankStatementItem"
})
@XmlRootElement(name = "bankStatement")
public class BankStatement {

    @XmlElement(required = true)
    protected String accountNumber;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;
    protected int sectionNumber;
    @XmlElement(required = true)
    protected BigDecimal previousBalance;
    protected int numberOfDeposits;
    @XmlElement(required = true)
    protected BigDecimal totalDeposited;
    protected int numberOfWithdrawals;
    @XmlElement(required = true)
    protected BigDecimal totalWithdrawn;
    @XmlElement(required = true)
    protected BigDecimal newBalance;
    protected List<BankStatement.BankStatementItem> bankStatementItem;

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the sectionNumber property.
     * 
     */
    public int getSectionNumber() {
        return sectionNumber;
    }

    /**
     * Sets the value of the sectionNumber property.
     * 
     */
    public void setSectionNumber(int value) {
        this.sectionNumber = value;
    }

    /**
     * Gets the value of the previousBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPreviousBalance() {
        return previousBalance;
    }

    /**
     * Sets the value of the previousBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPreviousBalance(BigDecimal value) {
        this.previousBalance = value;
    }

    /**
     * Gets the value of the numberOfDeposits property.
     * 
     */
    public int getNumberOfDeposits() {
        return numberOfDeposits;
    }

    /**
     * Sets the value of the numberOfDeposits property.
     * 
     */
    public void setNumberOfDeposits(int value) {
        this.numberOfDeposits = value;
    }

    /**
     * Gets the value of the totalDeposited property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalDeposited() {
        return totalDeposited;
    }

    /**
     * Sets the value of the totalDeposited property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalDeposited(BigDecimal value) {
        this.totalDeposited = value;
    }

    /**
     * Gets the value of the numberOfWithdrawals property.
     * 
     */
    public int getNumberOfWithdrawals() {
        return numberOfWithdrawals;
    }

    /**
     * Sets the value of the numberOfWithdrawals property.
     * 
     */
    public void setNumberOfWithdrawals(int value) {
        this.numberOfWithdrawals = value;
    }

    /**
     * Gets the value of the totalWithdrawn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalWithdrawn() {
        return totalWithdrawn;
    }

    /**
     * Sets the value of the totalWithdrawn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalWithdrawn(BigDecimal value) {
        this.totalWithdrawn = value;
    }

    /**
     * Gets the value of the newBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNewBalance() {
        return newBalance;
    }

    /**
     * Sets the value of the newBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNewBalance(BigDecimal value) {
        this.newBalance = value;
    }

    /**
     * Gets the value of the bankStatementItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bankStatementItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBankStatementItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BankStatement.BankStatementItem }
     * 
     * 
     */
    public List<BankStatement.BankStatementItem> getBankStatementItem() {
        if (bankStatementItem == null) {
            bankStatementItem = new ArrayList<BankStatement.BankStatementItem>();
        }
        return this.bankStatementItem;
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
     *         &lt;element name="debtor" type="{http://service.example.com/bankStatement}T_companyData"/>
     *         &lt;element name="creditor" type="{http://service.example.com/bankStatement}T_companyData"/>
     *         &lt;element name="paymentPurpose" type="{http://service.example.com/bankStatement}T_string255"/>
     *         &lt;element name="dateOfPayment" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="dateOfValue" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="total" type="{http://service.example.com/bankStatement}T_decimal152"/>
     *         &lt;element name="direction">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;length value="1"/>
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
        "debtor",
        "creditor",
        "paymentPurpose",
        "dateOfPayment",
        "dateOfValue",
        "total",
        "direction"
    })
    public static class BankStatementItem {

        @XmlElement(required = true)
        protected TCompanyData debtor;
        @XmlElement(required = true)
        protected TCompanyData creditor;
        @XmlElement(required = true)
        protected String paymentPurpose;
        @XmlElement(required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar dateOfPayment;
        @XmlElement(required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar dateOfValue;
        @XmlElement(required = true)
        protected BigDecimal total;
        @XmlElement(required = true)
        protected String direction;

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
         * Gets the value of the dateOfPayment property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDateOfPayment() {
            return dateOfPayment;
        }

        /**
         * Sets the value of the dateOfPayment property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDateOfPayment(XMLGregorianCalendar value) {
            this.dateOfPayment = value;
        }

        /**
         * Gets the value of the dateOfValue property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDateOfValue() {
            return dateOfValue;
        }

        /**
         * Sets the value of the dateOfValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDateOfValue(XMLGregorianCalendar value) {
            this.dateOfValue = value;
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
         * Gets the value of the direction property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDirection() {
            return direction;
        }

        /**
         * Sets the value of the direction property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDirection(String value) {
            this.direction = value;
        }

    }

}
