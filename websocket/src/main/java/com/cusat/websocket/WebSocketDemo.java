package com.cusat.websocket;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class WebSocketDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;   
    public WebSocketDemo() {
        super();
        
    }
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		int n=Integer.parseInt(request.getParameter("val"));
		int c=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
					c++;
		}
		if(c==2)
			pw.print("Yes It's a prime no.");
		else
			pw.print("No It's not a prime no.");
		pw.close();
	}

}
