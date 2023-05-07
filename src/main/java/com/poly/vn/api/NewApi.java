package com.poly.vn.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.poly.vn.dto.NewDTO;

@Controller
public class NewApi {
	 @RequestMapping(value = "/new", method = RequestMethod.POST)

     @ResponseBody

     public NewDTO createNew(@RequestBody NewDTO model) {

             return model;

     }
}
