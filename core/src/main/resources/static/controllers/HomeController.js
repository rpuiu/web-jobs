(function() {
    'use strict';

    angular.module('app')
        .controller('HomeController', HomeController);

    HomeController.$inject = ['$http'];

    function HomeController($http) {
        console.log("HomeController.");
    }

})();