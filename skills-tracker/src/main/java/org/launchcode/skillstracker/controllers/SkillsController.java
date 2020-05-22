package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {

    @GetMapping
    @ResponseBody
    public String defaultSkillsList() {
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>C#</li>" +
                "<li>Javascript</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("form")
    @ResponseBody
    public String buildForm() {
        String html =
                "<html>" +
                        "<body>" +
                        "<form method = 'post' action = '/completedForm'>" +
                        "<p>Name:</p>" +
                        "<input type = 'text' name = 'name' />" +
                        "<p>My favorite language</p>" +
                        "<select name='language1' id='language1'>" +
                        "  <option value='Java'>Java</option>" +
                        "  <option value='javascript'>javascript</option>" +
                        "  <option value='C#'>C#</option>" +
                        "</select>" +
                        "<p>My second favorite language</p>" +
                        "<select name='language2' id='language2'>" +
                        "  <option value='Java'>Java</option>" +
                        "  <option value='javascript'>javascript</option>" +
                        "  <option value='C#'>C#</option>" +
                        "</select>" +
                        "<p>My third favorite language</p>" +
                        "<select name='language3' id='language3'>" +
                        "  <option value='Java'>Java</option>" +
                        "  <option value='javascript'>javascript</option>" +
                        "  <option value='C#'>C#</option>" +
                        "</select>" +
                        "<input type = 'submit' value = 'Submit' />" +
                        "</form>" +
                        "</body>" +
                        "</html>";
        return html;
    }

    @PostMapping("completedForm")
    @ResponseBody
    public String completeForm(@RequestParam String name, @RequestParam String language1, @RequestParam String language2, @RequestParam String language3) {
        return "<html>" +
                "<body>" +
                "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + language1 + "</li>" +
                "<li>" + language2 + "</li>" +
                "<li>" + language3 + "</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }
}
