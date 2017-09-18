package controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import beans.Employee;
import dao.EmployeeDao;

public class EmpCrudController extends MultiActionController
{
private EmployeeDao edo;
	
	public void setEdo(EmployeeDao edo) {
		this.edo = edo;
	}
	
	public ModelAndView empsave(HttpServletRequest req,HttpServletResponse res)throws Exception
	{
		int id = Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String address=req.getParameter("address");	
		Employee e = new Employee();
		e.setId(id);
		e.setName(name);
		e.setEmail(email);
		e.setAddress(address);
		edo.save(e);
		
		Map m=new HashMap();
		m.put("msg",e );
		return new ModelAndView("success",m);
	}
	
	public ModelAndView empupdate(HttpServletRequest req,HttpServletResponse res)throws Exception
	{
		int id = Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String address=req.getParameter("address");	
		Employee e = new Employee();
		e.setId(id);
		e.setName(name);
		e.setEmail(email);
		e.setAddress(address);
		edo.update(e);
		
		Map m=new HashMap();
		m.put("msg",e );
		return new ModelAndView("updatesuccess",m);
		
	}
	
	public ModelAndView empdelete(HttpServletRequest req,HttpServletResponse res)throws Exception
	{
		int id = Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String address=req.getParameter("address");	
		Employee e = new Employee();
		
		
		edo.delete(e);
		
		Map m=new HashMap();
		m.put("msg",e );
		return new ModelAndView("delete1",m);
	}
}
