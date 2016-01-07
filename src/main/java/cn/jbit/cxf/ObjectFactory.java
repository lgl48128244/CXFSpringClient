package cn.jbit.cxf;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cn.jbit.cxf package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

	private final static QName _AddProduct_QNAME = new QName("http://service.cxf.jbit.cn/", "addProduct");
	private final static QName _GetPorductById_QNAME = new QName("http://service.cxf.jbit.cn/", "getPorductById");
	private final static QName _GetPorductByIdResponse_QNAME = new QName("http://service.cxf.jbit.cn/", "getPorductByIdResponse");
	private final static QName _AddProductResponse_QNAME = new QName("http://service.cxf.jbit.cn/", "addProductResponse");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cn.jbit.cxf
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link Product }
	 * 
	 */
	public Product createProduct() {
		return new Product();
	}

	/**
	 * Create an instance of {@link AddProductResponse }
	 * 
	 */
	public AddProductResponse createAddProductResponse() {
		return new AddProductResponse();
	}

	/**
	 * Create an instance of {@link GetPorductByIdResponse }
	 * 
	 */
	public GetPorductByIdResponse createGetPorductByIdResponse() {
		return new GetPorductByIdResponse();
	}

	/**
	 * Create an instance of {@link AddProduct }
	 * 
	 */
	public AddProduct createAddProduct() {
		return new AddProduct();
	}

	/**
	 * Create an instance of {@link GetPorductById }
	 * 
	 */
	public GetPorductById createGetPorductById() {
		return new GetPorductById();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link AddProduct }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.cxf.jbit.cn/", name = "addProduct")
	public JAXBElement<AddProduct> createAddProduct(AddProduct value) {
		return new JAXBElement<AddProduct>(_AddProduct_QNAME, AddProduct.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link GetPorductById }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.cxf.jbit.cn/", name = "getPorductById")
	public JAXBElement<GetPorductById> createGetPorductById(GetPorductById value) {
		return new JAXBElement<GetPorductById>(_GetPorductById_QNAME, GetPorductById.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link GetPorductByIdResponse }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.cxf.jbit.cn/", name = "getPorductByIdResponse")
	public JAXBElement<GetPorductByIdResponse> createGetPorductByIdResponse(GetPorductByIdResponse value) {
		return new JAXBElement<GetPorductByIdResponse>(_GetPorductByIdResponse_QNAME, GetPorductByIdResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link AddProductResponse }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.cxf.jbit.cn/", name = "addProductResponse")
	public JAXBElement<AddProductResponse> createAddProductResponse(AddProductResponse value) {
		return new JAXBElement<AddProductResponse>(_AddProductResponse_QNAME, AddProductResponse.class, null, value);
	}

}
