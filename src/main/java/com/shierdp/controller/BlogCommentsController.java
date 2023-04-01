package com.shierdp.controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * @author shier
 */
@RestController
@CrossOrigin(origins = {"http://localhost:8080/"}, allowCredentials = "true")
@RequestMapping("/blog-comments")
public class BlogCommentsController {

}
