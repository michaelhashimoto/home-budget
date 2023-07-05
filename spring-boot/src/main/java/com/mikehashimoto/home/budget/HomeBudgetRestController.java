package com.mikehashimoto.home.budget;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeBudgetRestController {

	@PostMapping("/api")
	public ResponseEntity<String> api(@RequestBody String body) {
		if (_log.isInfoEnabled()) {
			_log.info("Processing " + body);
		}

		return new ResponseEntity<>(body, HttpStatus.OK);
	}

	private static final Log _log = LogFactory.getLog(
		HomeBudgetRestController.class);

}