package com.banff.api;

import com.banff.bean.Comment;
import com.banff.bean.MessageBean;
import com.banff.bean.ResponseBean;
import com.banff.mongo.model.UserBean;
import com.banff.mongo.service.CommentService;
import com.banff.mongo.service.UserService;
 
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.Collections;
import java.util.List;

/**
 * 通用 API
 */
@RestController
@AllArgsConstructor
@RequestMapping("/api/common")
@Log4j2
public class CommonAPI {

	private final UserService userService;

	private final CommentService commentService;

    

    

}
