$(document).ready(function () {
//  alert("Hola Mundo");  
    var input = $('.validate-input .input100');
    $("#login").click((e) => {
        let user = $("#user").val();
        let pass = $("#pass").val();
        //console.log(user);
        //console.log(pass);
        let opc = 1;//Declarar
        $.post("../GestionarLogin", /*Capturo Url Servlet*/ {user, pass, opc}/*Datos*/, (reponse) => {/*Respuesta deñ Servidor*//*ajax*/
            if (user === "" || pass === "") {
                showValidate(input);
            } else {
                if (reponse === "logeado") {
                    successMessage();
                    console.log(reponse);
                } else {
                    errorMessage();
                    console.log(reponse);
                }

            }


        })
        e.preventDefault();

    })
    const Toast = Swal.mixin({
        toast: true,
        position: 'top-end',
        showConfirmButton: false,
        timer: 5000
    });
    function successMessage() {
        Toast.fire({
            icon: 'success',
            title: 'Bienvenido'
        })
    }
    function errorMessage() {
        Toast.fire({
            icon: 'error',
            title: 'Datos Erroneos'
        })
    }
//Validar Datos
    function showValidate(input) {
        var thisAlert = $(input).parent();

        $(thisAlert).addClass('alert-validate');
    }
})
