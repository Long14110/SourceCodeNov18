package com.example.controller.web;

import com.example.dto.UserDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller(value = "homeControllerWeb")
public class HomeController {

@RequestMapping(value = "/trang-chu", method = RequestMethod.GET)
    public ModelAndView home(){
    ModelAndView mav = new ModelAndView("web/home");
    UserDto userDto = new UserDto();
    userDto.setName("ThanhLong");
    mav.addObject("model", userDto);
    return mav;
    }
}
