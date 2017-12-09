package th.ac.kmitl.science.comsci.example.models;

import org.junit.Test;
import th.ac.kmitl.science.comsci.example.converters.CompanyXMLConverter;
import th.ac.kmitl.science.comsci.example.models.mocks.CompanyMock;

public class CompanyXMLConverterTest {
 
    @Test
    public void testConverterToXML() {
        
        Company buyer = new Company(CompanyMock.id, CompanyMock.name, CompanyMock.globalId, CompanyMock.taxId);
        
        String buyerXML = CompanyXMLConverter.getXml(buyer, "buyer");
        assert (!buyerXML.equals(null)); 
        assert (CompanyXMLConverter.headTag.equals("BuyerCITradeParty"));
        
        Company seller = new Company(CompanyMock.id, CompanyMock.name, CompanyMock.globalId, CompanyMock.taxId);
        String sellerXML = CompanyXMLConverter.getXml(seller, "seller");
        assert (!sellerXML.equals(null));
        assert (CompanyXMLConverter.headTag.equals("SellerCITradeParty"));
    }
    
}