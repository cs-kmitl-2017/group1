package th.ac.kmitl.science.comsci.example.models.mocks;

import th.ac.kmitl.science.comsci.example.models.Company;

public class CompanyMock {
    
    public static String id = "id57050269";
    public static String name = "Patipon Taweechat";
    public static String globalId = "GId57050269";  
    public static String taxId = "TId57050269"; 
    
    public static Company getCompanyMock() {
        return new Company(id, name, globalId, taxId);
    }
}
