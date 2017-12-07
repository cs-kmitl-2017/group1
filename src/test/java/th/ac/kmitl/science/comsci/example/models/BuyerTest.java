package th.ac.kmitl.science.comsci.example.models;

import th.ac.kmitl.science.comsci.example.models.mocks.*;
import org.junit.Test;

public class BuyerTest {
    
    CompanyMock companyMock = new CompanyMock();
    UniversalCommunicationMock universalCommunicationMock = new UniversalCommunicationMock();
    AddressMock addressMock = new AddressMock();
    
    @Test
    public void buyerConstructorTest() { 
        Buyer buyer = new Buyer(companyMock.id, companyMock.name, companyMock.globalId, companyMock.taxId);
        
        assert (buyer.getId().equals(companyMock.id));
        assert (buyer.getName().equals(companyMock.name));
        assert (buyer.getGlobalId().equals(companyMock.globalId));
        assert (buyer.getTaxId().equals(companyMock.taxId));
    }
    
    public void buyerSetGetUniversalCommunication() {
        Buyer buyer = new Buyer(companyMock.id, companyMock.name, companyMock.globalId, companyMock.taxId);
        
        buyer.getCompany().setUniversalCommunication(universalCommunicationMock.uriId);
        assert (buyer.getUriId().equals(universalCommunicationMock.uriId));
        
        buyer.setUriId(universalCommunicationMock.newuriId);
        assert (buyer.getUriId().equals(universalCommunicationMock.uriId));
    }
    
    public void buyerSetGetAddress() {
        Buyer buyer = new Buyer(companyMock.id, companyMock.name, companyMock.globalId, companyMock.taxId);
        
        Address address = buyer.getCompany().getAddressInstance();
        address.setLine1(addressMock.line1);
        address.setLine2(addressMock.line2);
        address.setLine3(addressMock.line3);
        address.setLine4(addressMock.line4);
        address.setLine5(addressMock.line5);
        address.setStreet(addressMock.street);
        address.setCitySubDivision(addressMock.citySubDivision);
        address.setCity(addressMock.city);
        address.setCountrySubDivision(addressMock.countrySubDivision);
        
        assert(buyer.getCompany().getAddressInstance().getLine1().equals(addressMock.line1));
        assert(buyer.getCompany().getAddressInstance().getLine2().equals(addressMock.line2));
        assert(buyer.getCompany().getAddressInstance().getLine3().equals(addressMock.line3));
        assert(buyer.getCompany().getAddressInstance().getLine4().equals(addressMock.line4));
        assert(buyer.getCompany().getAddressInstance().getLine5().equals(addressMock.line5));
        assert(buyer.getCompany().getAddressInstance().getStreet().equals(addressMock.street));
        assert(buyer.getCompany().getAddressInstance().getCitySubDivision().equals(addressMock.citySubDivision));
        assert(buyer.getCompany().getAddressInstance().getCity().equals(addressMock.city));
        assert(buyer.getCompany().getAddressInstance().getCountry().equals(addressMock.country));
    }
    
}
