/**
 * 
 */
package com.customtag.jsp;

import javax.servlet.jsp.tagext.TagSupport;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.JspException;
import java.util.*;


/**
 * @author AkhileshPC
 *
 */


public class Uri extends TagSupport
{
   
	
			
	public int doStartTag() throws JspException
	{
		
		JspWriter out = pageContext.getOut();
		try
		{
		  out.print(Calendar.getInstance().getTime());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return SKIP_BODY;		
	}
		
	
}
