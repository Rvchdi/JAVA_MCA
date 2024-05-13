<%@page language="java" contentType="text/html; charset=UTF-8"
        isELIgnored="false" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html lang="en">

<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Create your account</title>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="../resources/assets/vendor/bootstrap/css/bootstrap.min.css">
        <link href="../resources/assets/vendor/fonts/circular-std/style.css" rel="stylesheet">
        <link rel="stylesheet" href="../resources/assets/libs/css/style.css">
        <link rel="stylesheet" href="../resources/assets/vendor/fonts/fontawesome/css/fontawesome-all.css">
    <style>
    html,
    body {
        height: 100%;
    }

    body {
        display: -ms-flexbox;
        display: flex;
        -ms-flex-align: center;
        align-items: center;
        padding-top: 40px;
        padding-bottom: 40px;
    }
    </style>
</head>
<!-- ============================================================== -->
<!-- signup form  -->
<!-- ============================================================== -->

<body>
    <!-- ============================================================== -->
    <!-- signup form  -->
    <!-- ============================================================== -->
    <form class="splash-container" method="post" action="<c:url value ='/client/add'/>">
        <div class="card">
            <div class="card-header">
                <h3 class="mb-1">Registrations Form</h3>
                <p>Please enter your user information.</p>
            </div>
            <div class="card-body">
                <div class="form-group">
                    <input class="form-control form-control-lg" type="text" name="name" required="" placeholder="Username" autocomplete="off">
                </div>
                <div class="form-group">
                    <input class="form-control form-control-lg" type="text" name="cin" required="" placeholder="CIN" autocomplete="off">
                </div>
                <div class="card-body p-0 border-top">
                    <h5>Birth date</h5>
                    <div class="form-group">
                        <div class="input-group date" id="datetimepicker4" data-target-input="nearest">
                            <input type="text" name="birthdate" class="form-control datetimepicker-input" data-target="#datetimepicker4" />
                            <div class="input-group-append" data-target="#datetimepicker4" data-toggle="datetimepicker">
                                <div class="input-group-text"><i class="far fa-calendar-alt"></i></div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="form-group">
                                    <input class="form-control form-control-lg" type="text" name="address" required="" placeholder="Address" autocomplete="off">
                </div>
                <div class="form-group">
                    <input class="form-control form-control-lg" type="email" name="email" required="" placeholder="E-mail" autocomplete="off">
                </div>
                <div class="form-group">
                    <input class="form-control form-control-lg" id="pass1" type="password" required="" placeholder="Password" name="pwd" autocomplete="off">
                </div>
                <div class="form-group pt-2">
                    <button class="btn btn-block btn-primary" type="submit">Register My Account</button>
                </div>
                <div class="form-group">
                    <label class="custom-control custom-checkbox">
                        <input class="custom-control-input" type="checkbox"><span class="custom-control-label">By creating an account, you agree the <a href="#">terms and conditions</a></span>
                    </label>
                </div>

            </div>
            <div class="card-footer bg-white">
                <p>Already member? <a href="#" class="text-secondary">Login Here.</a></p>
            </div>
        </div>
    </form>
    <script src="../resources/assets/vendor/jquery/jquery-3.3.1.min.js"></script>
    <script src="../resources/assets/vendor/bootstrap/js/bootstrap.bundle.js"></script>
    <script src="../resources/assets/vendor/slimscroll/jquery.slimscroll.js"></script>
    <script src="../resources/assets/libs/js/main-js.js"></script>
    <script src="../resources/assets/vendor/datepicker/moment.js"></script>
    <script src="../resources/assets/vendor/datepicker/tempusdominus-bootstrap-4.js"></script>
    <script src="../resources/assets/vendor/datepicker/datepicker.js"></script>
</body>


</html>