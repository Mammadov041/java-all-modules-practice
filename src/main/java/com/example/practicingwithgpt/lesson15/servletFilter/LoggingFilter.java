package com.example.practicingwithgpt.lesson15.servletFilter;


import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;

@WebFilter("/*")
public class LoggingFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) {
        System.out.println("Filter initialized");
    }

    @Override
    public void doFilter(ServletRequest request,
                         ServletResponse response,
                         FilterChain chain)
            throws IOException, ServletException {

        System.out.println("Request received");

        // Pass request to next filter or servlet
        chain.doFilter(request, response);

        System.out.println("Response sent");
    }

    @Override
    public void destroy() {
        System.out.println("Filter destroyed");
    }
}
