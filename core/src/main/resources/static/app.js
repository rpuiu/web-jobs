(function (){
    'use strict';

    var app = angular.module("app", ["ngRoute"]);
    
    app.config(function($routeProvider, $locationProvider) {
        $routeProvider
        .when("/", {
            templateUrl: "views/home.html",
            controller: "HomeController",
            controllerAs: "home"
        })
        .when("/history", {
            templateUrl: "views/history.html",
            controller: "HistoryController",
            controllerAs: "history"
        })
        .when("/user", {
            templateUrl: "views/user.html",
            controller: "UserController",
            controllerAs: "user"
        })
        .otherwise({
            redirectTo: "/"
        })
        
        $locationProvider.html5Mode(true);
    });
})();