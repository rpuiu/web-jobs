(function() {
    'use strict';

    angular.module('app')
        .controller('UserController', UserController);

    UserController.$inject = ['$http'];

    function UserController($http) {
        console.log("UserController.");
    }

})();