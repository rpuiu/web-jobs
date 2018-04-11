(function (){
    'use strict';

var app = angular.module("app", ["ngRoute"]);
app.config(function($routeProvider) {
    $routeProvider
    .when("/", {
        templateUrl : "views/green.html",
        controller: "HistoryController"
    })
    .when("/red", {
        templateUrl : "views/red.html",
        controller: "MainController"
    })
});
})();