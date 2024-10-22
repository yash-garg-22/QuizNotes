
    var uname = document.querySelector("#username");
    var pass = document.querySelector("#password");


    var login = () => {
    var username = uname.value;
    var password = pass.value;

    if(username ==="" || password === "") alert("Username And Password can't be Empty");
    else{
        var Registration = {
            "username": username,
            "password": password
        }
    
        var json = JSON.stringify(Registration);
            
            fetch("http://localhost:9090/api/getRegisterDetails",{
                method : 'Post',
                headers: {
                    'Content-Type': 'application/json',
            },
        body: json
        })
            .then(respone => {return respone.json()})
            .then(data => {
                if(data == true) window.location.replace("welcome.html");
                else alert("Incorrect Credentials");
            })
    }
    }