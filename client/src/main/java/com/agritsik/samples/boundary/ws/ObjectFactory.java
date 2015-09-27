
package com.agritsik.samples.boundary.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.agritsik.samples.boundary.ws package. 
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

    private final static QName _WelcomeMessage_QNAME = new QName("http://boundary.samples.agritsik.com/", "welcomeMessage");
    private final static QName _Find_QNAME = new QName("http://boundary.samples.agritsik.com/", "find");
    private final static QName _FindResponse_QNAME = new QName("http://boundary.samples.agritsik.com/", "findResponse");
    private final static QName _WelcomeMessageResponse_QNAME = new QName("http://boundary.samples.agritsik.com/", "welcomeMessageResponse");
    private final static QName _Create_QNAME = new QName("http://boundary.samples.agritsik.com/", "create");
    private final static QName _CreateResponse_QNAME = new QName("http://boundary.samples.agritsik.com/", "createResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.agritsik.samples.boundary.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Find }
     * 
     */
    public Find createFind() {
        return new Find();
    }

    /**
     * Create an instance of {@link WelcomeMessage }
     * 
     */
    public WelcomeMessage createWelcomeMessage() {
        return new WelcomeMessage();
    }

    /**
     * Create an instance of {@link Create }
     * 
     */
    public Create createCreate() {
        return new Create();
    }

    /**
     * Create an instance of {@link CreateResponse }
     * 
     */
    public CreateResponse createCreateResponse() {
        return new CreateResponse();
    }

    /**
     * Create an instance of {@link FindResponse }
     * 
     */
    public FindResponse createFindResponse() {
        return new FindResponse();
    }

    /**
     * Create an instance of {@link WelcomeMessageResponse }
     * 
     */
    public WelcomeMessageResponse createWelcomeMessageResponse() {
        return new WelcomeMessageResponse();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WelcomeMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://boundary.samples.agritsik.com/", name = "welcomeMessage")
    public JAXBElement<WelcomeMessage> createWelcomeMessage(WelcomeMessage value) {
        return new JAXBElement<WelcomeMessage>(_WelcomeMessage_QNAME, WelcomeMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Find }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://boundary.samples.agritsik.com/", name = "find")
    public JAXBElement<Find> createFind(Find value) {
        return new JAXBElement<Find>(_Find_QNAME, Find.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://boundary.samples.agritsik.com/", name = "findResponse")
    public JAXBElement<FindResponse> createFindResponse(FindResponse value) {
        return new JAXBElement<FindResponse>(_FindResponse_QNAME, FindResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WelcomeMessageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://boundary.samples.agritsik.com/", name = "welcomeMessageResponse")
    public JAXBElement<WelcomeMessageResponse> createWelcomeMessageResponse(WelcomeMessageResponse value) {
        return new JAXBElement<WelcomeMessageResponse>(_WelcomeMessageResponse_QNAME, WelcomeMessageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Create }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://boundary.samples.agritsik.com/", name = "create")
    public JAXBElement<Create> createCreate(Create value) {
        return new JAXBElement<Create>(_Create_QNAME, Create.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://boundary.samples.agritsik.com/", name = "createResponse")
    public JAXBElement<CreateResponse> createCreateResponse(CreateResponse value) {
        return new JAXBElement<CreateResponse>(_CreateResponse_QNAME, CreateResponse.class, null, value);
    }

}
