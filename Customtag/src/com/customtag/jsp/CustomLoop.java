/**
 * @author AkhileshPC
 *
 */

package com.customtag.jsp;

import javax.servlet.jsp.JspException;
//import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;



public class CustomLoop extends TagSupport
{
	private int start =0;
	private int end =0;
	
	public void setStart(int start)
	{
		this.start = start;
	}
	
	public void setEnd(int end)
	{
		this.end = end;
	}
	
	public int doStartTag() throws JspException
	{
		return EVAL_BODY_INCLUDE;
	}
	
	public int doAfterBody()
	{
		
		if(start < end)
		{  
			start++;
			return EVAL_BODY_AGAIN;
		}	
		else
			return SKIP_BODY;	
		
	}
	
	public int doEndTag() throws JspException
	{
		return EVAL_PAGE;
	}
	
}
