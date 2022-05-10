package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping()
    public String skillTracker() {
        return "<html>" +
                "<body>" +
                "<h1>" +
                "Skill Tracker" +
                "</h1>" +
                "<h2>" +
                "We have a few skills we would like to learn. Here is the list!" +
                "</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "<ol>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("form")
    public String inputAndLanguage() {
        return "<html>" +
                "<body>" +
                "<form action='printUser' method='post'>" +
                "<label for='userName'>Name:</label>" +
                "<br>" +
                "<input type='text' name='userName'>" +
                "<br>" +
                "<label for='favlang1'>My favorite language:</label>" +
                "<br>" +
                "<select name='favlang1'>" +
                "<option value='java'>Java</option>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='python'>Python</option>" +
                "</select>" +
                "<br>" +
                "<label for='favlang2'>My second favorite language:</label>" +
                "<br>" +
                "<select name='favlang2'>" +
                "<option value='java'>Java</option>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='python'>Python</option>" +
                "</select>" +
                "<br>" +
                "<label for='favlang3'>My third favorite language:</label>" +
                "<br>" +
                "<select name='favlang3'>" +
                "<option value='java'>Java</option>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='python'>Python</option>" +
                "</select>" +
                "<br>" +
                "<input type='submit' value='Submit'>" +
                "</body>" +
                "</html>";
    }

    @PostMapping("printUser")
    public String printUser(String userName, String favlang1, String favlang2, String favlang3) {
        return "<html>" +
                "<body>" +
                "<h1>" + userName + "</h1>" +
                "<br>" +
                "<ol>" +
                "<li>" + favlang1 + "</li>" +
                "<li>" + favlang2 + "</li>" +
                "<li>" + favlang3 + "</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }
}