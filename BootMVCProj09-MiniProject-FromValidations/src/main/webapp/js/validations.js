
function validation(frm){
	// empty the error message
	document.getElementById("enameErr").innerHTML="";
	document.getElementById("jobErr").innerHTML="";
	document.getElementById("salErr").innerHTML="";
	//read form data
	let ename=frm.ename.value;
	let job=frm.job.value;
	let sal=frm.sal.value;
	   let flag = true;
	   // form validation(client side)
	   if(ename==""){  // ename required rule
		   document.getElementById("enameErr").innerHTML="employee name is mandatory(cs)";
		   flag=false;
	   }
	   else if(ename.length>10){
		   document.getElementById("enameErr").innerHTML="employee name must have max of 10 chrs(cs)";
		   flag=false;
	   }
	   if(job==""){//job required rule
	   document.getElementById("jobErr").innerHTML="employee desg is required(cs)";
	   flag=false;
	   }
	   else if(job.length>9){
		   // job maxlength rule
		   document.getElementById("jobErr").innerHTML="employee desg can have max  characters(cs)";
		  flag=false;
	   }
	   if(sal==""){ // sal required
		   document.getElementById("salErr").innerHTML="employee salary is required(cs)";
		   flag=false;
	   }
	   else if(isNaN(sal)){ // sal must be numeric value
	   document.getElementById("salErr").innerHTML="employee salary must numeric value(cs)";
	   flag=false;
		   }
		   else if(sal<0||sal>100000){ // sal-range rule
		   document.getElementById("salErr").innerHTML="employee salary must be in the range 1 through 10000000(cs)";
		   flag=false;
		   }
		   // change vflag value to "yes" indicating client side from validations are done
		   frm.vflag.value="no";
		   
		   return flag;   
		   }