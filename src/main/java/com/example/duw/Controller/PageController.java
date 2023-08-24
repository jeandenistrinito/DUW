package com.example.duw.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
    @GetMapping("/")
    public String homePage(){
        return "corps";
    }

    @GetMapping("/dashboard")
    public String dashboardPage(){
        return "Pages/dashboard";
    }

    @GetMapping("/table")
    public String tablesPage(){
        return "Pages/tables";
    }

    @GetMapping("/calendar")
    public String calendarPage(){
        return "Pages/calendar";
    }

    @GetMapping("/icons")
    public String iconsPage(){
        return "Pages/icons";
    }

    @GetMapping("/forms")
    public String formsPage(){
        return "Pages/forms";
    }

    @GetMapping("/login")
    public String loginPage(){
        return "Pages/login";
    }

    @GetMapping("/register")
    public String registerPage(){
        return "Pages/register";
    }

    @GetMapping("/reset")
    public String resetPage(){
        return "Pages/reset-password";
    }

    @GetMapping("/profile")
    public String profilePage(){
        return "Pages/profile";
    }




    /* ******************************* teste des pages ********************************** */

    @GetMapping("/teste")
    public String testePage(){
        return "Pages/teste/home";
    }

    @GetMapping("/load-new-content")
    public String loadNewContent() {
        return "Pages/teste/new_content :: content";
    }



    @GetMapping("/home")
    public String home() {
        return "home";
    }

    private boolean isFragment1 = true;

    @GetMapping("/change-content1")
    public String changeContent1() {
        return "content/fragement1";
    }

    @GetMapping("/change-content2")
    public String changeContent2() {
        return "content/fragement2";
    }

}
