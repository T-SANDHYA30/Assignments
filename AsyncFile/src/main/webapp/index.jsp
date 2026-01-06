<%-- <html>
<body>
<h2><%= "Welcome!!" %></h2>
<form>
InputText:<input text="inpStr" type="text" name="inpStr">
<button type="button" onclick= "convertText(event)">Convert Data</button>
</form>

<div id="output"></div>
<script type="text/javascript">

async function convertText(event){
		
	let inputStr =document.getElementById("inpStr").value;
    let data = await fetch("AsyncFile", {
        method: "POST",
        headers: { "Content-Type": "application/x-www-form-urlencoded" },
        body: "inpStr=" + encodeURIComponent(inputStr) 
    });
    document.getElementById("output").innerHTML = await data.text();
}
</script>
</body>
</html>--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>String Converter</title>
</head>
<body>
    <h2>Welcome!! &#9995;</h2>
    <form>
        <input type="text" name="inpStr" id="inpStr">
        <button type="button" onclick="convertText(event)">Convert Data</button>
    </form>
    
    <div id="output"></div>
    
    <script type="text/javascript">
        async function convertText(event){
            event.preventDefault(); // Prevent default form submission
 
            let inputStr = document.getElementById("inpStr").value;
            
            // Construct the POST body with the required format
            let data = await fetch("AsyncFile", {
                method: "POST",
                headers: { "Content-Type": "application/x-www-form-urlencoded" },
                // Sending the input value with the key "inpStr"
                body: "inpStr=" + encodeURIComponent(inputStr) 
            });
            
            // Display the response from the servlet
            document.getElementById("output").innerHTML = await data.text();
        }
    </script>
</body>
</html>
 