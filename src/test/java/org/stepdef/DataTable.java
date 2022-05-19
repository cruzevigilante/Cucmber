package org.stepdef;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class DataTable {
	
	@Test
	public void oneDWithoutHeader() {
		
		
		
		List<String> li= new ArrayList<String>();
		li.add("subash");
		li.add("bose");
		li.add("chandra");
		String string = li.get(0);
		System.out.println(string);

	    
	
	}
	@Test
	public void oneDWithHeader() {
           Map<String, String> mp=new HashMap<String, String>();
           mp.put("Name", "bala");
           mp.put("email", "bala@gmail.com");
           mp.put("pass", "bala#22");
           
           String string2 = mp.get("Name");
           System.out.println(string2);

           
    }
	@Test
	public void twoDWithoutHeader() {
		List<List<String>> l= new ArrayList<List<String>>();
		List<String> l1=new ArrayList<>();
		l1.add("raja");
		l1.add("raja@gmail.com");
		l1.add("raja@12");
		List<String>l2=new ArrayList<>();
		l2.add("cruse");
		l2.add("cruze@gmail.com");
		l2.add("cruze@111");
		l.add(l1);
		l.add(l2);
		List<String> list = l.get(0);
		String string3 = list.get(0);
		System.out.println(string3);
		
		

	}
	@Test
	public void twoDWithHeader() {
		
		List<Map<String, String>> m= new ArrayList<Map<String,String>>();
		
		
		Map<String, String> map = new LinkedHashMap<>();
		map.put("Name", "vivek");
		map.put("id", "456733");
		map.put("pass", "vivek101");
		
		
		Map<String, String> m1=new LinkedHashMap<>();
		m1.put("name", "siva");
		m1.put("id", "4125");
        m1.put("pass", "siva@22");
        
        m.add(map);
		m.add(m1);
		Map<String, String> map2 = m.get(1);
		String string4 = map2.get("id");
		System.out.println(string4);
		
		

		
		
	}
	
	

}
