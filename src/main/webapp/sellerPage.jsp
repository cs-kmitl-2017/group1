<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="th.ac.kmitl.science.comsci.example.models.CityName" %>
<h2>ผู้ขาย</h2>
<h4>
<table width="1000">
    <tr>
        <td>
            <table width="400">
                <tr>
                    <td>รหัสผู้ค้า</td>
                    <td><input type="text" name="sellerId" size="30" /></td>
                </tr>
                <tr>
                    <td>รหัสผู้ค้าสากล</td>
                    <td><input type="text" name="sellerGlobalId" size="30" /></td>
                </tr> 
                <tr>
                    <td>ชื่อผู้ขาย</td>
                    <td><input type="text" name="sellerName" size="30" /></td>
                </tr>
                <tr>
                    <td>อีเมล</td>
                    <td><input type="text" name="sellerEmail" value="" size="30" /></td>
                </tr>
                <tr>
                    <td>เลขประจำตัวผู้เสียภาษีอากร</td>
                    <td><input type="text" name="sellerTaxId" size="30" /></td>
                </tr>    
            </table> 
        </td>
        <td>
            <table width="400">
                <tr>
                    <td>ที่อยู่บรรทัดที่ 1</td>
                    <td><input type="text" name="sellerLineOne" size="30" /></td>
                </tr>
                <tr>
                    <td>ที่อยู่บรรทัดที่ 2</td>
                    <td><input type="text" name="sellerLineTwo" size="30" /></td>
                </tr> 
                <tr>
                    <td>ซอย</td>
                    <td><input type="text" name="sellerLineThree" size="30" /></td>
                </tr>
                <tr>
                    <td>หมู่บ้าน</td>
                    <td><input type="text" name="sellerLineFour" size="30" /></td>
                </tr> 
                <tr>
                    <td>หมู่ที่</td>
                    <td><input type="text" name="sellerLineFive" size="30" /></td>
                </tr>
                <tr>
                    <td>ถนน</td>
                    <td><input type="text" name="sellerStreet" value="" size="30" /></td>
                </tr>
                <tr>
                    <td>ตำบล</td>
                    <td><input type="text" name="sellerCitySubDivision" size="30" /></td>
                </tr> 
                <tr>
                    <td>อำเภอ</td>
                    <td>
                        <select name="sellerCity">
                            <%
                                ArrayList<String> cityname = new CityName().getCityList();
                                
                                for(int i = 0; i < cityname.size() ; i++)
                                    out.println("<option>"+cityname.get(i)+"</option>");
                            %>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>จังหวัด</td>
                    <td>
                        <input type="text" name="sellerCountrySubDivision" size="30" /
                    </td>
                </tr>   
                <tr>
                    <td>ประเทศ</td>
                    <td><input type="text" name="sellerCountry" size="30" /></td>
                </tr>
            </table>
        </td>
    </tr>
</table
</h4>
