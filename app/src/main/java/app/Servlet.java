package app;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ariba.ui.aribaweb.core.AWConcreteApplication;
import ariba.ui.aribaweb.util.AWStaticSiteGenerator.ExtendedDefaultApplication;

@WebServlet("/Ariba/AribaWeb/*")
public class Servlet extends ariba.ui.servletadaptor.AWDispatcherServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("smu");
		super.doGet(request, response);
	}
}