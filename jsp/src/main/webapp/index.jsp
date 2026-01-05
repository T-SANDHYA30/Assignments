<%@ page import=java.util.* %><html>
<body>
<!-- jsp expreesion -->
	<h2><%= "Hello World!" %></h2>
	<h3>
		current time:<%=new java.util.Date() %></h3>
<!-- jsp declaration -->
	<%!  public int add(){
int a=56;
int b=78;
return a+b;
	}
%>

<!-- Scriplet -->
<%out.println("sum is: "+ add()); %>

<% ArrayList alist=new ArrayList();
alist.add(56);
alist.add("swapna");
out.println(alist);
%>

</body>
</html>
