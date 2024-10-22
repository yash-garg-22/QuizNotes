var button = document.querySelector("#button");

var javanotes = document.querySelector("#javaimg");


button.addEventListener('click', function() {
    document.querySelector(".navigation").scrollIntoView({
        behavior: "smooth"
    })
});

var home = document.querySelector(".home");
var quiz = document.querySelector(".quiz");
var feed = document.querySelector(".topP");
var notes = document.querySelector(".notes");

var fbutton1 = document.querySelector(".fbutton1");


home.addEventListener('click',function(){
    document.querySelector(".child1").scrollIntoView({
        behavior: "smooth"
})})

quiz.addEventListener('click',function(){
    document.querySelector(".flexchild1 img").scrollIntoView({
        behavior: "smooth"
})})

feed.addEventListener('click',function(){
    document.querySelector(".feedback").scrollIntoView({
        behavior: "smooth"
})})

notes.addEventListener('click',function(){
    document.querySelector(".notesImage").scrollIntoView({
        behavior: "smooth"
})})

fbutton1.addEventListener('click',function(){
    window.location.replace("content.html")
})

javanotes.addEventListener('click',function(){
    window.location.href = "https://drive.google.com/file/d/1J3ps_6pfrd03WD7pWZv_YzZyJHZXNR_C/view?usp=sharing"
})
