/**
 * 
 */
package com.customtag.jsp;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;



/**
 * @author AkhileshPC
 *
 */


public class IterationTag extends TagSupport
{
   private int number;
   private int pow;
   
   static int result = 1;
   static int counter = 0;
   
   
   public void setNumber(int number)
   {
	   this.number = number;
   }
   
   public void setpow(int pow)
   {
	   this.pow = pow;
   }
   
   
   
   public int doStartTag() throws JspException
   {
	   return EVAL_BODY_INCLUDE;
   }
   
   public int doAfterBody()
   {
	   counter++; 
	   
	   if(counter <= pow)
		   result *= number;
	   else
		   return SKIP_BODY;
	   
	   return EVAL_BODY_AGAIN;
	   
   }
   
   public int doEndTag() throws JspException
   {
	   JspWriter out = pageContext.getOut();
	   
	   try
	   {
	   out.print(result);
	   }
	   catch(Exception e)
	   {
		   e.printStackTrace();
	   }
      
	   return EVAL_PAGE;
   }
		
	
}
