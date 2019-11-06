<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/html" xmlns="http://www.w3.org/1999/html" lang="en">
<head>
    <meta charset="utf-8">
    <title>HTML5 Contact Form</title>
    <link rel="stylesheet" media="screen"  >
    <style>:-moz-placeholder {
        color: blue;
    }
    .contact_form input:focus, .contact_form textarea:focus { /* add this to the already existing style */
        padding-right:70px;
    }
    .contact_form input, .contact_form textarea { /* add this to the already existing style */
        -moz-transition: padding .25s;
        -webkit-transition: padding .25s;
        -o-transition: padding .25s;
        transition: padding .25s;
    }
    *:focus {outline: azure;}
    ::-webkit-input-placeholder {
        color: blue;
    }
    body {font: 14px/21px "Lucida Sans", "Lucida Grande", "Lucida Sans Unicode", sans-serif;}
    .contact_form h2, .contact_form label {font-family:Georgia, Times, "Times New Roman", serif;}

    .contact_form ul {
        width:750px;
        list-style-type:none;
        list-style-position:outside;
    }
    .contact_form li{
        padding:12px;
        border-bottom:1px solid #eee;
        position:relative;
    }
    .contact_form li:first-child, .contact_form li:last-child {
        border-bottom:1px solid #777;
    }
    .contact_form h2 {
        margin:0;
        display: inline;
    }
    /*.required_notification {
        color:#d45252;
        margin:5px 0 0 0;
        display: inline-block;
    }*/
    .contact_form label {
        width:150px;
        margin-top: 3px;
        display:inline-block;
        float:left;
        padding:3px;
    }
    .contact_form input {
        height:20px;
        width:220px;
        padding:5px 8px;
    }
    .contact_form textarea {padding:8px; width:300px;}
    .contact_form button {margin-left:156px;}
    .contact_form input, .contact_form textarea {
        border:1px solid #aaa;
        box-shadow: 0px 0px 3px #ccc, 0 10px 15px #eee inset;
        border-radius:2px;
    }
    .contact_form input:focus, .contact_form textarea:focus {
        background: #fff;
        border:1px solid #555;
        box-shadow: 0 0 3px #aaa;
    }
    /* Button Style */
    button.submit {
        background-color: #68b12f;
        background: -webkit-gradient(linear, left top, left bottom, from(#68b12f), to(#50911e));
        background: -webkit-linear-gradient(top, #68b12f, #50911e);
        background: -moz-linear-gradient(top, #68b12f, #50911e);
        background: -ms-linear-gradient(top, #68b12f, #50911e);
        background: -o-linear-gradient(top, #68b12f, #50911e);
        background: linear-gradient(top, #68b12f, #50911e);
        border: 1px solid #509111;
        border-bottom: 1px solid #5b992b;
        border-radius: 3px;
        -webkit-border-radius: 3px;
        -moz-border-radius: 3px;
        box-shadow: inset 0 1px 0 0 #9fd574;
        -webkit-box-shadow: 0 1px 0 0 #9fd574 inset ;
        -moz-box-shadow: 0 1px 0 0 #9fd574 inset;
        -o-box-shadow: 0 1px 0 0 #9fd574 inset;
        color: white;
        font-weight: bold;
        padding: 6px 20px;
        text-align: center;
        text-shadow: 0 -1px 0 #396715;
    }
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
        box-shadow: inset 0 1px 0 0 #9fd574;
        -webkit-box-shadow: 0 1px 0 0 #9fd574 inset ;
        -moz-box-shadow: 0 1px 0 0 #9fd574 inset;
        -o-box-shadow: 0 1px 0 0 #9fd574 inset;
        color: white;
        font-weight: bold;
        padding: 6px 20px;
        text-align: center;
        text-shadow: 0 -1px 0 #396715;
    }
    button.submit:hover {
        opacity:.85;
        cursor: pointer;
    }
    button.registry:hover{
        opacity: 85;
        cursor: pointer;
    }
    button.submit:active {
        border: 1px solid #20911e;
        box-shadow: 0 0 10px 5px #356b0b inset;
        -webkit-box-shadow:0 0 10px 5px #356b0b inset ;
        -moz-box-shadow: 0 0 10px 5px #356b0b inset;
        -o-box-shadow: 0 0 10px 5px #356b0b inset;
    }
    button.registry:active {
        border: 1px solid #457f91;
        box-shadow: 0 0 10px 5px #203d6b inset;
        -webkit-box-shadow:0 0 10px 5px #51416b inset ;
        -moz-box-shadow: 0 0 10px 5px #2b446b inset;
        -o-box-shadow: 0 0 10px 5px #2e356b inset;
    }
    .contact_form input, .contact_form textarea {
        padding-right:30px;
    }
    ::-webkit-validation-bubble-message {
        padding: 1em;
    }
    .contact_form input:focus:invalid, .contact_form textarea:focus:invalid { /* when a field is considered invalid by the browser */
        background: #fff  no-repeat 98% center;
        box-shadow: 0 0 5px #d45252;
        border-color: #b03535
    }
    input:required, textarea:required {
        background: #fff  no-repeat 98% center;
    }
    .contact_form input:required:valid, .contact_form textarea:required:valid { /* when a field is considered valid by the browser */
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
    .contact_form input:focus + .form_hint {display: inline;}
    .contact_form input:required:valid + .form_hint {background: #28921f;} /* change form hint color when valid */
    .contact_form input:required:valid + .form_hint::before {color:#28921f;} /* change form hint arrow color when valid */
    </style>
</head>
<form class="contact_form" action="" method="post" name="contact_form">
    <ul>
        <li>
            <h1>Welcome</h1>
        </li>
        <li >
            <label for="email">Login:</label>
            <input type="email" name="email" placeholder="jonatan_livingstone@example.com" required="">
        </li>
        <li>
            <label for="password">Password:</label>
            <input type="text" placeholder="*******" required="">

        </li>
        <li>
<#--            <button class="submit" type="submit">Submit</button>-->
            <form>
                <a href=list_of_users.ftl><button class="submit" type="submit" >Submit</button></a>
            </form>
        </li>
        <li>
            <form>
                <a href=registry.ftl><button class="submit" type="button" >Registry</button></a>
            </form>
        </li>
    </ul>
</form>

<body>


</body>
</html>