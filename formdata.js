function signup(){
    event.preventDefault();
    let uid=document.getElementById("uid").value;
    let uname=document.getElementById("uname").value;
    let pwd=document.getElementById("pwd").value;
    let cpwd=document.getElementById("cpwd").value;
    let mob=document.getElementById("mob").value;
    let email=document.getElementById("email").value;
    let gender=document.querySelector('input[name="gend"]:checked').value;
    console.log(gender)
    let skills=document.querySelectorAll('input[name="skill"]:checked')
    skills.forEach(e => {
        console.log(e.value)
    });
    let quali=document.getElementById("qual").value;
    let picture=document.getElementById("pic").value;
    let resume=document.getElementById("res").value;
    console.log(quali+"\n"+picture+"\n"+resume)

    console.log(uid+"\n"+uname+"\n"+pwd+"\n"+cpwd+"\n"+mob+"\n"+email+"\n"+gender+"\n"+quali+"\n"+picture+"\n"+resume)
    

    
    


}