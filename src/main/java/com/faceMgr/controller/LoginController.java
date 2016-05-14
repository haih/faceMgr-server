/**
 * 
 */
package com.faceMgr.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.faceMgr.bean.User;



/**
 * @author haih
 *
 */

@RestController
@RequestMapping(value = "/")
public class LoginController {

	private static final Logger log = LoggerFactory.getLogger(LoginController.class);
	
	@RequestMapping(value = "login", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String Login(@RequestBody User user) {
//		if( 0 != user.getAge()){
//			log.info("user.getAge()");
//		}
		if(null == user.getUserName() || null == user.getPassword() ){
			return "Error";
		}
		log.info(user.getPassword());
		return "OK";
    }
}
