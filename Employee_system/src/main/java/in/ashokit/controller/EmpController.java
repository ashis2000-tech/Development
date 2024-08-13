package in.ashokit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import in.ashokit.entity.Employee;
import in.ashokit.service.EmpService;
import jakarta.servlet.http.HttpSession;

@Controller
public class EmpController {
	@Autowired
	private EmpService service;
	@GetMapping("/")
	public String home(Model m) {
		List<Employee> emp = service.getAllEmp();
		System.out.println(emp);
		m.addAttribute("emp",emp);
		return "index";	
	}
	@GetMapping("/addemp")
	public String addEmpForm() {
		return "add_emp";	
	}
	@PostMapping("/register")
	public String empRegister(@ModelAttribute Employee e) {
		System.out.println(e);
		service.addEmp(e);
//		session.setAttribute("msg","Employee data added successfully...!!!");
		return "redirect:/";	
	}
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable Integer id, Model m) {
		
		Employee e = service.getEmpById(id);
		m.addAttribute("emp", e);
		return "edit";	
	}
	@PostMapping("/update")
	public String updateEmp(@ModelAttribute Employee e) {
		service.addEmp(e);
//		session.setAttribute("msg","Employee data update successfully...!!!");
		return "redirect:/";
		
	}
	@GetMapping("/delete/{id}")
	public String deleteEmp(@PathVariable Integer id ) {
		service.deleteEmp(id);
//		session.setAttribute("msg","Employee data deleted successfully...!!!");
		return "redirect:/";
		
	}
	
	
}
