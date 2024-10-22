var score = document.querySelector("#scoreR");
var des = document.querySelector("#final");
var returns = document.querySelector(".return");

var temp = localStorage.getItem("Result")
score.textContent = temp;

if(temp <= 2) des.textContent = "Need To Work Hard"
else if(temp < 5) des.textContent = "Need More Revison"
else if(temp < 8) des.textContent = "Good Work"
else des.textContent = "Excellent.. Keep It Up..."

returns.addEventListener('click',function(){
    window.location.replace("welcome.html")
})

