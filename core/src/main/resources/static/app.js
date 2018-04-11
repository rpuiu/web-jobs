(function (){
    'use strict';

  var app = angular.module('app', ['ngRoute']);
    
    app.config(['$routeProvider', function($routeProvider){
        $routeProvider
            .when('/', {
                templateUrl: '/views/test.html',
                controller: 'MainController.js'
            })
            .when('/history', {
                templateUrl: '/views/history.html',
                controller: 'HistoryController.js'
            })
            .otherwise({
                redirectTo: 'www.google.com'
            });
    }]);
    
})();