var app = angular.module('app', ['ngRoute','ngResource']);
app.config(function($routeProvider){
    $routeProvider
        .when('/history',{
            templateUrl: '/views/history.html',
            controller: 'historyController'
        })
        .otherwise(
            { redirectTo: '/'}
        );
});
