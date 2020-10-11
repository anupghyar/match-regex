# match-regex

This project helps you to get first match of regex with text provided by the user.

API:
Endpoint For local:
http://localhost:8080/regexMatch

Request body example:
{
    "regex" : "any regular expression",
    "textBody" : "Some text with which we want to match regex"
}

Response body example:
{
    "match": "first match of regex in text body",
    "error": false
}

Response for no match:
{
    "match": null,
    "error": false
}

For any bad regex (catastrophic-backtracking) - response:
{
    "match": null,
    "error": true
}
