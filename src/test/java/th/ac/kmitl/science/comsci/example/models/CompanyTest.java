package th.ac.kmitl.science.comsci.example.models;

import org.junit.Test;
import th.ac.kmitl.science.comsci.example.models.mocks.*;

public class CompanyTest {
    
    UniversalCommunicationMock universalCommunicationMock = new UniversalCommunicationMock();
    CompanyMock companyMock = new CompanyMock();
    AddressMock addressMock = new AddressMock();
    
    @Test
    public void shouldInitPropertyViaConstuctorCorrectly(){
        
        Company seller = new Company(companyMock.id, companyMock.name, companyMock.globalId, companyMock.taxId);
        	
        assert (seller.getId().equals(companyMock.id));
        assert (seller.getName().equals(companyMock.name));
        assert (seller.getGlobalId().equals(companyMock.globalId));
        assert (seller.getTaxId().equals(companyMock.taxId));
    }
    
    @Test
    public void canSetUniversalCommunication() {
        
        Company seller = new Company(companyMock.id, companyMock.name, companyMock.globalId, companyMock.taxId); 
        seller.setUniversalCommunication(universalCommunicationMock.uriId);
        assert (seller.getUniversalCommunication().getUriId().equals(universalCommunicationMock.uriId));
    }

   @Test	
   public void canChangeUniversalCommunication() {
       
        Company seller = new Company(companyMock.id, companyMock.name, companyMock.globalId, companyMock.taxId);
        seller.setUniversalCommunication(universalCommunicationMock.uriId);
        
        seller.setUniversalCommunication(universalCommunicationMock.newuriId);
        assert (seller.getUniversalCommunication().getUriId().equals(universalCommunicationMock.newuriId));
   }
   
   @Test
    public void getAllDataFromAddressInstanceCase(){
        
        Company seller = new Company(companyMock.id, companyMock.name, companyMock.globalId, companyMock.taxId);
        
        Address address = seller.getAddressInstance();
<<<<<<< HEAD
        address.setLine1(addressMock.line1);
        address.setLine2(addressMock.line2);
        address.setLine3(addressMock.line3);
        address.setLine4(addressMock.line4);
        address.setLine5(addressMock.line5);
        address.setStreet(addressMock.street);
        address.setCitySubDivision(addressMock.citySubDivision);
        address.setCity(addressMock.city);
        address.setCountrySubDivision(addressMock.countrySubDivision);
        address.setCountry(addressMock.country);
        
        assert (address.getLine1().contains(addressMock.line1));
        assert (address.getLine2().contains(addressMock.line2));
        assert (address.getLine3().contains(addressMock.line3));
        assert (address.getLine4().contains(addressMock.line4));
        assert (address.getLine5().contains(addressMock.line5));
        assert (address.getStreet().contains(addressMock.street));
        assert (address.getCitySubDivision().contains(addressMock.citySubDivision));
        assert (address.getCity().contains(addressMock.city));
        assert (address.getCountrySubDivision().contains(addressMock.countrySubDivision));
        assert (address.getCountry().contains(addressMock.country));             
=======
        address.setLine1("1103/52");
        address.setLine2("Pratunam Clinic");
        address.setLine3("Petchaburi31");
        address.setLine4("Jarurat");
        address.setLine5("1");
        address.setStreet("Petchaburi");
        address.setCitySubDivision("Makkasan");
        address.setCity("Ratchatewee");
        address.setCountrySubDivision("Bangkok");
        address.setCountry("Thailand");
        
        assert (address.getLine1().equals("1103/52"));
        assert (address.getLine2().equals("Pratunam Clinic"));
        assert (address.getLine3().equals("Petchaburi31"));
        assert (address.getLine4().equals("Jarurat"));
        assert (address.getLine5().equals("1"));
        assert (address.getStreet().equals("Petchaburi"));
        assert (address.getCitySubDivision().equals("Makkasan"));
        assert (address.getCity().equals("Ratchatewee"));
        assert (address.getCountrySubDivision().equals("Bangkok"));
        assert (address.getCountry().equals("Thailand"));
>>>>>>> upstream/master
    }

}

