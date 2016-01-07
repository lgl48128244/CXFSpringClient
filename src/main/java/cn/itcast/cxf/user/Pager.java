package cn.itcast.cxf.user;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for pager complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pager">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="datas" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="offset" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="pageSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="totalRecord" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pager", propOrder = { "datas", "offset", "pageSize", "totalRecord" })
public class Pager<T> {

	@XmlElement(nillable = true)
	protected List<T> datas;
	protected Integer offset;
	protected Integer pageSize;
	protected Long totalRecord;

	/**
	 * Gets the value of the datas property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list,
	 * not a snapshot. Therefore any modification you make to the
	 * returned list will be present inside the JAXB T.
	 * This is why there is not a <CODE>set</CODE> method for the datas property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * <pre>
	 *    getDatas().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Ts of the following type(s) are allowed in the list
	 * {@link T }
	 * 
	 * 
	 */
	public List<T> getDatas() {
		if (datas == null) {
			datas = new ArrayList<T>();
		}
		return this.datas;
	}

	/**
	 * Gets the value of the offset property.
	 * 
	 * @return
	 *     possible T is
	 *     {@link Integer }
	 *     
	 */
	public Integer getOffset() {
		return offset;
	}

	/**
	 * Sets the value of the offset property.
	 * 
	 * @param value
	 *     allowed T is
	 *     {@link Integer }
	 *     
	 */
	public void setOffset(Integer value) {
		this.offset = value;
	}

	/**
	 * Gets the value of the pageSize property.
	 * 
	 * @return
	 *     possible T is
	 *     {@link Integer }
	 *     
	 */
	public Integer getPageSize() {
		return pageSize;
	}

	/**
	 * Sets the value of the pageSize property.
	 * 
	 * @param value
	 *     allowed T is
	 *     {@link Integer }
	 *     
	 */
	public void setPageSize(Integer value) {
		this.pageSize = value;
	}

	/**
	 * Gets the value of the totalRecord property.
	 * 
	 * @return
	 *     possible T is
	 *     {@link Long }
	 *     
	 */
	public Long getTotalRecord() {
		return totalRecord;
	}

	/**
	 * Sets the value of the totalRecord property.
	 * 
	 * @param value
	 *     allowed T is
	 *     {@link Long }
	 *     
	 */
	public void setTotalRecord(Long value) {
		this.totalRecord = value;
	}

}
