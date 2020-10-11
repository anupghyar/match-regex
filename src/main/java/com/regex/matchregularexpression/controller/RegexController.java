package com.regex.matchregularexpression.controller;

import com.regex.matchregularexpression.model.ApiRequestBody;
import com.regex.matchregularexpression.model.ApiResponse;
import com.regex.matchregularexpression.service.RegexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller()
public class RegexController {

    @Autowired
    private RegexService regexService;

    @RequestMapping(value = "regexMatch", method = RequestMethod.POST)
    public ResponseEntity findRegexMatch(@RequestBody ApiRequestBody input){
        ApiResponse apiResponse = regexService.findRegexMatch(input);
        return ResponseEntity.status(HttpStatus.OK).body(apiResponse);
    }
}
