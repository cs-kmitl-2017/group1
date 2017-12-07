package th.ac.kmitl.science.comsci.example.models;

import org.junit.Test;
import th.ac.kmitl.science.comsci.example.models.mocks.UniversalCommunicationMock;

public class UniversalCommunicationTest{
    UniversalCommunicationMock universalCommunicationMock = new UniversalCommunicationMock();
    
    @Test
    public void shouldInitPropertyViaConstuctorCorrectly(){
        UniversalCommunication mail = new UniversalCommunication(universalCommunicationMock.uriId); 
        assert (mail.getUriId().equals(universalCommunicationMock.uriId)); 
    }
    
    @Test
    public void canChangeURL(){
        UniversalCommunication mail = new UniversalCommunication(universalCommunicationMock.uriId);   
        mail.setUriId(universalCommunicationMock.newuriId);
        assert (mail.getUriId().equals(universalCommunicationMock.newuriId));
    }
}

