(function() {
    'use strict';

    angular.module('app')
        .controller('UserController', UserController );

    UserController.$inject = ['$http', '$scope'];

    function UserController($http, $scope) {
        console.log("UserController.");

        $scope.addUser = function(){
            var successCallBack = function(response){
                // success response found from server
            };

            var errorCallBack = function(response){
                // error response found from server
            };
                var data = {
                    personEntity: {
                        name: $scope.name,
                        surname: $scope.surname,
                        username: $scope.username,
                        phone: $scope.phone,
                        email: $scope.email
                    }
                };
                $http.post('/api/user/add', data).then(successCallBack, errorCallBack);
        };
    }

})();