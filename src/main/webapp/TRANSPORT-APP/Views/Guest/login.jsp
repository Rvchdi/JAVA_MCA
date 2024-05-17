<%@page language="java" contentType="text/html; charset=UTF-8"
        isELIgnored="false" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html lang="en">

<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Log into your account</title>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="../resources/assets/vendor/bootstrap/css/bootstrap.min.css">
    <link href="../resources/assets/vendor/fonts/circular-std/style.css" rel="stylesheet">
    <link rel="stylesheet" href="../resources/assets/libs/css/style.css">
    <link rel="stylesheet" href="../resources/assets/vendor/fonts/fontawesome/css/fontawesome-all.css">

</head>

<body>
    <!-- ============================================================== -->
    <!-- login page  -->
    <!-- ============================================================== -->


    <div class="splash-container">
            <div class="card">
                <div class="card-header text-center"></a><span class="splash-description">Please enter your user information.</span></div>
                <div class="card-body">
                    <form method="post" action="<c:url value ='/client/login'/>">
                        <div class="form-group">
                            <input class="form-control form-control-lg" id="username" type="email" placeholder="E-mail" name="email" autocomplete="off">
                        </div>
                        <div class="form-group">
                            <input class="form-control form-control-lg" id="password" type="password" name="pwd" placeholder="Password">
                        </div>
                        <div class="form-group">
                            <label class="custom-control custom-checkbox">
                                <input class="custom-control-input" type="checkbox"><span class="custom-control-label">Remember Me</span>
                            </label>
                        </div>
                        <button type="submit" class="btn btn-primary btn-lg btn-block">Sign in</button>
                    </form>
                </div>
                <div class="card-footer bg-white p-0  ">
                    <div class="card-footer-item card-footer-item-bordered center-block">
                        <a href="#" class="footer-link">Create An Account</a></div>
                </div>
            </div>
        </div>









    <!-- ============================================================== -->
    <!-- end login page  -->
    <!-- ============================================================== -->
    <!-- Optional JavaScript -->
    <script src="../assets/vendor/jquery/jquery-3.3.1.min.js"></script>
    <script src="../assets/vendor/bootstrap/js/bootstrap.bundle.js"></script>
</body>

</html>