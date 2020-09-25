function callGreet() {
	greet();
}

function changeColor(){
	
	var colors=["red","blue","green","olive","lightblue","magenta","orange","seagreen"];
	
	//alert(Math.round(Math.random()*10));
	document.getElementById("t").style.color=colors[Math.round(Math.random()*10)];
}