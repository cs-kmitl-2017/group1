package th.ac.kmitl.science.comsci.example.models;

import org.junit.Test;
import th.ac.kmitl.science.comsci.example.models.mocks.AddressMock;

public class AddressTest {
    private Address address = new Address();
    AddressMock addressMock = new AddressMock();
    
    @Test
    public void line1Case(){
        address.setLine1(addressMock.line1);
        assert (address.getLine1().contains(addressMock.line1));
    }
    
    @Test
    public void line2Case(){
        address.setLine2(addressMock.line2);
        assert (address.getLine2().contains(addressMock.line2));
    }
    
    @Test
    public void line3Case(){
        address.setLine3(addressMock.line3);
        assert (address.getLine3().contains(addressMock.line3));
    }
    
    @Test
    public void line4Case(){
        address.setLine4(addressMock.line4);
        assert (address.getLine4().contains(addressMock.line4));
    }
    
    @Test
    public void line5Case(){
        address.setLine5(addressMock.line5);
        assert (address.getLine5().contains(addressMock.line5));
    }
    
    @Test
    public void streetCase(){
        address.setStreet(addressMock.street);
        assert (address.getStreet().contains(addressMock.street));
    }
    
    @Test
    public void citySubDivisionCase(){
        address.setCitySubDivision(addressMock.citySubDivision);
        assert (address.getCitySubDivision().contains(addressMock.citySubDivision));
    }
    
    @Test
    public void cityCase(){
        address.setCity(addressMock.city);
        assert (address.getCity().contains(addressMock.city));
    }
    
    @Test
    public void countrySubDivisionCase(){
        address.setCountrySubDivision(addressMock.countrySubDivision);
        assert (address.getCountrySubDivision().contains(addressMock.countrySubDivision));
    }
    
    @Test
    public void countryCase(){
        address.setCountry(addressMock.country);
        assert (address.getCountry().contains(addressMock.city));
    }
}
