
var cur = 0;
var arr = [];
var count = 0;
var no = 0;

var child2 = document.querySelector(".child2");
var span1 = document.querySelector("#span1");
var span2 = document.querySelector("#span2");
var next = document.querySelector("#next");

var newDiv = document.createElement('div');
newDiv.className = "questions";

async function fetching(){
    const response = await fetch("http://localhost:9090/api/Java/all");
    arr = await response.json();
    span2.textContent = arr.length
    display();
}

fetching();

next.addEventListener('click',function(){
    display();
})

function display(){
    if(cur >= arr.length){

        localStorage.setItem("Result",count)
        count=0;
        window.location.replace("result.html")
    }
    else{
        var data = arr[cur];
        cur++;

        span1.textContent = cur;

        var ques = data.question
        var ans = data.answer;
        var options = data.option;

        newDiv.innerHTML = ``;
        no = 0;
        
        newDiv.innerHTML = `
          <h1>${ques}</h1>
        `

        child2.appendChild(newDiv);

        options.forEach(options => {
            var a1 = document.createElement('button');
            a1.textContent = options.type;
            // a1.className = 'ansButton';

            a1.addEventListener('click',function(){
                var ans1 = a1.textContent;
            
            if(ans1 === ans) count++;

            display();
            })

            newDiv.appendChild(a1);
            
        });

        // child2.appendChild(newDiv);

        // var a = document.querySelector(".but0");
        // var b = document.querySelector(".but1");
        // var c = document.querySelector(".but2");
        // var d = document.querySelector(".but3");

        // a.addEventListener('click',function(){
        //     var ans1 = a.textContent;
            
        //     if(ans1 === ans) count++;

        //     display();
        // })

        // b.addEventListener('click',function(){
        //     var ans2 = b.textContent;
        //     if(ans2 === ans) count++;

        //     display();
        // })

        // c.addEventListener('click',function(){
        //     var ans3 = c.textContent;
        //     if(ans3 === ans) count++;

        //     display();
        // })

        // d.addEventListener('click',function(){
        //     var ans4 = d.textContent;
        //     if(ans4 === ans) count++;

        //     display();
        // })
    }

}

