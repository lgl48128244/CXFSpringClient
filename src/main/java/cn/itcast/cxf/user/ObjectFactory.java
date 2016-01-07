package cn.itcast.cxf.user;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cn.itcast.cxf.user package. 
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

	private final static QName _LoadByUsernameResponse_QNAME = new QName("http://service.project.market.com/", "loadByUsernameResponse");
	private final static QName _UpdatePWD_QNAME = new QName("http://service.project.market.com/", "updatePWD");
	private final static QName _List_QNAME = new QName("http://service.project.market.com/", "list");
	private final static QName _Save_QNAME = new QName("http://service.project.market.com/", "save");
	private final static QName _LoginResponse_QNAME = new QName("http://service.project.market.com/", "loginResponse");
	private final static QName _Update_QNAME = new QName("http://service.project.market.com/", "update");
	private final static QName _UpdateUser_QNAME = new QName("http://service.project.market.com/", "updateUser");
	private final static QName _Login_QNAME = new QName("http://service.project.market.com/", "login");
	private final static QName _UpdatePWDResponse_QNAME = new QName("http://service.project.market.com/", "updatePWDResponse");
	private final static QName _LoadByUsername_QNAME = new QName("http://service.project.market.com/", "loadByUsername");
	private final static QName _Delete_QNAME = new QName("http://service.project.market.com/", "delete");
	private final static QName _ListResponse_QNAME = new QName("http://service.project.market.com/", "listResponse");
	private final static QName _UpdateResponse_QNAME = new QName("http://service.project.market.com/", "updateResponse");
	private final static QName _SaveResponse_QNAME = new QName("http://service.project.market.com/", "saveResponse");
	private final static QName _UpdateUserResponse_QNAME = new QName("http://service.project.market.com/", "updateUserResponse");
	private final static QName _DeleteResponse_QNAME = new QName("http://service.project.market.com/", "deleteResponse");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cn.itcast.cxf.user
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link Pager }
	 * 
	 */
	public Pager createPager() {
		return new Pager();
	}

	/**
	 * Create an instance of {@link UpdatePWD }
	 * 
	 */
	public UpdatePWD createUpdatePWD() {
		return new UpdatePWD();
	}

	/**
	 * Create an instance of {@link List }
	 * 
	 */
	public List createList() {
		return new List();
	}

	/**
	 * Create an instance of {@link LoadByUsernameResponse }
	 * 
	 */
	public LoadByUsernameResponse createLoadByUsernameResponse() {
		return new LoadByUsernameResponse();
	}

	/**
	 * Create an instance of {@link UpdateUserResponse }
	 * 
	 */
	public UpdateUserResponse createUpdateUserResponse() {
		return new UpdateUserResponse();
	}

	/**
	 * Create an instance of {@link Delete }
	 * 
	 */
	public Delete createDelete() {
		return new Delete();
	}

	/**
	 * Create an instance of {@link Save }
	 * 
	 */
	public Save createSave() {
		return new Save();
	}

	/**
	 * Create an instance of {@link UpdateResponse }
	 * 
	 */
	public UpdateResponse createUpdateResponse() {
		return new UpdateResponse();
	}

	/**
	 * Create an instance of {@link ListResponse }
	 * 
	 */
	public ListResponse createListResponse() {
		return new ListResponse();
	}

	/**
	 * Create an instance of {@link Login }
	 * 
	 */
	public Login createLogin() {
		return new Login();
	}

	/**
	 * Create an instance of {@link UpdateUser }
	 * 
	 */
	public UpdateUser createUpdateUser() {
		return new UpdateUser();
	}

	/**
	 * Create an instance of {@link User }
	 * 
	 */
	public User createUser() {
		return new User();
	}

	/**
	 * Create an instance of {@link Update }
	 * 
	 */
	public Update createUpdate() {
		return new Update();
	}

	/**
	 * Create an instance of {@link LoginResponse }
	 * 
	 */
	public LoginResponse createLoginResponse() {
		return new LoginResponse();
	}

	/**
	 * Create an instance of {@link SaveResponse }
	 * 
	 */
	public SaveResponse createSaveResponse() {
		return new SaveResponse();
	}

	/**
	 * Create an instance of {@link LoadByUsername }
	 * 
	 */
	public LoadByUsername createLoadByUsername() {
		return new LoadByUsername();
	}

	/**
	 * Create an instance of {@link DeleteResponse }
	 * 
	 */
	public DeleteResponse createDeleteResponse() {
		return new DeleteResponse();
	}

	/**
	 * Create an instance of {@link UpdatePWDResponse }
	 * 
	 */
	public UpdatePWDResponse createUpdatePWDResponse() {
		return new UpdatePWDResponse();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link LoadByUsernameResponse }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.project.market.com/", name = "loadByUsernameResponse")
	public JAXBElement<LoadByUsernameResponse> createLoadByUsernameResponse(LoadByUsernameResponse value) {
		return new JAXBElement<LoadByUsernameResponse>(_LoadByUsernameResponse_QNAME, LoadByUsernameResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePWD }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.project.market.com/", name = "updatePWD")
	public JAXBElement<UpdatePWD> createUpdatePWD(UpdatePWD value) {
		return new JAXBElement<UpdatePWD>(_UpdatePWD_QNAME, UpdatePWD.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.project.market.com/", name = "list")
	public JAXBElement<List> createList(List value) {
		return new JAXBElement<List>(_List_QNAME, List.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Save }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.project.market.com/", name = "save")
	public JAXBElement<Save> createSave(Save value) {
		return new JAXBElement<Save>(_Save_QNAME, Save.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.project.market.com/", name = "loginResponse")
	public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
		return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Update }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.project.market.com/", name = "update")
	public JAXBElement<Update> createUpdate(Update value) {
		return new JAXBElement<Update>(_Update_QNAME, Update.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUser }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.project.market.com/", name = "updateUser")
	public JAXBElement<UpdateUser> createUpdateUser(UpdateUser value) {
		return new JAXBElement<UpdateUser>(_UpdateUser_QNAME, UpdateUser.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.project.market.com/", name = "login")
	public JAXBElement<Login> createLogin(Login value) {
		return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePWDResponse }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.project.market.com/", name = "updatePWDResponse")
	public JAXBElement<UpdatePWDResponse> createUpdatePWDResponse(UpdatePWDResponse value) {
		return new JAXBElement<UpdatePWDResponse>(_UpdatePWDResponse_QNAME, UpdatePWDResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link LoadByUsername }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.project.market.com/", name = "loadByUsername")
	public JAXBElement<LoadByUsername> createLoadByUsername(LoadByUsername value) {
		return new JAXBElement<LoadByUsername>(_LoadByUsername_QNAME, LoadByUsername.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Delete }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.project.market.com/", name = "delete")
	public JAXBElement<Delete> createDelete(Delete value) {
		return new JAXBElement<Delete>(_Delete_QNAME, Delete.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ListResponse }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.project.market.com/", name = "listResponse")
	public JAXBElement<ListResponse> createListResponse(ListResponse value) {
		return new JAXBElement<ListResponse>(_ListResponse_QNAME, ListResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link UpdateResponse }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.project.market.com/", name = "updateResponse")
	public JAXBElement<UpdateResponse> createUpdateResponse(UpdateResponse value) {
		return new JAXBElement<UpdateResponse>(_UpdateResponse_QNAME, UpdateResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link SaveResponse }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.project.market.com/", name = "saveResponse")
	public JAXBElement<SaveResponse> createSaveResponse(SaveResponse value) {
		return new JAXBElement<SaveResponse>(_SaveResponse_QNAME, SaveResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUserResponse }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.project.market.com/", name = "updateUserResponse")
	public JAXBElement<UpdateUserResponse> createUpdateUserResponse(UpdateUserResponse value) {
		return new JAXBElement<UpdateUserResponse>(_UpdateUserResponse_QNAME, UpdateUserResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link DeleteResponse }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.project.market.com/", name = "deleteResponse")
	public JAXBElement<DeleteResponse> createDeleteResponse(DeleteResponse value) {
		return new JAXBElement<DeleteResponse>(_DeleteResponse_QNAME, DeleteResponse.class, null, value);
	}

}
