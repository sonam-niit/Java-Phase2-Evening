package com.simplilearn.feedback;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@Autowired
	private FeedbackDao dao;
	
	@PostMapping("/feedback")
	public ResponseEntity<String> addFeedback(@RequestBody FeedbackEntity feedback) {
		
		int x=dao.addFedback(feedback);
		if(x>0)
			return new ResponseEntity<String>("Data inserted",HttpStatus.OK);
		else
			return new ResponseEntity<String>("Error in inserting",
					HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
