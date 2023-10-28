<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

        <!DOCTYPE html>
        <html>

        <head>
            <meta charset="UTF-8">
            <title>Informações do Médico</title>
            <style>
                li {
                    font-family: Helvetica;
                    padding-top: 7px;
                }

                #container {
                    background-color: rgb(64, 64, 64);
                    margin: 10px;
                    font-family: Arial, Helvetica, sans-serif;
                    display: block;
                    width: 500px;
                    border-radius: 20px;
                    border: solid 1px black;
                    padding: 10px;
                    color: white;
                }

                h2 {
                    color: rgb(225, 122, 12);
                    text-align: center;
                }

                input {
                    width: 400px;
                }
            </style>
        </head>

        <body>
            <div id="container">
                <h2>Informações do médico responsável</h2>

                <ul>
                    <li>Nome:</li>
                    <input value="${medicoNome}" disabled>

                    <li>Idade:</li>
                     <input value="${medicoIdade}" disabled>

                    <li>Especialidade:</li>
                    <input value="${medicoEspecialidade}" disabled>

                    <li>CRP:</li>
                    <input value="${medicoCrp}" disabled>
                </ul>
            </div>
        </body>

        </html>