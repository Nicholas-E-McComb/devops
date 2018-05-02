/**
 * 
 */
window.onLoad = function(){
	document.getElementById("sButton").addEventListener("click", getUsername);
}

function getSomeText(){
	let user = document.getElementById("username");
	let disUser = document.getElementById("displayUser");
	let xmlh = new XMLHttpRequest();
	if((xmlh.readyState == 4) & (xmlh.status == 200)){
		console.log(xmlh.responseText);
	}
	xmlh.open("POST", "http://localhost:8080/ProjectOne/Frontcontroller.ajax?user=" + user);
	xmlh.send();
}