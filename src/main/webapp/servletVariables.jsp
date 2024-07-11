<%@ page import="org.example.exercices_jee.Person" %>
<jsp:useBean id="people" type="java.util.ArrayList<org.example.exercices_jee.Person>" scope="request"/>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Variables</title>
    <%@ include file="/WEB-INF/boostrap.html" %>
</head>
<body>
<h1>Tableau des personnes</h1>

<div class="container">
    <table class="table">
        <thead>
        <tr>
            <th scope="col">Firstname</th>
            <th scope="col">Lastname</th>
            <th scope="col">Age</th>
        </tr>
        </thead>
        <tbody>
        <% for (Person p: people) { %>
        <tr>
            <td>            <%= p.getFirstname() %></td>
            <td>            <%= p.getLastname() %></td>
            <td>            <%= p.getAge() %> ans</td>
        </tr>
        <% } %>
        </tbody>
    </table>
</div>

</body>
</html>
