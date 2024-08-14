<%--
  Created by IntelliJ IDEA.
  User: chaoc
  Date: 8/14/24
  Time: 4:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<form action="${pageContext.request.contextPath}/login" method="post">
    <div class="form-group mt-20">
        <label>Email address</label>
        <input id="email" name="username" type="email" class="form-control" required>
    </div>
    <div class="form-group mt-10">
        <label>Password</label>
        <input id="password" name="password" type="password" class="passInput form-control" required>
    </div>
    <div class="remember-forgot d-flex justify-content-between mt-10">
        <div class="form-group d-flex">
            <div class="checkbox_wrapper">
                <input class="check-box" id="check1" type="checkbox">
                <label for="check1"><span class="check_span">Remember Me</span></label>
            </div>
        </div>
        <div class="forget-pw">
            <a href="forgot-password.jsp">Forgot your password?</a>
        </div>
    </div>
    <div class="table-btn mt-20 align-center">
        <button class="cmn-btn btn-md">Continue</button>
    </div>
</form>
