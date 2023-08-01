package com.youssefnassar.quotegenerator.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "quote")
public class Quote
{
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;
   private String quote;

   public Quote()
   {
   }

   public Quote(final int id, final String quote)
   {
      this.id = id;
      this.quote = quote;
   }

   public String getQuote()
   {
      return quote;
   }

   public void setQuote(final String quote)
   {
      this.quote = quote;
   }
}
