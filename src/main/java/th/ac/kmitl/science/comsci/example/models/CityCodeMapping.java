package th.ac.kmitl.science.comsci.example.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CityCodeMapping implements Mapping {
    
    private ArrayList<String> name;
    private Map<String,Integer> map; 

    public CityCodeMapping(){
        name = new ArrayList<String>(); 
        map = new HashMap<String,Integer>();

        name.add("Phra Nakhon");
        name.add("Dusit");
        name.add("Nong Chok");
        name.add("Bang Ruk");
        name.add("Bang Khen");
        name.add("Bang Kapi");
        name.add("Pathum Wan");
        name.add("Pom Prap Sattru Phai");
        name.add("Phra Khanong");
        name.add("Min Buri");
        name.add("Lat Krabang");
        name.add("Yan Nawa");
        name.add("Samphanthawong");
        name.add("Phaya Thai");
        name.add("Thon Buri");
        name.add("Bangkok Yai");
        name.add("Huai Khwang");
        name.add("Khlong San");
        name.add("Taling Chan");
        name.add("Bangkok Noi");
        name.add("Bang Khun Thian");
        name.add("Phasi Charoen");
        name.add("Nong Khaem");
        name.add("Rat Burana");
        name.add("Bang Phlat");
        name.add("Din Daeng");
        name.add("Bueng Kum");
        name.add("Sathon");
        name.add("Bang Sue");
        name.add("Chatuchak");
        name.add("Bang Kho Laem");
        name.add("Prawet");
        name.add("Khlong Toei");
        name.add("Suan Luang");
        name.add("Chom Thong");
        name.add("Don Mueang");
        name.add("Ratchathewi");
        name.add("Lat Phrao");
        name.add("Watthana");
        name.add("Bang Khae");
        name.add("Lak Si");
        name.add("Sai Mai");
        name.add("Khan Na Yao");
        name.add("Saphan Sung");
        name.add("Wang Thonglang");
        name.add("Khlong Sam Wa");
        name.add("Bang Na");
        name.add("Thawi Watthana");
        name.add("Thung Khru");
        name.add("Bang Bon");

        map.put(name.get(0),1);
        map.put(name.get(1),2);
        map.put(name.get(2),3);
        map.put(name.get(3),4);
        map.put(name.get(4),5);
        map.put(name.get(5),6);
        map.put(name.get(6),7);
        map.put(name.get(7),8);
        map.put(name.get(8),9);
        map.put(name.get(9),10);
        map.put(name.get(10),11);
        map.put(name.get(11),12);
        map.put(name.get(12),13);
        map.put(name.get(13),14);
        map.put(name.get(14),15);
        map.put(name.get(15),16);
        map.put(name.get(16),17);
        map.put(name.get(17),18);
        map.put(name.get(18),19);
        map.put(name.get(19),20);
        map.put(name.get(20),21);
        map.put(name.get(21),22);
        map.put(name.get(22),23);
        map.put(name.get(23),24);
        map.put(name.get(24),25);
        map.put(name.get(25),26);
        map.put(name.get(26),27);
        map.put(name.get(27),28);
        map.put(name.get(28),29);
        map.put(name.get(29),30);
        map.put(name.get(30),31);
        map.put(name.get(31),32);
        map.put(name.get(32),33);
        map.put(name.get(33),34);
        map.put(name.get(34),35);
        map.put(name.get(35),36);
        map.put(name.get(36),37);
        map.put(name.get(37),38);
        map.put(name.get(38),39);
        map.put(name.get(39),40);
        map.put(name.get(40),41);
        map.put(name.get(41),42);
        map.put(name.get(42),43);
        map.put(name.get(43),44);
        map.put(name.get(44),45);
        map.put(name.get(45),46);
        map.put(name.get(46),47);
        map.put(name.get(47),48);
        map.put(name.get(48),49);
        map.put(name.get(49),50);
    }

    public ArrayList<String> getCityList(){
        return this.name;
    }

    @Override
    public int mapper(String name){
        return map.get(name);
    }
    
}
