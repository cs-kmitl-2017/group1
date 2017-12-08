package th.ac.kmitl.science.comsci.example.models;

import org.junit.Test;

public class CountrySubDivisionNameTest {
    
    private CountrySubDivisionName countrySubDivisionMapping = new CountrySubDivisionName();
    private AddressMock mock = new AddressMock();
    
    @Test
    public void testByName(){
        assert(countrySubDivisionMapping.mapper("Chiang Rai") == 2);
        assert(countrySubDivisionMapping.mapper("Kalasin") == 11);
        assert(countrySubDivisionMapping.mapper("Nakhon Ratchasima") == 15);
        assert(countrySubDivisionMapping.mapper("Chai Nat") == 32);
        assert(countrySubDivisionMapping.mapper("Nakhon Sawan") == 35);
        assert(countrySubDivisionMapping.mapper("Chachoengsao") == 53);
        assert(countrySubDivisionMapping.mapper("Kanchanaburi") == 59);
        assert(countrySubDivisionMapping.mapper("Phuket") == 72);
    }
    
    @Test
    public void testByMock(){
        assert(countrySubDivisionMapping.mapper(mock.countrySubDivision) == 1);
    }
    
}
