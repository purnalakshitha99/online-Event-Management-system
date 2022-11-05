<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>
<h1>Registration</h1>

<form action ="RegistrationServlet" method = "post">

<!-- <section class="vh-100" style="background-color: #eee;"> -->
<!--   <div class="container h-100"> -->
<!--     <div class="row d-flex justify-content-center align-items-center h-100"> -->
<!--       <div class="col-lg-12 col-xl-11"> -->
<!--         <div class="card text-black" style="border-radius: 25px;"> -->
<!--           <div class="card-body p-md-5"> -->
<!--             <div class="row justify-content-center"> -->
<!--               <div class="col-md-10 col-lg-6 col-xl-5 order-2 order-lg-1"> -->

<!--                 <p class="text-center h1 fw-bold mb-5 mx-1 mx-md-4 mt-4">Sign up</p> -->

<!--                 <form class="mx-1 mx-md-4"> -->

<!--                   <div class="d-flex flex-row align-items-center mb-4"> -->
<!--                     <i class="fas fa-user fa-lg me-3 fa-fw"></i> -->
<!--                     <div class="form-outline flex-fill mb-0"> -->
<!--                       <input type="text" id="form3Example1c" class="form-control" name = "username"/> -->
<!--                       <label class="form-label" for="form3Example1c">Your Name</label> -->
<!--                     </div> -->
<!--                   </div> -->

<!--                   <div class="d-flex flex-row align-items-center mb-4"> -->
<!--                     <i class="fas fa-envelope fa-lg me-3 fa-fw"></i> -->
<!--                     <div class="form-outline flex-fill mb-0"> -->
<!--                       <input type="password" id="form3Example3c" class="form-control" name ="pass" /> -->
<!--                       <label class="form-label" for="form3Example3c">your password</label> -->
<!--                     </div> -->
<!--                   </div> -->

<!--                   <div class="d-flex flex-row align-items-center mb-4"> -->
<!--                     <i class="fas fa-lock fa-lg me-3 fa-fw"></i> -->
<!--                     <div class="form-outline flex-fill mb-0"> -->
<!--                       <input type="text" id="form3Example4c" class="form-control" name = "role" /> -->
<!--                       <label class="form-label" for="form3Example4c">Role</label> -->
<!--                     </div> -->
<!--                   </div> -->

<!--                   <div class="d-flex flex-row align-items-center mb-4"> -->
<!--                     <i class="fas fa-key fa-lg me-3 fa-fw"></i> -->
<!--                     <div class="form-outline flex-fill mb-0"> -->
<!--                       <input type="text" id="form3Example4cd" class="form-control" name = "address" /> -->
<!--                       <label class="form-label" for="form3Example4cd">address</label> -->
<!--                     </div> -->
<!--                   </div> -->
<!--                   <div class="d-flex flex-row align-items-center mb-4"> -->
<!--                     <i class="fas fa-key fa-lg me-3 fa-fw"></i> -->
<!--                     <div class="form-outline flex-fill mb-0"> -->
<!--                       <input type="text" id="form3Example4cd" class="form-control" name ="city" /> -->
<!--                       <label class="form-label" for="form3Example4cd">city</label> -->
<!--                     </div> -->
<!--                   </div> -->
                  
<!--                   <div class="d-flex flex-row align-items-center mb-4"> -->
<!--                     <i class="fas fa-key fa-lg me-3 fa-fw"></i> -->
<!--                     <div class="form-outline flex-fill mb-0"> -->
<!--                       <input type="text" id="form3Example4cd" class="form-control" name = "fullname" /> -->
<!--                       <label class="form-label" for="form3Example4cd">full name</label> -->
<!--                     </div> -->
<!--                   </div> -->

<!--                   <div class="form-check d-flex justify-content-center mb-5"> -->
<!--                     <input class="form-check-input me-2" type="checkbox" value="" id="form2Example3c" /> -->
<!--                     <label class="form-check-label" for="form2Example3"> -->
<!--                       I agree all statements in <a href="#!">Terms of service</a> -->
<!--                     </label> -->
<!--                   </div> -->

<!--                   <div class="d-flex justify-content-center mx-4 mb-3 mb-lg-4"> -->
<!--                     <button type="submit" name = "submit"  class="btn btn-primary btn-lg">Register</button> -->
<!--                   </div> -->

<!--                 </form> -->

<!--               </div> -->
<!--               <div class="col-md-10 col-lg-6 col-xl-7 d-flex align-items-center order-1 order-lg-2"> -->

<!--                 <img src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-registration/draw1.webp" -->
<!--                   class="img-fluid" alt="Sample image"> -->

<!--               </div> -->
<!--             </div> -->
<!--           </div> -->
<!--         </div> -->
<!--       </div> -->
<!--     </div> -->
<!--   </div> -->
<!-- </section> -->

<!-- </form> -->

<table>
<form action ="RegistrationServlet" method = "post">


<tr>
	<td>UserName:</td>
	<td><input type = "text" name ="username" ></td>
</tr>
<tr>
	<td>Password:</td>
	<td><input type = "password" name ="pass" > </td>
</tr>
<tr>
	<td>Role:</td>
	<td><input type = "text" name ="role" ></td>
</tr>
<tr>
	<td>address:</td>
	<td><input type = "text" name ="address" ></td>
</tr>
<tr>
	<td>city:</td>
	<td><input type = "text" name ="city" ></td>
</tr>
<tr>
	<td>fullName:</td>
	<td><input type = "text" name ="fullname" ></td>
</tr>

</table>
<input type = "submit" name = "submit" value = "Register">



</form>
</body>
</html>