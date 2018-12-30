package com.jlcindia.hibernate;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		//Transaction tx=null;
		Configuration cfg=new Configuration();
		//Resource rs=new Resource("hibernate.cfg.xml")
				cfg.configure("hibernate.cfg.xml");
				
		@SuppressWarnings("deprecation")
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tx=ss.beginTransaction();
		
		Student st=new Student();
		st.setId(100);
		st.setSname("Dash");
		
		Set<String> ph=new HashSet<String>();
			ph.add("9708152930");
			ph.add("9036974185");
			ph.add("7978750250");
			
		st.setPhone(ph);
		
		Student st1=new Student();
		st1.setId(200);
		st1.setSname("Rath");
		
		Set<String> ph1=new HashSet<String>();
			ph1.add("9708152930");
			ph1.add("9036974185");
			ph1.add("7978750250");
			
		st1.setPhone(ph1);
		
		
		
		ss.save(st);
		ss.save(st1);
		tx.commit();
	System.out.println("=============printing values=======================");
	

/*	Query qry=ss.createQuery("from emp02");
			List list=qry.list();
			
			Iterator it=list.iterator();
			while(it .hasNext()){
				Student student=(Student) it.next();
				
			
		System.out.println("Student ID:"+student.getSname()+"Student Name :"+student.getSname());
				
				Set<String> sot=student.getPhone();
				Iterator lst=sot.iterator();
				while(lst.hasNext()){
					System.out.println(lst.next());
				}
			}
		
		*/
		
	System.out.println("=============printing values=======================");	
	System.out.print("Data Inserted");	
		
	
	ss.close();

	}
}
