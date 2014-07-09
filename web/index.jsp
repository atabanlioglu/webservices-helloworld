<%-- 
    Document   : index
    Created on : 30.Mar.2014, 13:58:17
    Author     : AHMET
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
    <h1>Elektornik Ticaret - Odev5</h1>
        <%-- start web service invocation --%><hr/>
    <%
    try {
	hellopkg.HelloWSService service = new hellopkg.HelloWSService();
	hellopkg.HelloWS port = service.getHelloWSPort();
	 // TODO initialize WS operation arguments here
	java.lang.String name = "Ahmet Tabanlioglu(in Client App)";
	// TODO process result here
	java.lang.String result = port.getHello(name);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
    <h2>Client Uygulamasi</h2>

    
    </body>
</html>
