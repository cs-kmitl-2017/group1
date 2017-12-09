<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="th.ac.kmitl.science.comsci.example.models.CityName" %>

<h2>ผู้ซื้อ</h2>
<h4>
<table width="1000">
    <tr>
        <td>
            <table width="400">
                <tr>
                    <td>รหัสผู้ค้า</td>
                    <td><input type="text" name="buyerId" size="30" /></td>
                </tr>
                <tr>
                    <td>รหัสผู้ค้าสากล</td>
                    <td><input type="text" name="buyerGlobalId" size="30" /></td>
                </tr> 
                <tr>
                    <td>ชื่อผู้ซื้อ</td>
                    <td><input type="text" name="buyerName" size="30" /></td>
                </tr>
                <tr>
                    <td>อีเมล</td>
                    <td><input type="text" name="buyerEmail" value="" size="30" /></td>
                </tr>
                <tr>
                    <td>เลขประจำตัวผู้เสียภาษีอากร</td>
                    <td><input type="text" name="buyerTaxId" size="30" /></td>
                </tr>    
            </table>
        </td>
        <td>
            <table width="400">
                <tr>
                    <td>ที่อยู่บรรทัดที่ 1</td>
                    <td><input type="text" name="buyerLineOne" size="30" /></td>
                </tr>
                <tr>
                    <td>ที่อยู่บรรทัดที่ 2</td>
                    <td><input type="text" name="buyerLineTwo" size="30" /></td>
                </tr> 
                <tr>
                    <td>ซอย</td>
                    <td><input type="text" name="buyerLineThree" size="30" /></td>
                </tr>
                <tr>
                    <td>หมู่บ้าน</td>
                    <td><input type="text" name="buyerLineFour" size="30" /></td>
                </tr> 
                <tr>
                    <td>หมู่ที่</td>
                    <td><input type="text" name="buyerLineFive" size="30" /></td>
                </tr>
                <tr>
                    <td>ถนน</td>
                    <td><input type="text" name="buyerStreet" value="" size="30" /></td>
                </tr>
                <tr>
                    <td>ตำบล</td>
                    <td><input type="text" name="buyerCitySubDivision" size="30" /></td>
                </tr> 
                <tr>
                    <td>อำเภอ</td>
                    <td>
                        <select name="buyerCity">
                            <%
                                ArrayList<String> cityName = new CityName().getCityList();
                                
                                for(int i = 0; i < cityName.size() ; i++)
                                    out.println("<option>"+cityName.get(i)+"</option>");
                            %>
                        </select>
                    </td>
                </tr>    
                <tr>
                    <td>จังหวัด</td>
                    <td>
                        <input type="text" name="buyerCountrySubDivision" size="30" />
                    </td>
                </tr>   
                <tr>
                    <td>ประเทศ</td>
                    <td><input type="text" name="buyerCountry" size="30" /></td>
                </tr>
            </table>
        </td>
    </tr>
</table>
</h4>