package com.leoric.e2e.registration;

import com.leoric.e2e.event.RegistrationCompleteEvent;
import com.leoric.e2e.user.User;
import com.leoric.e2e.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registration")
@RequiredArgsConstructor
public class RegistrationController {
    private final UserService userService;
    private final ApplicationEventPublisher publisher;
    @GetMapping("/registration-form")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new RegistrationRequest());
        return "registration";
    }
    @PostMapping("/register")
    public String registerUser(@ModelAttribute("user") RegistrationRequest registration) {
        User user = userService.registerUser(registration);
        //publish the verification email event
        publisher.publishEvent(new RegistrationCompleteEvent(user, ""));
        return "redirect:/registration/registration-form?success";
    }
}
