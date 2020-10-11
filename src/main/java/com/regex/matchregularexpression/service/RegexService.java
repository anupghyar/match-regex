package com.regex.matchregularexpression.service;

import com.regex.matchregularexpression.exception.BadRegexException;
import com.regex.matchregularexpression.model.ApiRequestBody;
import com.regex.matchregularexpression.model.ApiResponse;
import org.springframework.stereotype.Service;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class RegexService {

    public ApiResponse findRegexMatch(ApiRequestBody input) {
        ApiResponse apiResponse = new ApiResponse();

        try {
            // create pattern
            Pattern pattern = Pattern.compile(input.getRegex());
            // find match
            Matcher match = pattern.matcher(input.getTextBody());
            if (match.find()) {
                apiResponse.setMatch(match.group(0));
            }
        } catch (StackOverflowError error) {
            // throw exception after bad regex
            throw new BadRegexException();
        } catch (Exception exception) {
            apiResponse.setError(true);
        }
        return apiResponse;
    }
}
