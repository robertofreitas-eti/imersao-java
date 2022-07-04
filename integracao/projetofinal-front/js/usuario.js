const urlLogin = "http://localhost:8080/login"


function efetuarLogin(){
    var data = {
        "email": document.getElementById('email').value,
        "senha": document.getElementById('senha').value
    }
//roberto@freitas.eti.br

    var envelope = new Request( urlLogin, {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(data)
    });

    fetch(envelope)
        .then(response => {
            
            if (response.ok) {
                return response.json();
            } else if (response.status === 401) {
                throw new Error('Não autorizado!');
            } else {
                throw new Error(`Error! status: ${response.status}`);
            }
        })
        .then(result => {
            localStorage.setItem("usuarioLogado", JSON.stringify(result));
            window.location = "principal.html"
        })
        .catch(err => {
            alert(err);
        });

}

function carregarUsuario(){
    var usuarioLogado = localStorage.getItem("usuarioLogado");
    
    if(usuarioLogado == null){
        window.location = "login.html";
    }
    else{

        //Desserializar o objeto JSON
        var objUsuario = JSON.parse(usuarioLogado);

        //Exibir a foto de perfil 
        document.getElementById("divFoto").innerHTML =
            "<img width='190' height='264' src=" + objUsuario.foto + " />";

        //Exibir as infos do usuário    
        document.getElementById("divDados").innerHTML = 
            "<h3>Nome: " + objUsuario.nome + "<br/>" +
            "Email: " + objUsuario.email + "<br/>" +
            "Id: " + objUsuario.id + "</h3><br/>" ;

    }


}