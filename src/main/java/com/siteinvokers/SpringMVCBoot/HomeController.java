package com.siteinvokers.SpringMVCBoot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {

 
	// Method will accept request for /
	@RequestMapping("/")
    public ModelAndView home(){
      ModelAndView mv = new ModelAndView("index") ;
		  return mv ;
    }

    // @RequestMapping("add")
    // public String add( @RequestParam("num1") int i, @RequestParam("num2") int j,
    //                 HttpSession session ){
    //     // int i = Integer.parseInt(req.getParameter("num1"));
    //     // int j = Integer.parseInt(req.getParameter("num2"));
    //     int sum = i+j ;
    //     // passing value by session
    //     // HttpSession session =  req.getSession();
    //     session.setAttribute("sum", sum) ;
    //     return "result.jsp" ;
    // }

    @RequestMapping("add")
    public String add( @RequestParam("num1") int i, @RequestParam("num2") int j, Model m  ){
      int sum = i+j ;
      
      // adding data using model and view 
      // ModelAndView mv = new ModelAndView() ;
      // mv.setViewName("result");
      // mv.addObject("sum", sum) ;
      // return  mv ;

      // using model
      m.addAttribute("sum", sum) ;
      return "result" ;
    }
}
