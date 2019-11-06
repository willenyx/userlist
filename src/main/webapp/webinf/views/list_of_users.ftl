<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <title>HTML5 Contact Form</title>
    <link rel="stylesheet" media="screen"  >
    <title>Title</title>
</head>
<body>
<h1>Users list</h1>

<table class="tableSubHeadingColor">
    <tr>
        <th>Status</th>
        <th>Name</th>
        <th>Address</th>
        <th>Email</th>
        <th>Password</th>
        <th>Age</th>
    </tr>
    <#list users as user>
        <tr>
            <td>${user.status}</td>
            <td>${user.name}</td>
            <td>${user.address}</td>
            <td>${user.email}</td>
            <td>${user.password}</td>
            <td>${user.age}</td>
        </tr>
    </#list>
</table>


</body>
</html>