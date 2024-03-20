package com.siteinvokers.SpringMVCBoot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;


@Controller
public class HomeController {

 
	// Method will accept request for /
	@RequestMapping("/")
    public String home(){
		return "index.jsp" ;
    }
    @RequestMapping("add")
    public String add( @RequestParam("num1") int i, @RequestParam("num2") int j,
                    HttpSession session ){
        // int i = Integer.parseInt(req.getParameter("num1"));
        // int j = Integer.parseInt(req.getParameter("num2"));

        int sum = i+j ;
   
        // passing value by session
        // HttpSession session =  req.getSession();
        session.setAttribute("sum", sum) ;

        return "result.jsp" ;
    }

}
