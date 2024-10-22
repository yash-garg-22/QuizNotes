var nam = document.querySelector("#names");
var user = document.querySelector("#username");
var pass = document.querySelector("#password");

function data(){
    var name = nam.value;
    var username = user.value;
    var password = pass.value;

    if(name === '' || username === '' || password === '') alert("Information can't be empty")
    else{
        var obj = {
            "name" : name,
            "username": username,
            "password": password
        }
    
        var json = JSON.stringify(obj);
    
        fetch("http://localhost:9090/api/register_details",{
            method: 'Post',
            headers: {
                "Content-Type": "application/json"
            },
            body: json
        })
        .then(response => {return response.json()})
        .then(data => {
            if(data === false) alert("User Already Exists")
            else window.location.replace("index.html");
        })
}

    
}