<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/html" xmlns="http://www.w3.org/1999/html">
<head>
    <meta charset="utf-8">
    <title>HTML5 Contact Form</title>
    <link rel="stylesheet" media="screen"  href="styles.css">
    <style>:-moz-placeholder {
        color: blue;
    }
    .registry_form input:focus, .registry_form textarea:focus { /* add this to the already existing style */
        padding-right:70px;
    }
    .registry_form input, .registry_form textarea { /* add this to the already existing style */
        -moz-transition: padding .25s;
        -webkit-transition: padding .25s;
        -o-transition: padding .25s;
        transition: padding .25s;
    }
    *:focus {outline: azure;}
    ::-webkit-input-placeholder {
        color: blue;
    }
    header {font: 30px/21px "Laucida Sans", "Lucida Grande", "Lucida Sans Unicode", sans-serif;}
    body {font: 14px/21px "Lucida Sans", "Lucida Grande", "Lucida Sans Unicode", sans-serif;}
    .registry_form h2, .registry_form label {font-family:Arial LatArm, Times, "Times New Roman", serif;}
    .form_hint, .required_notification {font-size: 11px;}
    .registry_form ul {
        width:750px;
        list-style-type:none;
        list-style-position:outside;
        margin:0px;
        padding:0px;
    }
    .registry_form li{
        padding:12px;
        border-bottom:1px solid #eee;
        position:relative;
    }
    .registry_form li:first-child, .registry_form li:last-child {
        border-bottom:1px solid #777;
    }
    .registry_form h2 {
        margin:0;
        display: inline;
    }
    .required_notification {
        color:#d45252;
        margin:5px 0 0 0;
        display: inline-block;
    }
    .registry_form label {
        width:150px;
        margin-top: 3px;
        display:inline-block;
        float:left;
        padding:3px;
    }
    .registry_form input {
        height:20px;
        width:220px;
        padding:5px 8px;
    }
    .registry_form textarea {padding:8px; width:300px;}
    .registry_form button {margin-left:156px;}
    .registry_form input, .contact_form textarea {
        border:1px solid #aaa;
        box-shadow: 0px 0px 3px #ccc, 0 10px 15px #eee inset;
        border-radius:2px;
    }
    .registry_form input:focus, .registry_form textarea:focus {
        background: #fff;
        border:1px solid #555;
        box-shadow: 0 0 3px #aaa;
    }
    /* Button Style */
    button.registry {
        background-color: #67b192;
        background: -webkit-gradient(linear, left top, left bottom, from(#2842b1), to(#219175));
        background: -webkit-linear-gradient(top, #5eb1aa, #3a9164);
        background: -moz-linear-gradient(top, #4ab1a5, #4a9178);
        background: -ms-linear-gradient(top, #58b19c, #27916d);
        background: -o-linear-gradient(top, #5bb181, #2f917e);
        background: linear-gradient(top, #50b181, #4d9186);
        border: 1px solid #3f9191;
        border-bottom: 1px solid #329099;
        border-radius: 3px;
        -webkit-border-radius: 3px;
        -moz-border-radius: 3px;
        -ms-border-radius: 3px;
        -o-border-radius: 3px;
        box-shadow: inset 0 1px 0 0 #9fd574;
        -webkit-box-shadow: 0 1px 0 0 #9fd574 inset ;
        -moz-box-shadow: 0 1px 0 0 #9fd574 inset;
        -ms-box-shadow: 0 1px 0 0 #9fd574 inset;
        -o-box-shadow: 0 1px 0 0 #9fd574 inset;
        color: white;
        font-weight: bold;
        padding: 6px 20px;
        text-align: center;
        text-shadow: 0 -1px 0 #396715;
    }

    button.registry:hover{
        opacity: 85;
        cursor: pointer;
    }

    button.registry:active {
        border: 1px solid #457f91;
        box-shadow: 0 0 10px 5px #203d6b inset;
        -webkit-box-shadow:0 0 10px 5px #51416b inset ;
        -moz-box-shadow: 0 0 10px 5px #2b446b inset;
        -ms-box-shadow: 0 0 10px 5px #2b3b6b inset;
        -o-box-shadow: 0 0 10px 5px #2e356b inset;
    }
    .registry_form input, .registry_form textarea {
        padding-right:30px;
    }
    ::-webkit-validation-bubble-message {
        padding: 1em;
    }
    .registry_form input:focus:invalid, .registry_form textarea:focus:invalid { /* when a field is considered invalid by the browser */
        background: #fff  no-repeat 98% center;
        box-shadow: 0 0 5px #d45252;
        border-color: #b03535
    }
    input:required, textarea:required {
        background: #fff  no-repeat 98% center;
    }
    .registry_form input:required:valid, .registry_form textarea:required:valid { /* when a field is considered valid by the browser */
        background: #fff  no-repeat 98% center;
        box-shadow: 0 0 5px #5cd053;
        border-color: #28921f;
    }
    .form_hint {
        background: #d45252;
        border-radius: 3px 3px 3px 3px;
        color: white;
        margin-left:8px;
        padding: 1px 6px;
        z-index: 999; /* hints stay above all other elements */
        position: absolute; /* allows proper formatting if hint is two lines */
        display: none;
    }
    .form_hint::before {
        content: "\25C0"; /* треугольник, указующий влево, в  escaped unicode */
        color:#d45252;
        position: absolute;
        top:1px;
        left:-6px;
    }
    .registry_form input:focus + .form_hint {display: inline;}
    .registry_form input:required:valid + .form_hint {background: #28921f;} /* change form hint color when valid */
    .registry_form input:required:valid + .form_hint::before {color:#28921f;} /* change form hint arrow color when valid */
    </style>
</head>

<form class="registry_form" action="" method="post" name="registry_form">
    <ul>
        <li>
            <h1>Registration Page</h1>
            <span class="required_notification">Please fill the blank below</span>
        </li>
        <li >
            <label for="name">Name:</label>
            <input type="name" name="name" placeholder="Sebastian" required="">
        </li>
        <li >
            <label for="surname">Surname: </label>
            <input type="text" name="surname" placeholder="Fonte" required="">
        </li>
        <li >
            <label for="email">Email:   </label>
            <input type="email" name="email" placeholder="jonatan_livingstone@example.com" required="">
        </li>
        <li>
            <label for="password">Password:</label>
            <input type="password" name="password" placeholder="*******" required="">

        </li>
        <li>
            <a href=list_of_users.ftl><button class="registry" type="button" >Registry</button></a>
        </li>
    </ul>
</form>
<body>
</body>
</html>