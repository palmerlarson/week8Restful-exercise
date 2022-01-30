<%@include file="taglib.jsp"%>
<c:set var="title" value="Search Results" />
<%@include file="head.jsp"%>
<script type="text/javascript" class="init">
    $(document).ready( function () {
        $("#userTable").DataTable();
    } );
</script>
<html>
<body>
<div class="container-fluid">
    <h2>Search Results: </h2>
    <table id="userTable" class="display" cellspacing="0" width="100%">
        <thead>
            <th>Name</th>
            <th>User Name</th>
            <th>Age</th>
        </thead>
        <tbody>
            <c:forEach var="user" items="${users}">
            <tr>
                <td>Name: ${user.firstName} ${user.lastName}</td>
                <td>Username: ${user.userName}</td>
                <td>Age: ${user.age}</td>
            </tr>
            </c:forEach>
        </tbody>
    </table>
</div>

</body>
</html>
