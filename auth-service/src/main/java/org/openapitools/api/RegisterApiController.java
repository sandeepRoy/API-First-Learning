package org.openapitools.api;

import jakarta.annotation.Generated;
import org.openapitools.model.RegisterRequest;
import org.openapitools.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-28T19:51:15.628635362+05:30[Asia/Kolkata]", comments = "Generator version: 7.9.0")
@Controller
@RequestMapping("${openapi.authenticationService.base-path:}")
public class RegisterApiController implements RegisterApi {

    @Autowired
    public UserService userService;

    private final NativeWebRequest request;

    @Autowired
    public RegisterApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody RegisterRequest registerRequest) {
        String token = userService.registerUser(registerRequest);
        return new ResponseEntity<>(token, HttpStatus.CREATED);
    }
}
