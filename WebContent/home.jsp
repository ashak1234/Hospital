<!DOCTYPE html>
<html>
<head>
<style>
div.container {
    width: 100%;   
    border: 1px solid gray;
}

body{
	background-color:#ead9c8;
}

header, footer {
    padding: 1em;    
    color: white;
    background-color: #ac7339;  
    clear: left;
    text-align: center;
  }

nav {
    float:left;
    max-width: 160px;    
    line-height: 90px;
    margin: 0;
    padding: 1em;   

}

nav ul {
    list-style-type: none;
    padding: 0;

}
   
nav ul a {
    text-decoration: none;
    color:black;
}

section{
  background-color: white;
}

section ul{ 
  list-style-type: none;
  margin: 0;
    padding: 0;
}

section ul li {
    float: left;
}

section ul li a {
    display: block;
    padding: 5px;
    width: 250px;
    background-color: #ead9c8;
    color:black;
    line-height: 50px;
}

seciton ul li a:hover{
    background-color: black;
}

section ul li:hover{
    background-color: rgb(0, 188, 242);   
}

.active {
    background-color: #4CAF50;
}

article {
    margin-left: 170px;
    border-left: 1px solid gray;
    line-height: 110px;
    padding: 1em;
    overflow: hidden;
}
</style>
</head>
<body>

<div class="container">

<header>
   <h1>City Hospital</h1>
</header>
  
<nav>
  <ul>
    <li><a href="home1.jsp">Home</a><br>    
    <li><a href="aboutUs.jsp">Contact Us</a><br>
    <li><a href="newLetter.jsp">NewsLetter</a><br>
    <li><a href="contactUs.jsp">Contact Us</a><br>
    
  </ul>
</nav>

<article>
<section>
<ul>  
  <li><a href="Patient_Login.jsp">Patient and Visitors</a></li>
  <li><a href="doctorLogin.jsp">Doctor and Departments</a></li>
  <li><a href="appointment.jsp">Appointments</a></li>
  <li><a href="#jobs">Jobs</a></li>  
</ul>
</section> 
  <h1>Welcome</h1>
<p>To the state's largest hospital at Edison, NJ. We care for you and your family</p>
<p>The new patient portal allows you to make appointments, get prescription, view your reports and with many more facilites</p>
</article>

<footer>We care for you</footer>

</div>

</body>
</html>
