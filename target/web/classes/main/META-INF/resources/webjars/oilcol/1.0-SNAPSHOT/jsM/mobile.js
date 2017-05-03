function editarMarcapasos() {

    var idPaciente=document.getElementById('idPaciente').innerHTML;
    var s = idPaciente.split(" ");
    var nFrec =parseInt(document.getElementById('nFrec').value);
    console.log(typeof( nFrec));
    $.ajax({
        type: 'PUT',
        url: "http://localhost:9000/marcapasos2/"+s[0],
    data: JSON.stringify({
            "ritmoCardiaco":nFrec
        }),
        error: function(e) {
            console.log(e);
        },
        dataType: "json",
        contentType: "application/json"
    });
    window.setTimeout(window.location.href=window.location.href, 2000);
}/**
 * Created by Lady Pinzon on 30/04/2017.
 */

function prueba(){
    var url = window.location.href;
    console.log("la url: "+url);
    console.log(url.split("/"));
}

function enviarMensaje() {
    var idPaciente=document.getElementById('idPaciente').innerHTML;
    var idMedico=document.getElementById('nMedico').innerHTML;
    var s = idPaciente.split(" ");
    var m = idMedico.split(" ");
    var nMensaje =document.getElementById('nMensaje').value;
    var nFecha = new Date().getTime();
    var nDieta ="";
    var nActividad ="";
    var nMedicamento ="";
    var url = window.location.href;
    var padre = url.split("/")[2];
    $.ajax({
        type: 'POST',
        url: "http://"+padre+"/mensajes/"+s[0]+"&"+m[0],
        data: JSON.stringify({
            "mensaje":nMensaje,
            "fecha":nFecha,
            "dieta":nDieta,
            "actividadFisica":nActividad,
            "medicamentos":nMedicamento
        }),
        error: function(e) {
            console.log(e);
        },
        dataType: "json",
        contentType: "application/json"
    });
    window.setTimeout(window.location.href=window.location.href, 2000);
}
function agendarCita() {

    var idPaciente=document.getElementById('nIdPaciente').value;
    var idMedico=document.getElementById('nMedico').innerHTML;

    nFecha = new Date().getTime();


    $.ajax({
        type: 'POST',
        url: "http://localhost:9000/app/agendarCita/"+idPaciente+"&"+idMedico,
        data: JSON.stringify({
            "diagnostico": "",
            "fecha":nFecha,
        }),
        error: function(e) {
            console.log(e);
        },
        dataType: "json",
        contentType: "application/json"
    });
    // window.setTimeout(window.location.href=window.location.href, 2000);
}
/**
 * Created by Lady Pinzon on 30/04/2017.
 */
