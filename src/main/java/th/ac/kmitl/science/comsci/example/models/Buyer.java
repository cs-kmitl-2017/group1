package th.ac.kmitl.science.comsci.example.models;

public class Buyer {
    
    private Company company;
    
    public Buyer(String id, String name, String globalId, String taxId) {
        this.company = new Company( id, name, globalId, taxId);
    }
    
    public Company getCompany() {
        return this.company;
    }
    
    public String getName() {
        return company.getName();
    }
    
    public void setName(String name) {
       this.company.setName(name);
    }
    
    public String getId() {
        return this.company.getId();
    }
    
    public void setId(String id) {
        this.company.setId(id);
    }
    
    public void setGlobalId(String globalId) {
        this.company.setGlobalId(globalId);
    }
    
    public String getGlobalId() {
        return this.company.getGlobalId();
    }
    
    public String getTaxId() {
        return this.company.getTaxId();
    }
    
    public void setTaxId(String taxId) {
        this.company.setTaxId(taxId);
    }
    
     public String getUriId() {
        return this.company.getUniversalCommunication().getUriId();
    }
    
    public void setUriId(String uriId) {
        this.company.getUniversalCommunication().setUriId(uriId);
    }
          
}
