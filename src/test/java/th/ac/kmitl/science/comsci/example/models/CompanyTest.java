package th.ac.kmitl.science.comsci.example.models;

import org.junit.Test;

public class CompanyTest {
    
    @Test
    public void shouldInitPropertyViaConstuctorCorrectly(){
        String id = "id57050269";
        String name = "Patipon Taweechat";
        String globalId = "GId57050269";
        String taxId = "TId57050269";

        Company seller = new Company(id, name, globalId, taxId);
        	
        assert (seller.getId().equals(id));
        assert (seller.getName().equals(name));
        assert (seller.getGlobalId().equals(globalId));
        assert (seller.getTaxId().equals(taxId));
    }
    
    @Test
    public void canSetUniversalCommunication() {
        String id = "id57050269";
        String name = "Patipon Taweechat";
        String globalId = "GId57050269";
        String taxId = "TId57050269";
        Company seller = new Company(id, name, globalId, taxId);
        
        String uriId = "Cat202@gmail.com";
        seller.setUniversalCommunication(uriId);
        assert (seller.getUniversalCommunication().getUriId().equals(uriId));
    }

   @Test	
   public void canChangeUniversalCommunication() {
        String id = "id57050269";
        String name = "Patipon Taweechat";
        String globalId = "GId57050269";
        String taxId = "TId57050269";
        String uriId = "Cat202@gmail.com";
        Company seller = new Company(id, name, globalId, taxId);
        seller.setUniversalCommunication(uriId);
        
        String newUriId = "Dog202@gmail.com";
        seller.setUniversalCommunication(newUriId);
        assert (seller.getUniversalCommunication().getUriId().equals(newUriId));
   }
   
   @Test
    public void getAllDataFromAddressInstanceCase(){
        String id = "id57050269";
        String name = "Patipon Taweechat";
        String globalId = "GId57050269";
        String taxId = "TId57050269";

        Company seller = new Company(id, name, globalId, taxId);
        
        Address address = seller.getAddressInstance();
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
        
        assert (address.getLine1().contains("1103/52"));
        assert (address.getLine2().contains("Pratunam Clinic"));
        assert (address.getLine3().contains("Petchaburi31"));
        assert (address.getLine4().contains("Jarurat"));
        assert (address.getLine5().contains("1"));
        assert (address.getStreet().contains("Petchaburi"));
        assert (address.getCitySubDivision().contains("Makkasan"));
        assert (address.getCity().contains("Ratchatewee"));
        assert (address.getCountrySubDivision().contains("Bangkok"));
        assert (address.getCountry().contains("Thailand"));             
    }

}

