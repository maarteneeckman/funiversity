package com.switchfully.funiversity.funiversity.API;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@org.springframework.web.bind.annotation.ControllerAdvice
public class ControllerAdvice  {


    private final Logger myLogger= LoggerFactory.getLogger(ProfessorController.class);

    @ExceptionHandler(IllegalArgumentException.class)
    public  void  SomethingDoesntExistEx (IllegalArgumentException exception , HttpServletResponse response) throws IOException {
        response.sendError(404 , exception.getMessage());
    }

    @ExceptionHandler(NullPointerException.class)
    public  void  SomethingDoesntExistEx2 (NullPointerException exception , HttpServletResponse response) throws IOException {
        response.sendError(400 , exception.getMessage());
    }


}
