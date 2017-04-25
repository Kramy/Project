/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


$(document).ready(function() {

    $("#volver").click(function() {
        $.ajax({
            type: "GET",
            url: window.requestContextPath + "/login.htm",
            success: function(data) {
                $(".cuerpo").html(data);
            },
            error: function(ob,errStr) {
//              alert('Error al cargar registro.' + ob + " ---- " + errStr);
            }
        });
    });

});