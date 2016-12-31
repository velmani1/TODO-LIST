package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import daoImpl.UserImpl;
import model.User;
@Controller
public class UserController {
	@Autowired 
	private UserImpl user;
	@RequestMapping("/register")
    public String reg(@PathVariable("user") Model model)
	user.create();
	return "register";
@RequestMapping("/update")
{
    public String change(@PathVariable("user") long id)
	user.update(user);
	return "register";
}
		@RequestMapping("/remove")
		{
    public String delete(@PathVariable("user") long id)
	user.remove();
	return "register";
		}
	@RequestMapping("/getuser")
	{
    public String get(@PathVariable("users") String email)
	user.getUserByEmail();
	return "users";
	}
	{
	@RequestMapping("/login")
    public String signin(@PathVariable("users") String email)
	user.getUserByEmail();
	return "users";
	}
	
}
