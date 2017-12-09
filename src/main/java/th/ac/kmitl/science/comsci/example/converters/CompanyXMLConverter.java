package th.ac.kmitl.science.comsci.example.converters;

import th.ac.kmitl.science.comsci.example.models.Company;

public class CompanyXMLConverter implements XMLConverter  {
    
    private String headTag;
    private String companyId;
    private String companyGlobalId;
    private String companyName;
    private String companyTax;
    private String xml;
      
    public CompanyXMLConverter (Company company, String headTag) {
           
           HeadTagCompanyXMLConverter headTags = HeadTagCompanyXMLConverter.valueOf(headTag);
           this.headTag = headTags.getheadTag();
           this.companyId = company.getId();
           this.companyGlobalId = company.getGlobalId();
           this.companyName = company.getName();
           this.companyTax = company.getTaxId();
           setXml();
    }
    
    public void setXml() {
         String xml = "<ram:"+this.headTag+"> "
                     +"\n\t<ram:ID> "+this.companyId+" </ram:ID>"
                     +"\n\t<ram:GlobalID> "+this.companyGlobalId+" </ram:GlobalID>"
                     +"\n\t<ram:Name> "+this.companyName+" </ram:Name>"
                     +"\n</ram:"+this.headTag+">"
                     +"\n<ram:SpecifiedClLegalOrganization> "
                     +"\n\t<ram:ID> "+this.companyTax+" </ram:ID>"
                     +"\n</ram:SpecifiedClLegalOrganization> ";  
        this.xml = xml;
    }
     
    public String getXml() {
        setXml();
        return this.xml;
    }
    
    public String getHeadTag() {
        return this.headTag;
    }
    
    public void setHeadTag(String headTag)  {
        HeadTagCompanyXMLConverter headTags = HeadTagCompanyXMLConverter.valueOf(headTag);
        this.headTag = headTags.getheadTag();
        setXml();
    }
    
    public String getCompanyId() {
        return this.companyId;
    }
    
    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }
    
     public String getCompanyName() {
        return this.companyName;
    }
    
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    
     public String getCompanyGlobalId() {
        return this.companyGlobalId;
    }
    
    public void setCompanyGlobalId(String companyGlobalId) {
        this.companyGlobalId = companyGlobalId;
    }
    
     public String getCompanyTax() {
        return this.companyTax;
    }
    
    public void setCompanyTax(String companyTax) {
        this.companyTax = companyTax;
    }

    @Override
    public boolean isEmptyXML() {
        return (xml ==  null);
    }
  
}
