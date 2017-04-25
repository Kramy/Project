/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


$(document).ready(function() {
    
    $("#registrar").click(function() {
        $.ajax({
            type: "GET",
            url: window.requestContextPath + "/registro.htm",
            success: function(data) {
                $(".login").html(data);
            },
            error: function(ob,errStr) {
//              alert('Error al cargar registro.' + ob + " ---- " + errStr);
            }
        });
    });
    
    $("#recuperar").click(function() {
        $.ajax({
            type: "GET",
            url: window.requestContextPath + "/recuperar.htm",
            success: function(data) {
                $(".login").html(data);
            },
            error: function(ob,errStr) {
//              alert('Error al cargar registro.' + ob + " ---- " + errStr);
            }
        });
    });
    
});