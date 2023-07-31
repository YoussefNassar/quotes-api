package com.youssefnassar.quotegenerator.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class QuoteController
{

   @GetMapping(produces = { MediaType.APPLICATION_JSON_VALUE })
   public String getQuote()
   {
      return "hello";
   }
}
